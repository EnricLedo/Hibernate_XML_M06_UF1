/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import dao.Curso;
import dao.Cursos;
import java.io.File;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import static presentacion.M06UF1PracMJ.entrada;

/**
 *
 * @author Ivan
 */
public class Importar {

    /**
     * IMPORTACIÓN DEL ARCHIVO XML
     * @throws javax.xml.bind.JAXBException
     */
    public static void importarXml(File file) throws JAXBException {

        JAXBContext context = JAXBContext.newInstance(Cursos.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        
        Cursos cursos = (Cursos) unmarshaller.unmarshal(file);
        //Datos.setDatos((Datos) cursos.getCursos());
        List<Curso> lista = cursos.getCursos();
        Datos.listaSingleton = cursos.getCursos();

        for (Curso c : Datos.listaSingleton) {
            System.out.println(c.getAreaEstudios() + " " + c.getCentro() + " " + c.getIdioma() + " " + c.getPais() + " " + c.getUniversidad());
        }

        System.out.println("\nSe ha importado el fichero XML. \n");

    }

}