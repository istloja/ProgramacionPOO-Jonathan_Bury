package javaapplication48;

public class Deber  {

    public static void main(String[] args) {
    //Clase para objetos de dos dimensiones
    class DosDimensiones{
    double base;
    double altura;
    void mostrarDimension(){
        System.out.println("La base y altura es: "+base+" y "+altura);
    }
}
    
    //Una subclase de DosDimensiones para Triangulo
class Triangulo extends DosDimensiones{
    String estilo;
    double area(){
        return base*altura/2;
    }
    void mostrarEstilo(){
        System.out.println("Triangulo es: "+estilo);
    }
}
class Lados {
    public static void main(String[] args) {
        Triangulo t1=new Triangulo();
        Triangulo t2=new Triangulo();
        t1.base=4.0;
        t1.altura=4.0;
        t1.estilo="Estilo 1";
        t2.base=8.0;
        t2.altura=12.0;
        t2.estilo="Estilo 2";
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
    }
    
}
