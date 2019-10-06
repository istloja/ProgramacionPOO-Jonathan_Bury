/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import java.util.ArrayList;
import java.util.List;


public class Lista {
    public static void main(String[] args) {
        List <Integer> Numero;
        Numero = new ArrayList<>();
        Numero.add(1);
        Numero.add(5);
        Numero.add(8);
        System.out.println(Numero.get(0));
        System.out.println(Numero.get(1));
        System.out.println(Numero.get(2));
    }
    
}
