package csv;

import entidades.humanos.entes.Fiscalia;

import java.io.*;
import java.util.ArrayList;

public class ArchivoFiscalia {

    private ArrayList<Fiscalia> listaFiscalia;

    public ArchivoFiscalia(){
        listaFiscalia = new ArrayList<>();
    }

    public void LeerCSVFiscalia(){
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\UQ\\estructuraDatos\\proyectoFinal\\UniquindiSoft\\archivosCSV\\fiscalia.csv"))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");

                // Crear un objeto Cotizantes con los datos leídos
                Fiscalia fiscalia = new Fiscalia(
                        datos[0],              // nombre
                        datos[1],              // apellidos
                        Long.parseLong(datos[2]),  // documento
                        Long.parseLong(datos[3]),  // telefono
                        datos[4],              // cuidadResidencia
                        Boolean.parseBoolean(datos[5]),  // isEmbargado
                        Boolean.parseBoolean(datos[6])   // isInhabilitado
                );

                // Añadir el objeto Cotizantes al ArrayList
                listaFiscalia.add(fiscalia);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void escribirCSVFiscalia(int i){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\UQ\\estructuraDatos\\proyectoFinal\\UniquindiSoft\\archivosCSV\\inhabilitados.csv",true))) {
            String linea1 = listaFiscalia.get(i).getNombre()+","+ listaFiscalia.get(i).getApellidos()+","+listaFiscalia.get(i).getDocumento()+","+listaFiscalia.get(i).getTelefono()+","+listaFiscalia.get(i).getCuidadResidencia()+","+listaFiscalia.get(i).isEmbargado()+","+listaFiscalia.get(i).isInhabilitado();
            bw.write(linea1);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
