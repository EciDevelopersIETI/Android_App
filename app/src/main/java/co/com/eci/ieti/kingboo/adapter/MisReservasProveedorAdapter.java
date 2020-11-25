package co.com.eci.ieti.kingboo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.List;

import co.com.eci.ieti.kingboo.ui.misReservasProveedor.MisReservasProveedor;

public class MisReservasProveedorAdapter extends RecyclerView.Adapter<MisReservasProveedorAdapter.ViewHolder> {
    private List<MisReservasProveedor> nData;
    private LayoutInflater mInflater;
    private Context context;

    public MisReservasProveedorAdapter(List<MisReservasProveedor> itemList, Context context){
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
        this.nData = itemList;
    }

    @Override
    public int getItemCount(){
        return nData.size();
    }

    @Override
    public MisReservasProveedorAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = mInflater.inflate(co.com.eci.ieti.kingboo.R.layout.misreservasproveedor,null);
        return new MisReservasProveedorAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final MisReservasProveedorAdapter.ViewHolder holder, final int position){
        holder.bindData(nData.get(position));
    }

    public void setItems(List<MisReservasProveedor> items){
        nData = items;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView idReserva,fechaReserva,horaReserva, servicioReserva,clienteReserva,comentarioReserva;
        EditText encargadoReserva;
        Button editarEncargadoButton,enviarDatosButton;

        ViewHolder(View itemView){
            super(itemView);
            idReserva = itemView.findViewById(co.com.eci.ieti.kingboo.R.id.idreserva);
            fechaReserva = itemView.findViewById(co.com.eci.ieti.kingboo.R.id.fechareserva);
            horaReserva = itemView.findViewById(co.com.eci.ieti.kingboo.R.id.horareserva);
            servicioReserva = itemView.findViewById(co.com.eci.ieti.kingboo.R.id.serviciosreserva);
            clienteReserva = itemView.findViewById(co.com.eci.ieti.kingboo.R.id.clientereserva);
            comentarioReserva = itemView.findViewById(co.com.eci.ieti.kingboo.R.id.comentarioreserva);

            encargadoReserva = itemView.findViewById(co.com.eci.ieti.kingboo.R.id.encargadoreserva);
            editarEncargadoButton = itemView.findViewById(co.com.eci.ieti.kingboo.R.id.buttonEditarEncargado);
            enviarDatosButton = itemView.findViewById(co.com.eci.ieti.kingboo.R.id.buttonEnviarDatos);
        }

        void bindData(final MisReservasProveedor item){
            idReserva.setText(item.getIdReserva());
            fechaReserva.setText(item.getFechaReserva());
            horaReserva.setText(item.getHoraReserva());
            servicioReserva.setText(item.getServiciosReserva());
            clienteReserva.setText(item.getClienteReserva());
            comentarioReserva.setText(item.getComentarioReserva());
            encargadoReserva.setText(item.getEncargadoReserva());
        }
    }
}
