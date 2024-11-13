package src.entidades.humanos;

import java.util.Date;

public class Solicitantes extends Persona {

    private Date fecha;
    public Solicitantes(String nombre, String apellidos, int edad, long documento, long telefono, String cuidadResidencia, boolean isDeclarador ,Date fecha) {
        super(nombre, apellidos, edad, documento, telefono, cuidadResidencia, isDeclarador);
        this.fecha=fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
