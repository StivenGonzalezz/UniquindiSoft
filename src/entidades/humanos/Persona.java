package entidades.humanos;

public class Persona {
    private String nombre;
    private String apellidos;
    private long documento;
    private long telefono;
    private String cuidadResidencia;

    public Persona(String nombre,String apellidos,long documento,long telefono, String cuidadResidencia) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.documento = documento;
        this.telefono = telefono;
        this.cuidadResidencia = cuidadResidencia;

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
    }
}
