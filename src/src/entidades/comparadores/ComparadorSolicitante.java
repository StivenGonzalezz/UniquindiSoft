package src.entidades.comparadores;

import src.csv.ArchivosCSV;
import src.entidades.humanos.Solicitantes;
import src.entidades.humanos.entes.Contraloria;
import src.entidades.humanos.entes.Fiscalia;
import src.entidades.humanos.entes.Procuraduria;
import java.util.ArrayList;

public class ComparadorSolicitante {

    private ArchivosCSV archivosCSV;
    private ArrayList<Solicitantes> listaSolicitantes;
    private ArrayList<Contraloria> listaContraloria;
    private ArrayList<Fiscalia> listaFiscalia;
    private ArrayList<Procuraduria> listaProcuraduria;

    public ComparadorSolicitante(ArchivosCSV archivosCSV) {
        this.archivosCSV = archivosCSV;
        this.listaSolicitantes = archivosCSV.getListaSolicitantes(); // Obtener la lista de ArchivosCSV
        this.listaContraloria = archivosCSV.getListaContraloria();
        this.listaFiscalia = archivosCSV.getListaFiscalia();
        this.listaProcuraduria = archivosCSV.getListaProcuraduria();
    }


    public void revision() {
        ArchivosCSV archivosCSV = new ArchivosCSV();
        archivosCSV.LeerCSVContraloria();
        archivosCSV.LeerCSVFiscalia();
        archivosCSV.LeerCSVProcuraduria();
        archivosCSV.LeerCSVSolicitantes();

        ArrayList<Solicitantes> listaSolicitantes = archivosCSV.getListaSolicitantes();
        ArrayList<Contraloria> listaContraloria = archivosCSV.getListaContraloria();

        // Creamos un StringBuilder para almacenar todas las líneas de inhabilitados
        StringBuilder inhabilitados = new StringBuilder();
        StringBuilder embargados = new StringBuilder();
        StringBuilder preaprobados = new StringBuilder();

        // Recorremos los registros
        for (Contraloria contraloria : listaContraloria) {
            for (Solicitantes solicitante : listaSolicitantes) {
                if (contraloria.getDocumento() == solicitante.getDocumento()) {
                    if (contraloria.isInhabilitado()) {
                        // Agregamos el registro al StringBuilder
                        inhabilitados.append(contraloria.getNombre()).append(",")
                                .append(contraloria.getApellidos()).append(",")
                                .append(contraloria.getEdad()).append(",")
                                .append(contraloria.getDocumento()).append(",")
                                .append(contraloria.getTelefono()).append(",")
                                .append(contraloria.getCuidadResidencia()).append(",")
                                .append(contraloria.isDeclarador()).append(",")
                                .append(contraloria.isEmbargado()).append(",")
                                .append(contraloria.isInhabilitado()).append(",")
                                .append(solicitante.getFecha()).append("\n");

                    } else if (contraloria.isEmbargado()) {
                        embargados.append(contraloria.getNombre()).append(",")
                                .append(contraloria.getApellidos()).append(",")
                                .append(contraloria.getEdad()).append(",")
                                .append(contraloria.getDocumento()).append(",")
                                .append(contraloria.getTelefono()).append(",")
                                .append(contraloria.getCuidadResidencia()).append(",")
                                .append(contraloria.isDeclarador()).append(",")
                                .append(contraloria.isEmbargado()).append(",")
                                .append(contraloria.isInhabilitado()).append("\n");

                    }
                    else {
                        preaprobados.append(contraloria.getNombre()).append(",")
                                .append(contraloria.getApellidos()).append(",")
                                .append(contraloria.getEdad()).append(",")
                                .append(contraloria.getDocumento()).append(",")
                                .append(contraloria.getTelefono()).append(",")
                                .append(contraloria.getCuidadResidencia()).append(",")
                                .append(contraloria.isDeclarador()).append(",")
                                .append(contraloria.isEmbargado()).append(",")
                                .append(contraloria.isInhabilitado()).append("\n");
                    }
                }
            }
        }

        for (Procuraduria procuraduria : listaProcuraduria) {
            for (Solicitantes solicitante : listaSolicitantes) {
                if (procuraduria.getDocumento() == solicitante.getDocumento()) {
                    if (procuraduria.isInhabilitado()) {
                        // Agregamos el registro al StringBuilder
                        inhabilitados.append(procuraduria.getNombre()).append(",")
                                .append(procuraduria.getApellidos()).append(",")
                                .append(procuraduria.getEdad()).append(",")
                                .append(procuraduria.getDocumento()).append(",")
                                .append(procuraduria.getTelefono()).append(",")
                                .append(procuraduria.getCuidadResidencia()).append(",")
                                .append(procuraduria.isDeclarador()).append(",")
                                .append(procuraduria.isEmbargado()).append(",")
                                .append(procuraduria.isInhabilitado()).append(",")
                                .append(solicitante.getFecha()).append("\n");
                    } else if (procuraduria.isEmbargado()) {
                        embargados.append(procuraduria.getNombre()).append(",")
                                .append(procuraduria.getApellidos()).append(",")
                                .append(procuraduria.getEdad()).append(",")
                                .append(procuraduria.getDocumento()).append(",")
                                .append(procuraduria.getTelefono()).append(",")
                                .append(procuraduria.getCuidadResidencia()).append(",")
                                .append(procuraduria.isDeclarador()).append(",")
                                .append(procuraduria.isEmbargado()).append(",")
                                .append(procuraduria.isInhabilitado()).append("\n");

                    } else{
                        preaprobados.append(procuraduria.getNombre()).append(",")
                            .append(procuraduria.getApellidos()).append(",")
                            .append(procuraduria.getEdad()).append(",")
                            .append(procuraduria.getDocumento()).append(",")
                            .append(procuraduria.getTelefono()).append(",")
                            .append(procuraduria.getCuidadResidencia()).append(",")
                            .append(procuraduria.isDeclarador()).append(",")
                            .append(procuraduria.isEmbargado()).append(",")
                            .append(procuraduria.isInhabilitado()).append("\n");

                }
                }
            }
        }

        for (Fiscalia fiscalia : listaFiscalia) {
            for (Solicitantes solicitante : listaSolicitantes) {
                if (fiscalia.getDocumento() == solicitante.getDocumento()) {
                    if (fiscalia.isInhabilitado()) {
                        // Agregamos el registro al StringBuilder
                        inhabilitados.append(fiscalia.getNombre()).append(",")
                                .append(fiscalia.getApellidos()).append(",")
                                .append(fiscalia.getEdad()).append(",")
                                .append(fiscalia.getDocumento()).append(",")
                                .append(fiscalia.getTelefono()).append(",")
                                .append(fiscalia.getCuidadResidencia()).append(",")
                                .append(fiscalia.isDeclarador()).append(",")
                                .append(fiscalia.isEmbargado()).append(",")
                                .append(fiscalia.isInhabilitado()).append(",")
                                .append(solicitante.getFecha()).append("\n");
                    } else if (fiscalia.isEmbargado()) {
                        embargados.append(fiscalia.getNombre()).append(",")
                                .append(fiscalia.getApellidos()).append(",")
                                .append(fiscalia.getEdad()).append(",")
                                .append(fiscalia.getDocumento()).append(",")
                                .append(fiscalia.getTelefono()).append(",")
                                .append(fiscalia.getCuidadResidencia()).append(",")
                                .append(fiscalia.isDeclarador()).append(",")
                                .append(fiscalia.isEmbargado()).append(",")
                                .append(fiscalia.isInhabilitado()).append("\n");

                    }else{
                        preaprobados.append(fiscalia.getNombre()).append(",")
                                .append(fiscalia.getApellidos()).append(",")
                                .append(fiscalia.getEdad()).append(",")
                                .append(fiscalia.getDocumento()).append(",")
                                .append(fiscalia.getTelefono()).append(",")
                                .append(fiscalia.getCuidadResidencia()).append(",")
                                .append(fiscalia.isDeclarador()).append(",")
                                .append(fiscalia.isEmbargado()).append(",")
                                .append(fiscalia.isInhabilitado()).append("\n");

                    }
                }
            }
        }

        // Ahora escribimos todo de una vez en el archivo
        if (!inhabilitados.isEmpty()) {
            archivosCSV.inhabilitadosEscribirCSV(inhabilitados.toString());
        }if (!embargados.isEmpty()) {
            archivosCSV.embargadosEscribirCSV(embargados.toString());
        }if (!preaprobados.isEmpty()) {
            archivosCSV.preaprobadosEscribirCSV(preaprobados.toString());
        }
    }
}
