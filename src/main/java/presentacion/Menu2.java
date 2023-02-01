/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentacion;

import static presentacion.M06UF1PracMJ.entrada;

/**
 * MENÚ 2: DA LA OPCIÓN DE CIFRAR/DESCIFRAR UN FICHERO
 * @author ivan
 */
public class Menu2 {

    public static void mostrarMenu2() {
        String sOpcion = "", ruta, clave;

        System.out.println("\n2. Cifrar/Descifrar el fichero.");
        System.out.println("2.1 Introduce la ruta del fichero a cifrar/descifrar:");
        entrada.next();
        ruta = entrada.nextLine();

        while (!sOpcion.equals("c") && !sOpcion.equals("d")) {
            System.out.println("Introduce una opción correcta (c/d).\n");
            System.out.println("2.2 Cifrar(c)/Descifrar(d):");
            sOpcion = entrada.nextLine().toLowerCase();
        }

        if (sOpcion.equals("c")) {
            System.out.println("2.3 Introduce la clave de cifrado (tiene que ser alfanumérica):");
            entrada.next();
            clave = entrada.nextLine();
            System.out.println("2.4 Indica dónde se creará el nuevo archivo:");
            ruta = entrada.nextLine();
            System.out.println("2.5 El fichero se ha cifrado correctamente. \n");

        } else {
            System.out.println("2.3 Introduce la clave de descifrado (tiene que ser alfanumérica):");
            entrada.next();
            clave = entrada.nextLine();
            System.out.println("2.4 Indica dónde se creará el nuevo archivo:");
            ruta = entrada.nextLine();
            System.out.println("2.5 El fichero se ha descifrado correctamente. \n");
        }

    }
}
