/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package dam2.m06uf1pracmj;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Taufik
 */
public class M06UF1PracMJ {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //ArrayList<String> opcionesMenu = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "0"));
        boolean salir = false;
        boolean salir1 = false;
        boolean salir3 = false;
        boolean salir4 = false;
        String ruta = null, clave = null, sOpcion = "";
        int opcion = -1;

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
                //if(opcionesMenu.contains(String.valueOf(opcion)))

                switch (opcion) {
                    case 1:
                        /**
                         * MENÚ OPCIÓN 1
                         */
                        System.out.println("\n1. Exportar fichero en formato XML/CSV ordenado por datos.");
                        sOpcion = entrada.nextLine();
                        while (!sOpcion.equals("x") && !sOpcion.equals("c")) {
                            System.out.println("1.1 Elige el formato de exportación XML(x) o CSV(c):");
                            sOpcion = entrada.nextLine();
                        }
                        
                        System.out.println("1.2 Indica el archivo que quieres exportar:");
                        entrada.next();
                        ruta = entrada.nextLine();
                        
                        do {
                            System.out.println("1.3 Elige el orden según el tipo de datos elegido: \n"
                                    + "\t (a) Centro. \n"
                                    + "\t (b) Nombre área estudios. \n"
                                    + "\t (c) Idioma. \n"
                                    + "\t (d) País. \n"
                                    + "\t (e) Universidad. \n"
                                    + "\t (f) Plazas ofertadas.");
                            try {
                                sOpcion = entrada.nextLine();

                                switch (sOpcion) {
                                    case "a":
                                        System.out.println("Has elegido ordenar por Centro.");
                                        salir1 = true;
                                        break;

                                    case "b":
                                        System.out.println("Has elegido ordenar por Nombre área estudios.");
                                        salir1 = true;
                                        break;

                                    case "c":
                                        System.out.println("Has elegido ordenar por Idioma.");
                                        salir1 = true;
                                        break;

                                    case "d":
                                        System.out.println("Has elegido ordenar por País.");
                                        salir1 = true;
                                        break;

                                    case "e":
                                        System.out.println("Has elegido ordenar por Universidad.");
                                        salir1 = true;
                                        break;

                                    case "f":
                                        System.out.println("Has elegido ordenar por Plazas ofertadas.");
                                        salir1 = true;
                                        break;

                                    default:
                                        System.out.println("Introduce una opción correcta (a-f).");
                                        break;
                                }
                                
                            } catch (Exception e) {
                                System.out.println("Introduce una opción correcta (a-f).");
                            }

                        } while (!salir1);

                        System.out.println("1.4 Indica dónde se guardará el archivo exportado:");
                        entrada.next();
                        ruta = entrada.nextLine();
                        System.out.println("1.5 Se ha exportado el fichero. \n");
                        break;

                    case 2:
                        /**
                         * MENÚ OPCIÓN 2
                         */
                        System.out.println("\n2. Cifrar/Descifrar el fichero.");
                        System.out.println("2.1 Introduce la ruta del fichero a cifrar/descifrar:");
                        entrada.next();
                        ruta = entrada.nextLine();
                        System.out.println("2.2 Cifrar(c)/Descifrar(d):");
                        sOpcion = entrada.nextLine();
                        
                        while (!sOpcion.equals("c") && !sOpcion.equals("d")) {
                            System.out.println("2.2 Cifrar(c)/Descifrar(d):");
                            sOpcion = entrada.nextLine();
                        }
                        
                        if (sOpcion.equals("c")) {
                            System.out.println("2.3 Introduce la clave de cifrado (tiene que ser alfanumérica):");
                            entrada.next();
                            clave = entrada.nextLine();
                            System.out.println("2.4 Indica dónde se creará el nuevo archivo:");
                            ruta = entrada.nextLine();
                            System.out.println("2.5 El fichero se ha cifrado correctamente. \n");
                            break;
                            
                        } else {
                            System.out.println("2.3 Introduce la clave de descifrado (tiene que ser alfanumérica):");
                            entrada.next();
                            clave = entrada.nextLine();
                            System.out.println("2.4 Indica dónde se creará el nuevo archivo:");
                            ruta = entrada.nextLine();
                            System.out.println("2.5 El fichero se ha descifrado correctamente. \n");
                            break;
                        }

                    case 3:
                        /**
                         * MENÚ OPCIÓN 3
                         */
                        System.out.println("\n3. Mostrar el informe según el tipo de datos elegido.");
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
                        break;

                    case 4:
                        /**
                         * MENÚ OPCIÓN 4
                         */
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

                    case 5:
                        /**
                         * MENÚ OPCIÓN 5
                         */
                        System.out.println("\n---MÁS INFORMACIÓN--- \n"
                                + "\t 1. Exportar un fichero en el formato deseado(XML o CSV) y ordenado por el tipo de datos elegidos. \n"
                                + "\t 2. Cifrar o descifrar un fichero seleccionado. \n"
                                + "\t 3. Mostrar un informe según el tipo de datos elegido del archivo importado anteriormente. \n"
                                + "\t 4. Busca los elementos del archivo XML por la categoría seleccionada, según las coincidencias del texto indicado a continuación. \n"
                                + "\t 0. Salir de la aplicación. \n");
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
