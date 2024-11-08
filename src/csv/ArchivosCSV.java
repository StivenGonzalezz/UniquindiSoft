package csv;

import entidades.humanos.Cotizantes;
import entidades.humanos.Entes;

import java.io.*;
import java.util.ArrayList;

public class ArchivosCSV {

    private ArrayList<Cotizantes> listaSolicitantes;
    private ArrayList<Entes> listaContraloria;
    private ArrayList<Entes> listaFiscalia;
    private ArrayList<Entes> listaProcuraduria;

    public ArchivosCSV(){
        listaSolicitantes = new ArrayList<>();
        listaContraloria = new ArrayList<>();
        listaFiscalia = new ArrayList<>();
        listaProcuraduria = new ArrayList<>();
    }

    public void LeerCSVSolicitantes(String nombreArchivo){

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\UQ\\estructuraDatos\\proyectoFinal\\UniquindiSoft\\archivosCSV\\"+nombreArchivo+".csv"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");

                // Crear un objeto Cotizantes con los datos leídos
                Cotizantes solicitantes = new Cotizantes(
                        datos[0],              // nombre
                        datos[1],              // apellidos
                        Long.parseLong(datos[2]),  // documento
                        Long.parseLong(datos[3]),  // telefono
                        datos[4],              // cuidadResidencia
                        Boolean.parseBoolean(datos[6]),  // isEmbargado
                        Boolean.parseBoolean(datos[7])   // isInhabilitado
                );

                // Añadir el objeto Cotizantes al ArrayList
                listaSolicitantes.add(solicitantes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void LeerCSVContraloria() {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\UQ\\estructuraDatos\\proyectoFinal\\UniquindiSoft\\archivosCSV\\contraloria.csv"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");

                //Crear la lista de Contraloria
                Entes entes = new Entes(
                        datos[0],              // nombre
                        datos[1],              // apellidos
                        Long.parseLong(datos[2]),  // documento
                        Long.parseLong(datos[3]),  // telefono
                        datos[4],              // cuidadResidencia
                        Boolean.parseBoolean(datos[5]),  // isEmbargado
                        Boolean.parseBoolean(datos[6])   // isInhabilitado
                );
                listaContraloria.add(entes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void LeerCSVFiscalia() {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\UQ\\estructuraDatos\\proyectoFinal\\UniquindiSoft\\archivosCSV\\fiscalia.csv"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");

                //Crear la lista de Fiscalia
                Entes entes = new Entes(
                        datos[0],              // nombre
                        datos[1],              // apellidos
                        Long.parseLong(datos[2]),  // documento
                        Long.parseLong(datos[3]),  // telefono
                        datos[4],              // cuidadResidencia
                        Boolean.parseBoolean(datos[5]),  // isEmbargado
                        Boolean.parseBoolean(datos[6])   // isInhabilitado
                );
                listaFiscalia.add(entes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void LeerCSVProcuraduria() {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\UQ\\estructuraDatos\\proyectoFinal\\UniquindiSoft\\archivosCSV\\procuraduria.csv"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");

                //Crear la lista de Procuraduria
                Entes entes = new Entes(
                        datos[0],              // nombre
                        datos[1],              // apellidos
                        Long.parseLong(datos[2]),  // documento
                        Long.parseLong(datos[3]),  // telefono
                        datos[4],              // cuidadResidencia
                        Boolean.parseBoolean(datos[5]),  // isEmbargado
                        Boolean.parseBoolean(datos[6])   // isInhabilitado
                );
                listaProcuraduria.add(entes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void embargadosEscribirCSVContraloria(int i) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\UQ\\estructuraDatos\\proyectoFinal\\UniquindiSoft\\archivosCSV\\embargados.csv", true))) {
            String linea1 = listaContraloria.get(i).getNombre() + "," + listaContraloria.get(i).getApellidos() + "," + listaContraloria.get(i).getDocumento() + "," + listaContraloria.get(i).getTelefono() + "," + listaContraloria.get(i).getCuidadResidencia() + "," + listaContraloria.get(i).isEmbargado() + "," + listaContraloria.get(i).isInhabilitado();
            bw.write(linea1);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void embargadosEscribirCSVFiscalia(int i) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\UQ\\estructuraDatos\\proyectoFinal\\UniquindiSoft\\archivosCSV\\embargados.csv", true))) {
            String linea1 = listaFiscalia.get(i).getNombre() + "," + listaFiscalia.get(i).getApellidos() + "," + listaFiscalia.get(i).getDocumento() + "," + listaFiscalia.get(i).getTelefono() + "," + listaFiscalia.get(i).getCuidadResidencia() + "," + listaFiscalia.get(i).isEmbargado() + "," + listaFiscalia.get(i).isInhabilitado();
            bw.write(linea1);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void embargadosEscribirCSVProcuraduria(int i) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\UQ\\estructuraDatos\\proyectoFinal\\UniquindiSoft\\archivosCSV\\embargados.csv", true))) {
            String linea1 = listaProcuraduria.get(i).getNombre() + "," + listaProcuraduria.get(i).getApellidos() + "," + listaProcuraduria.get(i).getDocumento() + "," + listaProcuraduria.get(i).getTelefono() + "," + listaProcuraduria.get(i).getCuidadResidencia() + "," + listaProcuraduria.get(i).isEmbargado() + "," + listaProcuraduria.get(i).isInhabilitado();
            bw.write(linea1);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void inhabilitadosEscribirCSVContraloria(int i) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\UQ\\estructuraDatos\\proyectoFinal\\UniquindiSoft\\archivosCSV\\inhabilitados.csv", true))) {
            String linea1 = listaContraloria.get(i).getNombre() + "," + listaContraloria.get(i).getApellidos() + "," + listaContraloria.get(i).getDocumento() + "," + listaContraloria.get(i).getTelefono() + "," + listaContraloria.get(i).getCuidadResidencia() + "," + listaContraloria.get(i).isEmbargado() + "," + listaContraloria.get(i).isInhabilitado();
            bw.write(linea1);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void inhabilitadosEscribirCSVFiscalia(int i) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\UQ\\estructuraDatos\\proyectoFinal\\UniquindiSoft\\archivosCSV\\inhabilitados.csv", true))) {
            String linea1 = listaFiscalia.get(i).getNombre() + "," + listaFiscalia.get(i).getApellidos() + "," + listaFiscalia.get(i).getDocumento() + "," + listaFiscalia.get(i).getTelefono() + "," + listaFiscalia.get(i).getCuidadResidencia() + "," + listaFiscalia.get(i).isEmbargado() + "," + listaFiscalia.get(i).isInhabilitado();
            bw.write(linea1);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void inhabilitadosEscribirCSVProcuraduria(int i) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\UQ\\estructuraDatos\\proyectoFinal\\UniquindiSoft\\archivosCSV\\inhabilitados.csv", true))) {
            String linea1 = listaProcuraduria.get(i).getNombre() + "," + listaProcuraduria.get(i).getApellidos() + "," + listaProcuraduria.get(i).getDocumento() + "," + listaProcuraduria.get(i).getTelefono() + "," + listaProcuraduria.get(i).getCuidadResidencia() + "," + listaProcuraduria.get(i).isEmbargado() + "," + listaProcuraduria.get(i).isInhabilitado();
            bw.write(linea1);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Cotizantes> getListaSolicitantes() {
        return listaSolicitantes;
    }public ArrayList<Entes> getListaContraloria() {
        return listaContraloria;
    }public ArrayList<Entes> getListaFiscalia() {
        return listaFiscalia;
    }public ArrayList<Entes> getListaProcuraduria() {
        return listaProcuraduria;
    }






































    /*public void imprimirLista(){
        for (Cotizantes cotizante : listaSolicitantes) {
            System.out.println("Nombre: " + cotizante.getNombre() +
                    ", Apellidos: " + cotizante.getApellidos() +
                    ", Documento: " + cotizante.getDocumento() +
                    ", Teléfono: " + cotizante.getTelefono() +
                    ", Ciudad de Residencia: " + cotizante.getCuidadResidencia() +
                    ", Aprobado: " + cotizante.isAprobado() +
                    ", Embargado: " + cotizante.isEmbargado() +
                    ", Inhabilitado: " + cotizante.isInhabilitado());
        }
    }*/
}