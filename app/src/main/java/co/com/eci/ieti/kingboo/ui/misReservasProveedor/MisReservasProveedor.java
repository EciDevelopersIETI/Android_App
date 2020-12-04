package co.com.eci.ieti.kingboo.ui.misReservasProveedor;

public class MisReservasProveedor {
    private String idReserva;
    private String fechaReserva;
    private String horaReserva;
    private String serviciosReserva;
    private String clienteReserva;
    private String comentarioReserva;
    private String encargadoReserva;

    public MisReservasProveedor(){}

    public MisReservasProveedor(String idReserva, String fechaReserva, String horaReserva, String serviciosReserva, String clienteReserva, String comentarioReserva, String encargadoReserva) {
        this.idReserva = idReserva;
        this.fechaReserva = fechaReserva;
        this.horaReserva = horaReserva;
        this.serviciosReserva = serviciosReserva;
        this.clienteReserva = clienteReserva;
        this.comentarioReserva = comentarioReserva;
        this.encargadoReserva = encargadoReserva;
    }

    public String getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public String getHoraReserva() {
        return horaReserva;
    }

    public void setHoraReserva(String horaReserva) {
        this.horaReserva = horaReserva;
    }

    public String getServiciosReserva() {
        return serviciosReserva;
    }

    public void setServiciosReserva(String serviciosReserva) {
        this.serviciosReserva = serviciosReserva;
    }

    public String getClienteReserva() {
        return clienteReserva;
    }

    public void setClienteReserva(String clienteReserva) {
        this.clienteReserva = clienteReserva;
    }

    public String getComentarioReserva() {
        return comentarioReserva;
    }

    public void setComentarioReserva(String comentarioReserva) {
        this.comentarioReserva = comentarioReserva;
    }

    public String getEncargadoReserva() {
        return encargadoReserva;
    }

    public void setEncargadoReserva(String encargadoReserva) {
        this.encargadoReserva = encargadoReserva;
    }
}
