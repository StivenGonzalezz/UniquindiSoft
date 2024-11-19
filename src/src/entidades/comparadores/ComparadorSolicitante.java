package src.entidades.comparadores;

import src.csv.ArchivosCSV;
import src.entidades.humanos.PreAprobado;
import src.entidades.humanos.Solicitantes;
import src.entidades.humanos.entes.Contraloria;
import src.entidades.humanos.entes.Fiscalia;
import src.entidades.humanos.entes.Procuraduria;
import java.util.ArrayList;

public class ComparadorSolicitante {

    ArchivosCSV archivosCSV = new ArchivosCSV();


    public void revision() {


        archivosCSV.leerCSVSolicitantes();
        archivosCSV.leerCSVContraloria();
        archivosCSV.leerCSVFiscalia();
        archivosCSV.leerCSVProcuraduria();

        ArrayList<Solicitantes> listaSolicitantes = archivosCSV.getListaSolicitantes();
        ArrayList<Contraloria> listaContraloria = archivosCSV.getListaContraloria();
        ArrayList<Fiscalia> listaFiscalia = archivosCSV.getListaFiscalia();
        ArrayList<Procuraduria> listaProcuraduria = archivosCSV.getListaProcuraduria();


        // Creamos un StringBuilder para almacenar todas las líneas de inhabilitados
        StringBuilder inhabilitados = new StringBuilder();
        StringBuilder embargados = new StringBuilder();
        StringBuilder preAprobados = new StringBuilder();


        // Recorremos los registros
        for (Contraloria contraloria : listaContraloria) {
            for (Solicitantes solicitante : listaSolicitantes) {
                if (contraloria.getDocumento() == solicitante.getDocumento()) {
                    if (contraloria.isEmbargado() && !contraloria.isInhabilitado()) {
                        embargados.append(contraloria.getNombre()).append(",")
                                .append(contraloria.getApellidos()).append(",")
                                .append(contraloria.getEdad()).append(",")
                                .append(contraloria.getDocumento()).append(",")
                                .append(contraloria.getTelefono()).append(",")
                                .append(contraloria.getCuidadResidencia()).append(",")
                                .append(contraloria.isDeclarador()).append(",")
                                .append(contraloria.isEmbargado()).append(",")
                                .append(contraloria.isInhabilitado()).append("\n");

                    } else if (contraloria.isInhabilitado() && !contraloria.isEmbargado()) {
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

                    } else if (contraloria.isInhabilitado() && contraloria.isEmbargado()) {
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

                    } else if (!contraloria.isInhabilitado() && !contraloria.isEmbargado()) {
                        preAprobados.append(contraloria.getNombre()).append(",")
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

        for (Fiscalia fiscalia : listaFiscalia) {
            for (Solicitantes solicitante : listaSolicitantes) {
                if (fiscalia.getDocumento() == solicitante.getDocumento()) {
                    if (fiscalia.isEmbargado() && !fiscalia.isInhabilitado()) {
                        embargados.append(fiscalia.getNombre()).append(",")
                                .append(fiscalia.getApellidos()).append(",")
                                .append(fiscalia.getEdad()).append(",")
                                .append(fiscalia.getDocumento()).append(",")
                                .append(fiscalia.getTelefono()).append(",")
                                .append(fiscalia.getCuidadResidencia()).append(",")
                                .append(fiscalia.isDeclarador()).append(",")
                                .append(fiscalia.isEmbargado()).append(",")
                                .append(fiscalia.isInhabilitado()).append("\n");

                    } else if (fiscalia.isInhabilitado() && !fiscalia.isEmbargado()) {
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

                    } else if (fiscalia.isInhabilitado() && fiscalia.isEmbargado()) {
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

                    } else if (!fiscalia.isInhabilitado() && !fiscalia.isEmbargado()) {
                        preAprobados.append(fiscalia.getNombre()).append(",")
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

        for (Procuraduria procuraduria : listaProcuraduria) {
            for (Solicitantes solicitante : listaSolicitantes) {
                if (procuraduria.getDocumento() == solicitante.getDocumento()) {
                    if (procuraduria.isEmbargado() && !procuraduria.isInhabilitado()) {
                        embargados.append(procuraduria.getNombre()).append(",")
                                .append(procuraduria.getApellidos()).append(",")
                                .append(procuraduria.getEdad()).append(",")
                                .append(procuraduria.getDocumento()).append(",")
                                .append(procuraduria.getTelefono()).append(",")
                                .append(procuraduria.getCuidadResidencia()).append(",")
                                .append(procuraduria.isDeclarador()).append(",")
                                .append(procuraduria.isEmbargado()).append(",")
                                .append(procuraduria.isInhabilitado()).append("\n");

                    } else if (procuraduria.isInhabilitado() && !procuraduria.isEmbargado()) {
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

                    } else if (procuraduria.isInhabilitado() && procuraduria.isEmbargado()) {
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

                    } else if (!procuraduria.isInhabilitado() && !procuraduria.isEmbargado()) {
                        preAprobados.append(procuraduria.getNombre()).append(",")
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

        //ahora escribimos las clases

        if (!embargados.isEmpty()) {
            archivosCSV.embargadosEscribirCSV(embargados.toString());
        }if (!inhabilitados.isEmpty()) {
            archivosCSV.inhabilitadosEscribirCSV(inhabilitados.toString());
        }if (!preAprobados.isEmpty()) {
            archivosCSV.preAprobadosEscribirCSV(preAprobados.toString());
        }
    }

    public void revisionAprobados(ArrayList<PreAprobado> lista){
        StringBuilder aprobados = new StringBuilder();
        for(PreAprobado preAprobado : lista){
            aprobados.append(preAprobado.getNombre()).append(",")
                    .append(preAprobado.getApellidos()).append(",")
                    .append(preAprobado.getEdad()).append(",")
                    .append(preAprobado.getDocumento()).append(",")
                    .append(preAprobado.getTelefono()).append(",")
                    .append(preAprobado.getCuidadResidencia()).append(",")
                    .append(preAprobado.isDeclarador()).append(",")
                    .append(preAprobado.isEmbargado()).append(",")
                    .append(preAprobado.isInhabilitado()).append("\n");
        }

        if (!aprobados.isEmpty()){
            archivosCSV.aprobadosEscribirCSV(aprobados.toString());
        }
    }
}
