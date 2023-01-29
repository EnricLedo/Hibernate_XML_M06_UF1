/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Ivan
 */
public class Exportar {

    public static void exportarInforme(String informe, String ruta) throws IOException {
        try {
            File archivo = new File(ruta);
            FileWriter fw = new FileWriter(archivo, true);
            fw.write(informe);
            fw.close();
        } catch (IOException ex) {
            System.out.println("No se ha podido crear el archivo en la ruta " + ruta);
        }
    }

}
