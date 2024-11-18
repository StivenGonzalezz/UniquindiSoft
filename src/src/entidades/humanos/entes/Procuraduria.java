package src.entidades.humanos.entes;

public class Procuraduria {

    private String nombre;
    private String apellidos;
    private int edad;
    private long documento;
    private long telefono;
    private String cuidadResidencia;
    private boolean isDeclarador;
    private boolean isEmbargado;
    private boolean isInhabilitado;

    public Procuraduria(String nombre, String apellidos, int edad, long documento, long telefono,String cuidadResidencia, boolean isDeclarador, boolean isEmbargado, boolean isInhabilitado) {
        this.apellidos = apellidos;
        this.cuidadResidencia = cuidadResidencia;
        this.documento = documento;
        this.isDeclarador=isDeclarador;
        this.isEmbargado = isEmbargado;
        this.isInhabilitado = isInhabilitado;
        this.nombre = nombre;
        this.edad=edad;
        this.telefono = telefono;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCuidadResidencia() {
        return cuidadResidencia;
    }

    public void setCuidadResidencia(String cuidadResidencia) {
        this.cuidadResidencia = cuidadResidencia;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
}
