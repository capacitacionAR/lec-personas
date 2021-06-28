import jdk.swing.interop.SwingInterOpUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("personas.txt"));
        sc.useDelimiter("[,\\n]");
        int edadMayor = 0, edadMenor = 0;
        String nombreMayor = "", nombreMenor= "";
        int documentoMayor = 0, documentoMenor = 0;

        while(sc.hasNextInt()){
            int documento = sc.nextInt();
            String nombre = sc.next();
            int edad = sc.nextInt();

            if (edad > edadMayor){
                edadMayor = edad;
                nombreMayor = nombre;
                documentoMayor = documento;
            }
            if(edadMenor == 0 || edad < edadMenor){
                edadMenor = edad;
                nombreMenor = nombre;
                documentoMenor = documento;
            }
            System.out.println(documento+" "+nombre+" "+edad);
        }
        System.out.println("persona de mayor edad es "+edadMayor+" "+nombreMayor);
        System.out.println("persona de menor edad es "+edadMenor+" "+nombreMenor);


    }
}
