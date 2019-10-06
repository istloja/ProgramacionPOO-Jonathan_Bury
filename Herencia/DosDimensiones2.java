package deber.pkg1;

public class DosDimensiones2 {
    //Tema :  Control de Acceso a Miembros en Herencia
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
    

