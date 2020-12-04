package co.com.eci.ieti.kingboo;

public class RegistrarData {
    String usuario, email, pass, telefono;

    public RegistrarData(){

    }

    public RegistrarData(String usuario, String email, String pass, String telefono) {
        this.usuario = usuario;
        this.email = email;
        this.pass = pass;
        this.telefono = telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
