/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import dao.Curso;
import dao.Cursos;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import static logica.Importar.importarXml;
import static presentacion.M06UF1PracMJ.entrada;

/**
 *
 * @author DAM
 */
public class Busqueda {

    /**
     * BUSCAR COINCIDENCIAS EN XML
     */
    public static void buscarAreaEstudios() throws JAXBException {

        ArrayList<Curso> listaBusqueda = new ArrayList<>();

        System.out.println("4.1 Introduce el Área de estudios que deseas buscar:");
        String area = entrada.nextLine();
        for (Curso c : Datos.getListaSingleton()) {
            System.out.println("DATOS SINGLETON:::");
            System.out.println(c.getAreaEstudios());
            if (c.getAreaEstudios().equals(area)) {
                listaBusqueda.add(c);

            }
        }
        if (!listaBusqueda.isEmpty()) {
            System.out.println("4.2 Estas son las coincidencias encontradas:");

            for (Curso c : listaBusqueda) {
                System.out.println("LISTA::: " + listaBusqueda);
                System.out.println(c);
            }
        } else {
            System.out.println("No se han encontrado coincidencias con " + area);
        }
    }

}
