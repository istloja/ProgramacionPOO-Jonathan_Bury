package ecepciones17072019;

import java.util.Scanner;

public class Ecepciones {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrada1 = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero");
        int numero = 0;
        try {//linea de codigo que voy a proteger
            numero = entrada.nextInt();
        } catch (Exception e) {//mensaje de presentar //
            System.out.println("Se ha generado la excepcion" + e);
//        } finally {//ejecutar la accion como si no hubiera pasado nada//se produce siempre que ocurre una ecepcion
         System.out.println("Ingrese un numero correcto:");
          numero = entrada1.nextInt();
        }
        System.out.println("El numero ingresado es:" + numero);
        try {
            int resultado = numero / 0;
            System.out.println("no ingrese letras con ecepciones:" + resultado);
        } catch (Exception e) {
            System.out.println("no se puede dividir para 0");
        }
    
    }

}
