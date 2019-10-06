package ProgramacionPoo;

import java.util.Scanner;

public class valorMasGrande {
    public static void main(String[] args) {
      
        Scanner entrada = new Scanner(System.in);
        int mayor=0,reciente=0;
        for (int i=0; i<10;i++){
            int valor = entrada.nextInt();
            reciente = valor;
            if (valor>mayor){
                mayor = valor;
            }
            
        } 
        System.out.println("El reciente es:" + reciente);
        System.out.println("El mayor es:" + mayor);
    }  
    
}