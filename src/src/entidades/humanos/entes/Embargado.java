package src.entidades.humanos.entes;

public class Embargado {

    private String nombre;
    private String apellidos;
    private int edad;
    private long documento;
    private long telefono;
    private String ciudadResidencia;
    private boolean isDeclarador;
    private boolean isEmbargado;
    private boolean isInhabilitado;

    public Embargado(String nombre, String apellidos, int edad, long documento, long telefono, String ciudadResidencia,
                     boolean isDeclarador, boolean isEmbargado, boolean isInhabilitado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.documento = documento;
        this.telefono = telefono;
        this.ciudadResidencia = ciudadResidencia;
        this.isDeclarador = isDeclarador;
        this.isEmbargado = isEmbargado;
        this.isInhabilitado = isInhabilitado;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    public boolean isDeclarador() {
        return isDeclarador;
    }

    public void setDeclarador(boolean declarador) {
        isDeclarador = declarador;
    }

    public boolean isEmbargado() {
        return isEmbargado;
    }

    public void setEmbargado(boolean embargado) {
        isEmbargado = embargado;
    }

    public boolean isInhabilitado() {
        return isInhabilitado;
    }

    public void setInhabilitado(boolean inhabilitado) {
        isInhabilitado = inhabilitado;
    }
}