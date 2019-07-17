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
public class Conversiones {
    public double grado;
    public double conversion;
    
    public double ConvertirFaC (){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese grados en Farenheit");
        grado = entrada.nextDouble();
        conversion = (grado-32*5/9);
        return conversion;
    }
    
    public double ConvertirCaK (){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese grados en Celsius:");
        grado = entrada.nextDouble();
        conversion = (grado + 273.15);
        return conversion;
    }
    
    public double ConvertirKaF (){
         Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese grados en kelvin:");
        grado = entrada.nextDouble();
        conversion = (((grado-273.15)*9/5)+32);
        return conversion;
    }
    
    public double ConvertirCaF(){
     Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese grados en Celcius:");
        grado = entrada.nextDouble();
        conversion = ((grado + 273.15));
        return conversion;
    }
    
    public double ConvertirkaF(){
     Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese grados en kelvin:");
        grado = entrada.nextDouble();
        conversion = (((grado-273.15)*9/5)+32);
        return conversion;
    }
    
    public double ConvertirCaf(){
     Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese grados en Celcius:");
        grado = entrada.nextDouble();
        conversion = ((grado*9/5)+32);
        return conversion;
    }
    
}



    

