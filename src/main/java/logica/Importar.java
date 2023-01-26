/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import static presentacion.M06UF1PracMJ.entrada;

/**
 *
 * @author Ivan
 */
public class Importar {

    /**
     * IMPORTACIÓN DEL ARCHIVO XML
     */
    public static void importarXml() {

        System.out.println("Introduce la ruta del archivo a importar:");
        System.out.println("C:\\Users\\Ivan\\Desktop\\ficheroXML.xml");
        try {
            String ruta = entrada.nextLine();
            File archivoXml = new File(ruta);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbFactory.newDocumentBuilder();
            Document documentoXml = builder.parse(archivoXml);
            documentoXml.getDocumentElement().normalize();

            System.out.println("Se ha importado el fichero XML. \n");
            //System.out.println("NODE NAME::: " + documentoXml.getDocumentElement().getTagName());

            String raiz = documentoXml.getDocumentElement().getTagName();

            NodeList rows = documentoXml.getElementsByTagName(raiz);

            /*System.out.println("CONTENIDO: ");
            System.out.println("ROWS::: " + documentoXml.getDocumentElement().getAttribute(rows.toString()));*/
            for (int i = 0; i < rows.getLength(); i++) {
                Node row = rows.item(i);

                if (row.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) row;
                    NodeList hijos = element.getChildNodes();

                    for (int j = 0; j < hijos.getLength(); j++) {
                        Node hijo = hijos.item(j);
                        if (hijo.getNodeType() == Node.ELEMENT_NODE) {
                            System.out.println(hijo.getNodeName() + ": " + hijo.getTextContent());
                        }
                    }
                    System.out.println("");
                }
            }
        } catch (IOException | ParserConfigurationException | DOMException | SAXException ex) {
            System.out.println(ex.getCause());
        }
    }

}
