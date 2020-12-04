package co.com.eci.ieti.kingboo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import co.com.eci.ieti.kingboo.R;
import co.com.eci.ieti.kingboo.ui.misReservasProveedor.MisReservasProveedor;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{

    LayoutInflater inflater;
    List<MisReservasProveedor> reservasProveedor;

    public Adapter (Context context, List<MisReservasProveedor> reservasProveedor){
        this.inflater = LayoutInflater.from(context);
        this.reservasProveedor = reservasProveedor;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.misreservasproveedor,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.idReserva.setText(reservasProveedor.get(position).getIdReserva());
        holder.fechaReserva.setText(reservasProveedor.get(position).getFechaReserva());
        holder.horaReserva.setText(reservasProveedor.get(position).getHoraReserva());
        holder.servicioReserva.setText(reservasProveedor.get(position).getServiciosReserva());
        holder.clienteReserva.setText(reservasProveedor.get(position).getClienteReserva());
        holder.comentarioReserva.setText(reservasProveedor.get(position).getComentarioReserva());

    }

    @Override
    public int getItemCount() {
        return reservasProveedor.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView idReserva,fechaReserva,horaReserva, servicioReserva,clienteReserva,comentarioReserva;
        EditText encargadoReserva;
        Button editarEncargadoButton,enviarDatosButton;

        public ViewHolder(@NonNull View itemView){
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

    }

}