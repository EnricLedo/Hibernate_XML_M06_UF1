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
public class Menu4 {

    public static void mostrarMenu4() {
        String sOpcion;
        boolean salir4 = false;

        do {
            System.out.println("\n4. Búsqueda por categoría. \n"
                    + "Elige la categoría: \n"
                    + "\t (a) Área de estudios. \n"
                    + "\t (b) Centro. \n"
                    + "\t (c) Idioma. \n"
                    + "\t (d) País. \n"
                    + "\t (e) Universidad. \n"
                    + "\t (f) Plazas ofertadas.");

            try {
                sOpcion = entrada.nextLine();
                switch (sOpcion) {
                    case "a":
                        System.out.println("4.1 Introduce el Área de estudios que deseas buscar:");
                        sOpcion = entrada.nextLine();
                        System.out.println("4.2 Estas son las coincidencias encontradas:");
                        System.out.println("BÚSQUEDA. \n");
                        salir4 = true;
                        break;

                    case "b":
                        System.out.println("4.1 Introduce el Centro que deseas buscar:");
                        sOpcion = entrada.nextLine();
                        System.out.println("4.2 Estas son las coincidencias encontradas:");
                        System.out.println("BÚSQUEDA. \n");
                        salir4 = true;
                        break;

                    case "c":
                        System.out.println("4.1 Introduce el Idioma que deseas buscar:");
                        sOpcion = entrada.nextLine();
                        System.out.println("4.2 Estas son las coincidencias encontradas:");
                        System.out.println("BÚSQUEDA. \n");
                        salir4 = true;
                        break;

                    case "d":
                        System.out.println("4.1 Introduce el País que deseas buscar:");
                        sOpcion = entrada.nextLine();
                        System.out.println("4.2 Estas son las coincidencias encontradas:");
                        System.out.println("BÚSQUEDA. \n");
                        salir4 = true;
                        break;

                    case "e":
                        System.out.println("4.1 Introduce la Universidad que deseas buscar:");
                        sOpcion = entrada.nextLine();
                        System.out.println("4.2 Estas son las coincidencias encontradas:");
                        System.out.println("BÚSQUEDA. \n");
                        salir4 = true;
                        break;

                    case "f":
                        System.out.println("4.1 Introduce las Plazas ofertadas que deseas buscar:");
                        sOpcion = entrada.nextLine();
                        System.out.println("4.2 Estas son las coincidencias encontradas:");
                        System.out.println("BÚSQUEDA. \n");
                        salir4 = true;
                        break;

                    default:
                        System.out.println("Introduce una opción correcta (a-f).");
                        break;
                }

            } catch (Exception ex) {
                System.out.println("Elige una opción correcta (a-f).");
            }

        } while (!salir4);

    }

}
