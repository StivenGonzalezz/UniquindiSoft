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
        archivosCSV.LeerCSVSolicitantes();

        ArrayList<Solicitantes> listaSolicitantes = archivosCSV.getListaSolicitantes();
        ArrayList<Contraloria> listaContraloria = archivosCSV.getListaContraloria();

        for (Contraloria contraloria : listaContraloria) {
            for (Solicitantes solicitante : listaSolicitantes) {
                if (contraloria.getDocumento() == solicitante.getDocumento()) {
                    if (contraloria.isInhabilitado()) {
                        archivosCSV.inhabilitadosEscribirCSVContraloria(listaContraloria.indexOf(contraloria));
                    }
                    // Puedes agregar otras condiciones aquí si es necesario
                }
            }
        }
    }
}
