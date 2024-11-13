package entidades;

public class Sedes {

    private String ciudad;
    private String nombreSede;

    public Sedes(String ciudad, String nombreSede) {
        this.ciudad = ciudad;
        this.nombreSede = nombreSede;
    }

    public String getCiudad() {
        return ciudad;
    }public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }public String getNombreSede() {
        return nombreSede;
    }public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }
}