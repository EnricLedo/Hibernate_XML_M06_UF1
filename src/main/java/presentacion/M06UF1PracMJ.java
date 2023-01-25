/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package presentacion;

import java.util.InputMismatchException;
import java.util.Scanner;
import static presentacion.Menu1.mostrarMenu1;
import static presentacion.Menu2.mostrarMenu2;
import static presentacion.Menu3.mostrarMenu3;
import static presentacion.Menu4.mostrarMenu4;
import static presentacion.Menu5.mostrarMenu5;

/**
 *
 * @author ivan
 */
public class M06UF1PracMJ {
    public static final Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salir = false;
        String ruta;
        int opcion;

        /**
         * IMPORTACIÓN DEL ARCHIVO XML
         */
        System.out.println("Introduce la ruta del archivo a importar:");
        ruta = entrada.nextLine();
        System.out.println("Se ha importado el fichero XML. \n");

        /**
         * MENÚ PRINCIPAL
         */
        do {
            System.out.println("Pulsa la opción deseada: \n"
                    + "\t 1. Exportar fichero en formato XML/CSV ordenado por datos. \n"
                    + "\t 2. Cifrar/Descifrar el fichero. \n"
                    + "\t 3. Mostrar el informe según el tipo de datos elegido. \n"
                    + "\t 4. Búsqueda por categoría. \n"
                    + "\t 5. Más información (HELP). \n"
                    + "\t 0. Salir.");
            
            try {
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        /**
                         * MENÚ OPCIÓN 1
                         */
                        mostrarMenu1();
                        break;

                    case 2:
                        /**
                         * MENÚ OPCIÓN 2
                         */
                        mostrarMenu2();
                        break;

                    case 3:
                        /**
                         * MENÚ OPCIÓN 3
                         */
                        mostrarMenu3();
                        break;

                    case 4:
                        /**
                         * MENÚ OPCIÓN 4
                         */
                        mostrarMenu4();
                        break;

                    case 5:
                        /**
                         * MENÚ OPCIÓN 5
                         */
                        mostrarMenu5();
                        break;

                    case 0:
                        /**
                         * MENÚ OPCIÓN 0
                         */
                        System.out.println("\nHas salido de la aplicación.");
                        salir = true;
                        break;

                    default:
                        System.out.println("\nSólo números entre 0 y 5. \n");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Debes elegir una opción del menú. \n");
                entrada.next();
            }

        } while (!salir);

    }
}