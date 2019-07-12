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
public class DosDimensiones03 {
    private double base;
    private double altura;
    //Métodos de acceso para base y altura
    double getBase(){return base;}
    double getAltura(){return altura;}
    void setBase(double b){base=b;}
    void setAltura (double h){altura=h;}
    void mostrarDimension(){
        System.out.println("La base y altura es: "+base+" y "+altura);
    }
}
        
    
