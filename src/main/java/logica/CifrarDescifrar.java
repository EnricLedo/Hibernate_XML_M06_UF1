/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author Enric
 */
public class CifrarDescifrar {
    
    public static String cifrar(String clau, String missatge)
    {
        char valors[] = conseguirValors(clau);
        char multiplicador = valors[0];
        char restador = valors[1];
        String restaPassword = "";
        
        for (int i = 0; i < valors.length-2; i++) {
            restaPassword += ((char) valors[2+i]);
        }
        missatge = restaPassword.concat(missatge);
        
        int[] missatgeIntegerArray = toIntegerArray(missatge);
        int[] segonaPartMissatgeIntegerArray = new int[missatgeIntegerArray.length];
        
        for (int i = 0; i < missatgeIntegerArray.length; i++)
        {
            segonaPartMissatgeIntegerArray[i] = 
        }
        
        return true;
    }
    
    /*public static boolean cifrar(String clau, String ruta)
    {
        //Recollim el XML en un String
        //Si tenim un error amb el metòde de recollir el xml, retornem false
        String xml = "exempleDeXML";
        String xmlXifrat = "";
        
        char valors[] = conseguirValors(clau);
        char multiplicador = valors[0];
        char restador = valors[1];
        String restaPassword = "";
        
        for (int i = 0; i < valors.length-2; i++) {
            restaPassword += ((char) valors[2+i]);
        }
        xml += restaPassword;
        
        for (int i = 0; i < xml.length(); i++)
        {
            char introduir = xml.charAt(i);
            int resultat = (((introduir*multiplicador)-restador)%256);
            xmlXifrat += (char) resultat;
        }
        //Passem l'string
        //Si a l'hora de guardar el missatge ens reporten algun error, retornem false
        return true;
    }*/
    //
    
    public static int[] toIntegerArray (String cadena)
    {
        int[] resultado = new int[cadena.length()];
        
        for (int i = 0; i < cadena.length(); i++)
            resultado[i] = (int) cadena.charAt(i);
        
        return resultado;
    }//DONE!
    

    private static char[] conseguirValors(String clau) {
        /*
        El multiplicador del caràcter a xifrar serà el primer caràcter de la clau,
        sempre i quan, no sigui igual a (char) 0 ó (char) 256.
        En cas que ho sigui farem la comprovació per al següent.
        Quan trobem un caràcter vàlid, el següent a aquest l'utilitzarem per 
        a restar. Si el número vàlid és l'últim, no tindrem resta.
        Si no hi ha caràcter vàlid, multiplicarem per 29.
        Els caràcters que no s'hagin utilitzat els afegirem a l'inici
        del missatge a xifrar, i els xifrarem també.
        */
        char resultat[] = new char[clau.length()];
        boolean tenimValid = false;
        int nombreExtra = 2;
        for (int i = 0; i < clau.length(); i++) {
            if(clau.charAt(i) != ((char) 0) && clau.charAt(i) != ((char) 256) && !tenimValid)
            {
                tenimValid = true;
                resultat[0]=clau.charAt(i);
                if(i<clau.length())
                {
                    i++;
                    resultat[1]=clau.charAt(i);
                }
            }
            else
            {
                //Busquem la primera posició que estigui buida i el fiquem allà
                resultat[nombreExtra]=clau.charAt(i);
                nombreExtra++;
            }
        }
        //resultat[0]=multiplicador
        //resultat[1]=restador
        //resultat[els altres]=codi a afegir a l'inici del missatge a xifrar.
        return resultat;
    }//DONE!
    
    public static boolean descifrar(String clau, String codiXifrat)
    {
        char valors[] = conseguirValors(clau);
        char multiplicador = valors[0];
        char restador = valors[1];
        String restaPassword = "";
        
        for (int i = 0; i < codiXifrat.length(); i++)
        {
            char introduir = codiXifrat.charAt(i);
            
            int resultat = (((introduir*multiplicador)-restador)%256);
            xmlXifrat += (char) resultat;
        }
        //Passem l'string
        //Si a l'hora de guardar el missatge ens reporten algun error, retornem false
        return true;
    }
}
