package src.csv;

import src.entidades.humanos.Solicitantes;
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

    public ArchivosCSV(){
        listaSolicitantes = new ArrayList<>();
        listaContraloria = new ArrayList<>();
        listaFiscalia = new ArrayList<>();
        listaProcuraduria = new ArrayList<>();
    }

    public void LeerCSVSolicitantes() {

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\UQ\\estructuraDatos\\UniquindiSoft\\archivosCSV\\solicitudesEntrantes\\solicitantes.csv"))) {
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

    public void LeerCSVContraloria() {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\UQ\\estructuraDatos\\UniquindiSoft\\archivosCSV\\contraloria.csv"))) {
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

    public void LeerCSVFiscalia() {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\UQ\\estructuraDatos\\UniquindiSoft\\archivosCSV\\fiscalia.csv"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");

                //Crear la lista de Fiscalia
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

    public void LeerCSVProcuraduria() {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\UQ\\estructuraDatos\\UniquindiSoft\\archivosCSV\\procuraduria.csv"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");

                //Crear la lista de Procuraduria
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

    public void embargadosEscribirCSVContraloria(int i) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\UQ\\estructuraDatos\\UniquindiSoft\\archivosCSV\\embargados.csv", true))) {
            String linea = listaContraloria.get(i).getNombre() + "," +
                    listaContraloria.get(i).getApellidos() + "," +
                    listaContraloria.get(i).getEdad() + "," +
                    listaContraloria.get(i).getDocumento() + "," +
                    listaContraloria.get(i).getTelefono() + "," +
                    listaContraloria.get(i).getCuidadResidencia() + "," +
                    listaContraloria.get(i).isDeclarador() + "," +
                    listaContraloria.get(i).isEmbargado() + "," +
                    listaContraloria.get(i).isInhabilitado();
            bw.write(linea);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void embargadosEscribirCSVFiscalia(int i) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\UQ\\estructuraDatos\\UniquindiSoft\\archivosCSV\\embargados.csv", true))) {
            String linea = listaFiscalia.get(i).getNombre() + "," +
                    listaFiscalia.get(i).getApellidos() + "," +
                    listaFiscalia.get(i).getEdad() + "," +
                    listaFiscalia.get(i).getDocumento() + "," +
                    listaFiscalia.get(i).getTelefono() + "," +
                    listaFiscalia.get(i).getCuidadResidencia() + "," +
                    listaFiscalia.get(i).getEdad() + "," +
                    listaFiscalia.get(i).isEmbargado() + "," +
                    listaFiscalia.get(i).isInhabilitado();
            bw.write(linea);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void embargadosEscribirCSVProcuraduria(int i) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\UQ\\estructuraDatos\\UniquindiSoft\\archivosCSV\\embargados.csv", true))) {
            String linea = listaProcuraduria.get(i).getNombre() + "," +
                    listaProcuraduria.get(i).getApellidos() + "," +
                    listaProcuraduria.get(i).getEdad() + "," +
                    listaProcuraduria.get(i).getDocumento() + "," +
                    listaProcuraduria.get(i).getTelefono() + "," +
                    listaProcuraduria.get(i).getCuidadResidencia() + "," +
                    listaProcuraduria.get(i).isDeclarador() + "," +
                    listaProcuraduria.get(i).isEmbargado() + "," +
                    listaProcuraduria.get(i).isInhabilitado();
            bw.write(linea);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void inhabilitadosEscribirCSVContraloria(int i,int j) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\UQ\\estructuraDatos\\UniquindiSoft\\archivosCSV\\inabilitados.csv", true))) {
            String linea = listaContraloria.get(i).getNombre() + "," +
                    listaContraloria.get(i).getApellidos() + "," +
                    listaContraloria.get(i).getEdad() + "," +
                    listaContraloria.get(i).getDocumento() + "," +
                    listaContraloria.get(i).getTelefono() + "," +
                    listaContraloria.get(i).getCuidadResidencia() + "," +
                    listaContraloria.get(i).isDeclarador() + "," +
                    listaContraloria.get(i).isEmbargado() + "," +
                    listaContraloria.get(i).isInhabilitado() + "," +
                    listaSolicitantes.get(j).getFecha();

            bw.write(linea);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void inhabilitadosEscribirCSVFiscalia(int i) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\UQ\\estructuraDatos\\UniquindiSoft\\archivosCSV\\inabilitados.csv", true))) {
            String linea = listaFiscalia.get(i).getNombre() + "," +
                    listaFiscalia.get(i).getApellidos() + "," +
                    listaFiscalia.get(i).getEdad() + "," +
                    listaFiscalia.get(i).getDocumento() + "," +
                    listaFiscalia.get(i).getTelefono() + "," +
                    listaFiscalia.get(i).getCuidadResidencia() + "," +
                    listaFiscalia.get(i).getEdad() + "," +
                    listaFiscalia.get(i).isEmbargado() + "," +
                    listaFiscalia.get(i).isInhabilitado();
            bw.write(linea);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void inhabilitadosEscribirCSVProcuraduria(int i) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\UQ\\estructuraDatos\\UniquindiSoft\\archivosCSV\\inhabilitados.csv", true))) {
            String linea = listaProcuraduria.get(i).getNombre() + "," +
                    listaProcuraduria.get(i).getApellidos() + "," +
                    listaProcuraduria.get(i).getEdad() + "," +
                    listaProcuraduria.get(i).getDocumento() + "," +
                    listaProcuraduria.get(i).getTelefono() + "," +
                    listaProcuraduria.get(i).getCuidadResidencia() + "," +
                    listaProcuraduria.get(i).isDeclarador() + "," +
                    listaProcuraduria.get(i).isEmbargado() + "," +
                    listaProcuraduria.get(i).isInhabilitado();
            bw.write(linea);
            bw.newLine();
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
    }

}