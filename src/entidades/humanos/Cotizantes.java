package entidades.humanos;

public class Cotizantes {

    private String nombre;
    private String apellidos;
    private long documento;
    private long telefono;
    private String cuidadResidencia;
    private boolean isAprobado;  //no se
    private boolean isEmbargado;
    private boolean isInhabilitado;

    public Cotizantes(String nombre,String apellidos,long documento,long telefono, String cuidadResidencia, boolean isEmbargado, boolean isInhabilitado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.documento = documento;
        this.telefono = telefono;
        this.cuidadResidencia = cuidadResidencia;
        this.isAprobado = false;
        this.isEmbargado = isEmbargado;
        this.isInhabilitado = isInhabilitado;
    }

    public String getNombre() {
        return nombre;
    }public void setNombre(String nombre) {
        this.nombre = nombre;
    }public String getApellidos() {
        return apellidos;
    }public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }public long getDocumento() {
        return documento;
    }public void setDocumento(int documento) {
        this.documento = documento;
    }public long getTelefono() {
        return telefono;
    }public void setTelefono(int telefono) {
        this.telefono = telefono;
    }public String getCuidadResidencia() {
        return cuidadResidencia;
    }public void setCuidadResidencia(String cuidadResidencia) {
        this.cuidadResidencia = cuidadResidencia;
    }public boolean isEmbargado() {
        return isEmbargado;
    }public void setEmbargado(boolean embargado) {
        isEmbargado = embargado;
    }public boolean isAprobado() {
        return isAprobado;
    }public void setAprobado(boolean aprobado) {
        isAprobado = aprobado;
    }public boolean isInhabilitado() {
        return isInhabilitado;
    }public void setInhabilitado(boolean inhabilitado) {
        isInhabilitado = inhabilitado;
    }
}