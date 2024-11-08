package entidades.humanos;

public class Entes extends Persona{

    private boolean isEmbargado;
    private boolean isInhabilitado;

    public Entes(String nombre, String apellidos, long documento, long telefono, String cuidadResidencia, boolean isEmbargado, boolean isInhabilitado) {
        super(nombre, apellidos, documento, telefono, cuidadResidencia);
        this.isEmbargado = isEmbargado;
        this.isInhabilitado = isInhabilitado;
    }

    public boolean isEmbargado() {
        return isEmbargado;
    }public void setEmbargado(boolean embargado) {
        isEmbargado = embargado;
    }public boolean isInhabilitado() {
        return isInhabilitado;
    }public void setInhabilitado(boolean inhabilitado) {
        isInhabilitado = inhabilitado;
    }
}
