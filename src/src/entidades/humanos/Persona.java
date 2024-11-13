package src.entidades.humanos;

public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private long documento;
    private long telefono;
    private String cuidadResidencia;
    private boolean isDeclarador;

    public Persona(String nombre,String apellidos, int edad, long documento,long telefono, String cuidadResidencia, boolean isDeclarador) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad =edad;
        this.documento = documento;
        this.telefono = telefono;
        this.cuidadResidencia = cuidadResidencia;

    }

    public String getApellidos() {
        return apellidos;
    } public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }public String getCuidadResidencia() {
        return cuidadResidencia;
    } public void setCuidadResidencia(String cuidadResidencia) {
        this.cuidadResidencia = cuidadResidencia;
    }public long getDocumento() {
        return documento;
    }public void setDocumento(long documento) {
        this.documento = documento;
    }public int getEdad() {
        return edad;
    }public void setEdad(int edad) {
        this.edad = edad;
    }public boolean isDeclarador() {
        return isDeclarador;
    }public void setDeclarador(boolean declarador) {
        isDeclarador = declarador;
    }public String getNombre() {
        return nombre;
    }public void setNombre(String nombre) {
        this.nombre = nombre;
    }public long getTelefono() {
        return telefono;
    }public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
}
