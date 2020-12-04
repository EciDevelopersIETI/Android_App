package co.com.eci.ieti.kingboo.ui.misReservasProveedor;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import co.com.eci.ieti.kingboo.R;
import co.com.eci.ieti.kingboo.adapter.Adapter;

public class MisReservasProveedorFragment extends Fragment {

    RecyclerView recyclerView;
    List<MisReservasProveedor> misReservasProveedor;
    private static String URL= "https://kingboooback.herokuapp.com/reservas/provider/Luis%20Shop";
    Adapter adapter;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_misreservasproveedor, container, false);

        recyclerView = (RecyclerView) root.findViewById(R.id.reservaslista);
        misReservasProveedor = new ArrayList<>();

        extractorReservas();


        return root;
    }

    private void extractorReservas() {
        RequestQueue queue = Volley.newRequestQueue(getActivity());
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, URL, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                for (int i = 0; i < response.length(); i++) {
                    try {
                        JSONObject reservaObject = response.getJSONObject(i);
                        MisReservasProveedor mp = new MisReservasProveedor();
                        mp.setIdReserva(reservaObject.getString("reservaId").toString());
                        mp.setFechaReserva(reservaObject.getString("fecha").toString());
                        mp.setHoraReserva(reservaObject.getString("hora").toString());
                        mp.setClienteReserva("fernan");
                        mp.setServiciosReserva(reservaObject.getString("servicios").toString());
                        mp.setComentarioReserva("comentario");
                        mp.setEncargadoReserva("carlos");
                        misReservasProveedor.add(mp);
                    } catch (JSONException jsonException) {
                        jsonException.printStackTrace();
                    }
                }
                recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
                adapter = new Adapter(getActivity(),misReservasProveedor);
                recyclerView.setAdapter(adapter);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("tag","onErrorResponse"+error.getMessage());
            }
        });
        queue.add(jsonArrayRequest);
    }
}