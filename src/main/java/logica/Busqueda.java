/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import dao.Curso;
import java.util.ArrayList;
import javax.xml.bind.JAXBException;
import static presentacion.M06UF1PracMJ.entrada;

/**
 *
 * @author ivan
 */
public class Busqueda {

    /**
     * BUSCAR COINCIDENCIAS EN XML
     *
     * @throws javax.xml.bind.JAXBException
     */
    public static void buscarAreaEstudios() throws JAXBException {

        ArrayList<Curso> listaBusqueda = new ArrayList<>();
        System.out.println("4.1 Introduce el Área de estudios que deseas buscar (Ejemplo: Diseño industrial, de moda y de interiores):");
        String area = entrada.nextLine();
        for (Curso c : Datos.getListaSingleton()) {
            if (c.getAreaEstudios().contains(area)) {
                listaBusqueda.add(c);
            }
        }
        if (!listaBusqueda.isEmpty()) {
            System.out.println("4.2 Estas son las coincidencias encontradas:");
            for (Curso c : listaBusqueda) {
                System.out.println(c);
            }
        } else {
            System.out.println("No se han encontrado coincidencias con: " + area);
        }
    }

    public static void buscarCentro() throws JAXBException {

        ArrayList<Curso> listaBusqueda = new ArrayList<>();
        System.out.println("4.1 Introduce el Centro que deseas buscar (Ejemplo: Escuela de Ingeniería y Arquitectura):");
        String centro = entrada.nextLine();
        for (Curso c : Datos.getListaSingleton()) {
            if (c.getCentro().contains(centro)) {
                listaBusqueda.add(c);
            }
        }
        if (!listaBusqueda.isEmpty()) {
            System.out.println("4.2 Estas son las coincidencias encontradas:");
            for (Curso c : listaBusqueda) {
                System.out.println(c);
            }
        } else {
            System.out.println("No se han encontrado coincidencias con: " + centro);
        }
    }

    public static void buscarIdioma() throws JAXBException {

        ArrayList<Curso> listaBusqueda = new ArrayList<>();
        System.out.println("4.1 Introduce el Idioma que deseas buscar (Ejemplo: ESPAÑOL):");
        String idioma = entrada.nextLine();
        for (Curso c : Datos.getListaSingleton()) {
            if (c.getIdioma().contains(idioma)) {
                listaBusqueda.add(c);
            }
        }
        if (!listaBusqueda.isEmpty()) {
            System.out.println("4.2 Estas son las coincidencias encontradas:");
            for (Curso c : listaBusqueda) {
                System.out.println(c);
            }
        } else {
            System.out.println("No se han encontrado coincidencias con: " + idioma);
        }
    }

    public static void buscarPais() throws JAXBException {

        ArrayList<Curso> listaBusqueda = new ArrayList<>();
        System.out.println("4.1 Introduce el País que deseas buscar (Ejemplo: Polonia):");
        String pais = entrada.nextLine();
        for (Curso c : Datos.getListaSingleton()) {
            if (c.getPais().contains(pais)) {
                listaBusqueda.add(c);
            }
        }
        if (!listaBusqueda.isEmpty()) {
            System.out.println("4.2 Estas son las coincidencias encontradas:");
            for (Curso c : listaBusqueda) {
                System.out.println(c);
            }
        } else {
            System.out.println("No se han encontrado coincidencias con: " + pais);
        }
    }

    public static void buscarUniversidad() throws JAXBException {

        ArrayList<Curso> listaBusqueda = new ArrayList<>();
        System.out.println("4.1 Introduce la Universidad que deseas buscar (Ejemplo: Hochschule Coburg):");
        String universidad = entrada.nextLine();
        for (Curso c : Datos.getListaSingleton()) {
            if (c.getUniversidad().contains(universidad)) {
                listaBusqueda.add(c);
            }
        }
        if (!listaBusqueda.isEmpty()) {
            System.out.println("4.2 Estas son las coincidencias encontradas:");
            for (Curso c : listaBusqueda) {
                System.out.println(c);
            }
        } else {
            System.out.println("No se han encontrado coincidencias con: " + universidad);
        }
    }

    public static void buscarPlazasOfertadas() throws JAXBException {

        ArrayList<Curso> listaBusqueda = new ArrayList<>();
        System.out.println("4.1 Introduce las Plazas Ofertadas que deseas buscar (Ejemplo: 2):");
        String pOfertadas = entrada.nextLine();
        while (!isNumeric(pOfertadas)) {
            System.out.println("Introduce un número entero positivo.");
            pOfertadas = entrada.nextLine();
        }
        for (Curso c : Datos.getListaSingleton()) {
            if (String.valueOf(c.getPlazasOfertadas()).equals(pOfertadas)) {
                listaBusqueda.add(c);
            }
        }
        if (!listaBusqueda.isEmpty()) {
            System.out.println("4.2 Estas son las coincidencias encontradas:");
            for (Curso c : listaBusqueda) {
                System.out.println(c);
            }
        } else {
            System.out.println("No se han encontrado coincidencias con: " + pOfertadas);
        }
    }
    
    /**
     * COMPRUEBA SI UN STRING ES UN ENTERO
     * @param cadena
     * @return 
     */
    public static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
