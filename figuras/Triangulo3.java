/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author USUARIO
 */
public class Triangulo3 {
    //Tema: Constructores y herencia
     private String estilo;
    //Constructor
    Triangulo3(String s, double b, double h){
        setBase(b);
        setAltura(h);
        estilo=s;
    }
    double area(){
        return getBase()*getAltura()/2;
    }
    void mostrarEstilo(){
        System.out.println("Triangulo es: "+estilo);
    }

    private void setBase(double b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int getBase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int getAltura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setAltura(double h) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    class Lados03{
        public static void main(String[] args) {
            Triangulo t1=new Triangulo("Estilo 1",4.0,4.0);
            Triangulo t2=new Triangulo("Estilo 2",8.0,12.0);
            System.out.println("Información para T1: ");
            t1.mostrarEstilo();
            t1.mostrarDimension();
            System.out.println("Su área es: "+t1.area());
            System.out.println();
            System.out.println("Información para T2: ");
            t2.mostrarEstilo();
            t2.mostrarDimension();
            System.out.println("Su área es: "+t2.area());
    }
}

