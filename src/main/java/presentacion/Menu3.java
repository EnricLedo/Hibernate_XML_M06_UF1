/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentacion;

import static presentacion.M06UF1PracMJ.entrada;

/**
 *
 * @author ivan
 */
public class Menu3 {

    public static void mostrarMenu3() {
        String sOpcion, ruta;
        boolean salir3 = false;

        System.out.println("\n3. Mostrar el informe según el tipo de datos elegido.");
        entrada.nextLine();
        
        do {
            System.out.println("3.1 Elige el tipo de datos que quieres generar el informe: \n"
                    + "\t (a) País. \n"
                    + "\t (b) Plazas ofertadas. \n"
                    + "\t (c) Idioma más solicitado.");

            try {
                sOpcion = entrada.nextLine();
                switch (sOpcion) {
                    case "a":
                        System.out.println("Has elegido generar el informe por País.");
                        salir3 = true;
                        break;

                    case "b":
                        System.out.println("Has elegido generar el informe por Plazas ofertadas.");
                        salir3 = true;
                        break;

                    case "c":
                        System.out.println("Has elegido generar el informe por Idioma más solicitado.");
                        salir3 = true;
                        break;

                    default:
                        System.out.println("Elige una opción correcta (a-c)");
                }

            } catch (Exception ex) {
                System.out.println("Elige una opción correcta (a-c)");
            }

        } while (!salir3);

        System.out.println("3.2 Indica dónde se guardará el informe:");
        entrada.next();
        ruta = entrada.nextLine();
        System.out.println("3.3 Se ha generado el informe correctamente. \n");
    }

}
