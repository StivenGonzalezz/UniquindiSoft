package src.csv;

import src.entidades.humanos.Solicitantes;
import src.entidades.humanos.PreAprobado;
import src.entidades.humanos.entes.Contraloria;
import src.entidades.humanos.entes.Fiscalia;
import src.entidades.humanos.entes.Procuraduria;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ArchivosCSV {

    private ArrayList<Solicitantes> listaSolicitantes;
    private ArrayList<Contraloria> listaContraloria;
    private ArrayList<Fiscalia> listaFiscalia;
    private ArrayList<Procuraduria> listaProcuraduria;
    private ArrayList<PreAprobado> listaPreAprobado;



    public ArchivosCSV(){
        listaSolicitantes = new ArrayList<>();
        listaContraloria = new ArrayList<>();
        listaFiscalia = new ArrayList<>();
        listaProcuraduria = new ArrayList<>();
        listaPreAprobado = new ArrayList<>();
    }

    public void leerCSVSolicitantes() {

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\UQ\\estructuraDatos\\proyecto\\UniquindiSoft\\archivosCSV\\solicitudesEntrantes\\solicitantes.csv"))) {
            String linea;
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  // Formato de la fecha en el CSV
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");

                // Convertir la fecha de la cadena CSV a Date
                Date fecha = null;
                try {
                    fecha = sdf.parse(datos[7]);
                } catch (ParseException e) {
                    e.printStackTrace();
                }

                // Crear un objeto Solicitantes con los datos leídos
                Solicitantes solicitante = new Solicitantes(
                        datos[0],              // nombre
                        datos[1],              // apellidos
                        Integer.parseInt(datos[2]),     // edad
                        Long.parseLong(datos[3]),  // documento
                        Long.parseLong(datos[4]),  // telefono
                        datos[5],            // cuidadResidencia
                        Boolean.parseBoolean(datos[6]),    // isDeclarador
                        fecha                // fecha
                );

                // Añadir el objeto Solicitantes al ArrayList
                listaSolicitantes.add(solicitante);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void leerCSVContraloria() {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\UQ\\estructuraDatos\\proyecto\\UniquindiSoft\\archivosCSV\\contraloria.csv"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");

                //Crear la lista de Contraloria
                Contraloria contraloria = new Contraloria(
                        datos[0],              // nombre
                        datos[1],              // apellidos
                        Integer.parseInt(datos[2]),     //edad
                        Long.parseLong(datos[3]),  // documento
                        Long.parseLong(datos[4]),  // telefono
                        datos[5],              // cuidadResidencia
                        Boolean.parseBoolean(datos[6]),     //isDeclarador
                        Boolean.parseBoolean(datos[7]),  // isEmbargado
                        Boolean.parseBoolean(datos[8])   // isInhabilitado
                );
                listaContraloria.add(contraloria);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void leerCSVFiscalia() {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\UQ\\estructuraDatos\\proyecto\\UniquindiSoft\\archivosCSV\\fiscalia.csv"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");

                //Crear la lista de Contraloria
                Fiscalia fiscalia = new Fiscalia(
                        datos[0],              // nombre
                        datos[1],              // apellidos
                        Integer.parseInt(datos[2]),     //edad
                        Long.parseLong(datos[3]),  // documento
                        Long.parseLong(datos[4]),  // telefono
                        datos[5],              // cuidadResidencia
                        Boolean.parseBoolean(datos[6]),     //isDeclarador
                        Boolean.parseBoolean(datos[7]),  // isEmbargado
                        Boolean.parseBoolean(datos[8])   // isInhabilitado
                );
                listaFiscalia.add(fiscalia);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void leerCSVProcuraduria() {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\UQ\\estructuraDatos\\proyecto\\UniquindiSoft\\archivosCSV\\procuraduria.csv"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");

                //Crear la lista de Contraloria
                Procuraduria procuraduria = new Procuraduria(
                        datos[0],              // nombre
                        datos[1],              // apellidos
                        Integer.parseInt(datos[2]),     //edad
                        Long.parseLong(datos[3]),  // documento
                        Long.parseLong(datos[4]),  // telefono
                        datos[5],              // cuidadResidencia
                        Boolean.parseBoolean(datos[6]),     //isDeclarador
                        Boolean.parseBoolean(datos[7]),  // isEmbargado
                        Boolean.parseBoolean(datos[8])   // isInhabilitado
                );
                listaProcuraduria.add(procuraduria);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void leerCSVPreAprobados() {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\UQ\\estructuraDatos\\proyecto\\UniquindiSoft\\archivosCSV\\preaprobados.csv"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");

                //Crear la lista de Contraloria
                PreAprobado preaprobado = new PreAprobado(
                        datos[0],              // nombre
                        datos[1],              // apellidos
                        Integer.parseInt(datos[2]),     //edad
                        Long.parseLong(datos[3]),  // documento
                        Long.parseLong(datos[4]),  // telefono
                        datos[5],              // cuidadResidencia
                        Boolean.parseBoolean(datos[6]),     //isDeclarador
                        Boolean.parseBoolean(datos[7]),  // isEmbargado
                        Boolean.parseBoolean(datos[8])   // isInhabilitado
                );
                listaPreAprobado.add(preaprobado);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void embargadosEscribirCSV(String embargados) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\UQ\\estructuraDatos\\proyecto\\UniquindiSoft\\archivosCSV\\embargados.csv", false))) {
            bw.write(embargados);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void inhabilitadosEscribirCSV(String inhabilitados) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\UQ\\estructuraDatos\\proyecto\\UniquindiSoft\\archivosCSV\\inhabilitados.csv", false))) {
            bw.write(inhabilitados);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void preAprobadosEscribirCSV(String preAprobados) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\UQ\\estructuraDatos\\proyecto\\UniquindiSoft\\archivosCSV\\preAprobados.csv", false))) {
            bw.write(preAprobados);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Solicitantes> getListaSolicitantes() {
        return listaSolicitantes;
    }public ArrayList<Contraloria> getListaContraloria() {
        return listaContraloria;
    }public ArrayList<Fiscalia> getListaFiscalia() {
        return listaFiscalia;
    }public ArrayList<Procuraduria> getListaProcuraduria() {
        return listaProcuraduria;
    }public ArrayList<PreAprobado> getListaPreAprobado() {
        return listaPreAprobado;
    }
}