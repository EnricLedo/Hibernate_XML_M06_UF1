/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import dao.Curso;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Ivan
 */
public class Informe {

    public static void informePais() {

    }

    /**
     * Método que calcula una media de las plazas ofertadas entre todas las
     * universidades
     *
     * @return mediaPlazas
     */
    public static String promedioPlazasOfertadas() {

        double totalPlazas = 0, contadorPlazas = 0;
        double mediaPlazas;
        String res;

        for (Curso c : Datos.getListaSingleton()) {
            totalPlazas += c.getPlazasOfertadas();
            contadorPlazas++;
        }

        mediaPlazas = totalPlazas / contadorPlazas;

        System.out.println("TOTAL PLAZAS = " + totalPlazas);
        System.out.println("CONTADOR PLAZAS = " + contadorPlazas);
        System.out.println("MEDIA PLAZAS = " + mediaPlazas);
        
        res = Double.toString(mediaPlazas);

        return res;
    }

    /**
     * Método que calcula qué idioma es el más solicitado entre todos los cursos
     *
     * @return
     */
    public static String topIdioma() {

        String topIdioma = null;
        int contador, maxContador = 0;
        ArrayList<String> idiomas = new ArrayList();

        for (Curso c : Datos.getListaSingleton()) {
            idiomas.add(c.getIdioma());
        }

        Collections.sort(idiomas);

        for (String i : idiomas) {
            contador = Collections.frequency(idiomas, i);
            if (maxContador < contador) {
                maxContador = contador;
                if(!i.equals("No Informado"))
                topIdioma = i;
            }
        }

        System.out.println("El idioma más solicitado es: " + topIdioma + " " + maxContador + " veces.");

        return topIdioma;
    }
    
}
