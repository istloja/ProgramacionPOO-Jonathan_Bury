package excepciones17072019;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWrite {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la direccion del archivo");
        String direccion = entrada.nextLine();
        System.out.println("Ingrese el texto a escribir en el archivo:");
        String texto = entrada.nextLine();
        Escrituradearchivos objeto = new Escrituradearchivos();
        objeto.Escribirarchivo(direccion, texto);
    }

    public Void Escribirarchivo(String direccion, String mensaje) {
        try {
            try (FileWriter archivo = new FileWriter(direccion)) {
                PrintWriter escribir = new PrintWriter(archivo);
                escribir.println(mensaje);
                archivo.close();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}


    

