package deber.pkg1;

public class Triangulo3 extends DosDimensiones3 {
    //Tema: Constructores y herencia
    private String estilo;
    //Constructor
    Triangulo3 (String s, double b, double h){
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
}
class Lados00003{
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

    

