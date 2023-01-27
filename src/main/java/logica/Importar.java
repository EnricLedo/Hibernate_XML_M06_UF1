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
     */
    public static void importarXml() throws JAXBException {

        JAXBContext context = JAXBContext.newInstance(Cursos.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();

        System.out.println("Introduce la ruta del archivo a importar:");
        String ruta = entrada.nextLine();
        File archivoXml = new File(ruta);
        Cursos cursos = (Cursos) unmarshaller.unmarshal(archivoXml);
        List<Curso> lista = cursos.getCursos();

        for (Curso c : lista) {
            System.out.println(c.getAreaEstudios() + " " + c.getCentro() + " " + c.getIdioma() + " " + c.getPais() + " " + c.getUniversidad());
        }

        System.out.println("\nSe ha importado el fichero XML. \n");

    }

}
