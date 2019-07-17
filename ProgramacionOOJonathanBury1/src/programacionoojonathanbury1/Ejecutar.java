/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionoojonathanbury1;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejecutar {
      public static void main(String[] args) {
        // TODO code application logic here
        Conversiones convertir = new Conversiones();
        Scanner  entrada = new Scanner(System.in);
        System.out.println("Eliga el tipo de conversion que desea realizar:");
        System.out.println("Digite 1 para convertir grados Farenheit a Celsius o biceversa");
        System.out.println("Digite 2 para convertir grados Celcius a kelvin");
        System.out.println("Digite 3 para convertir grados kelvin a Farenheit");
        int valor = entrada.nextInt();
        switch (valor){
            case 1:
                System.out.println("La conversion en Celsius es:" + convertir.ConvertirFaC());
                System.out.println("La conversion en Farenheit es:" + convertir.ConvertirCaF());
            case 2:
                System.out.println("La conversion en kelvin es:" + convertir.ConvertirCaK());
            case 3:
                System.out.println("La conversion en Farenheit es:" + convertir.ConvertirKaF());
        }
        
    }
      
}