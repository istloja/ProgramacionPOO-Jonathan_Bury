package ArchivosSerializables;
import java.util.HashMap;
import java.util.Scanner;
public class EjemploMapa {
    public static void main(String[] args) {
        HashMap < String , Integer > mapa = new  HashMap <>();
        Scanner entrada = new Scanner(System.in);
        /*String Ciudad = "";
        String Codigo = "";
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese su codigo:" + Codigo);
            Codigo = entrada.next();
            System.out.println("Ingrese su ciudad:" + Ciudad);
            Ciudad = entrada.next();
            mapa.put();*/
        
        //System.out.println(mapa);
        
        String Cedula = "";
        int Edad = 0 ;
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese su cedula:");
            Cedula = entrada.next();
            System.out.println("Ingrese su edad:");
            Edad = entrada.nextInt();
            mapa.put(Cedula, Edad);
            System.out.println(mapa);
            /*if (Cedula == 1){
                mapa.remove(1226562563,15);
            }
            else{
                mapa.remove(1900557213, 20);*/
            }
        System.out.println("Ingrese cedula:" + Cedula);
        Cedula = entrada.next();
        mapa.remove(Cedula);
        System.out.println(mapa);
        }
}   
        
        
        
    
    

