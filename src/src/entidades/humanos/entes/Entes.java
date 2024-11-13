package src.entidades.humanos.entes;
import src.entidades.humanos.Persona;

public class Entes extends Persona {

    private boolean isEmbargado;
    private boolean isInhabilitado;

    public Entes(String nombre, String apellidos, int edad, long documento, long telefono, String cuidadResidencia, boolean isDeclarador, boolean isEmbargado, boolean isInhabilitado) {
        super(nombre, apellidos, edad, documento, telefono, cuidadResidencia, isDeclarador);
        this.isEmbargado = isEmbargado;
        this.isInhabilitado = isInhabilitado;
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
