/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos5;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Metodos5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String idpersona = "";
        String nombre = "";
        String apellido = "";
        String cedula = "";
        String edad = "";
        for (int i = 0; i < 1; i++) {
            System.out.println("Ingrese su informacion para registrarse en la base de datos:");
            System.out.println("Ingrese idpersona" + idpersona);
            idpersona = entrada.next();
            System.out.println("Ingrese tu nombre" + nombre);
            nombre = entrada.next();
            System.out.println("Ingrese su apellido" + apellido);
            apellido = entrada.next();
            System.out.println("Ingrese su cedula" + cedula);
            cedula = entrada.next();
            System.out.println("Ingrese su edad " + edad);
            edad = entrada.next();
            System.out.println("Se guardo en la base de datos");

        }
    }
}
