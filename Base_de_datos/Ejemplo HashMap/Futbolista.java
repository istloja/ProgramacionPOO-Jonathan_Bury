
package ArchivosSerializables;

import java.io.Serializable;

public class Futbolista implements Serializable {
    
    private double talla;
    private int edad;
    private int cedula;
    private int telefono;
    private Equipo Equipo;

    public Futbolista() {
    }

    public Futbolista(double talla, int edad, int cedula, int telefono, Equipo Equipo) {
        this.talla = talla;
        this.edad = edad;
        this.cedula = cedula;
        this.telefono = telefono;
        this.Equipo = Equipo;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double altura) {
        this.talla = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Equipo getEquipo() {
        return Equipo;
    }

    public void setEquipo(Equipo Equipo) {
        this.Equipo = Equipo;
    }
    
    public static void main(String[] args) {
        Futbolista objeto = new Futbolista(1.75, 25 , 7821456 , 8475960, new Equipo(25, "Sub20", "Medio", "Ecuatoriana","Azul con blanco"));
        
        Futbolista objeto2 = new Futbolista(1.57, 24 , 7815156 , 7475960, new Equipo(20, "Sub19", "Facil", "Ecuatoriana","Azul con negro"));
        
        Futbolista objeto3 = new Futbolista(1.75, 20 , 1023459 , 15475962, new Equipo(21, "Sub17", "Dificil", "Ecuatoriana","Negro con blanco"));
        
        Futbolista objeto4 = new Futbolista(1.56, 29 , 012345 , 1275960, new Equipo(27, "Sub20", "Facil", "Ecuatoriana","Verde con blanco"));
        
        Futbolista objeto5 = new Futbolista(1.60, 23 , 9687457 , 9475961, new Equipo(20, "Sub21", "Medio", "Ecuatoriana","Turquesa"));
        
        Futbolista objeto6 = new Futbolista(1.55, 20 , 7821458 , 88975967, new Equipo(24, "Sub22", "Dificil", "Ecuatoriana","Beige"));
        
        Futbolista objeto7 = new Futbolista(1.58, 21 , 8620450 , 8195967, new Equipo(20, "Sub16", "Dificil", "Ecuatoriana","Azul"));
        
        Futbolista objeto8 = new Futbolista(1.79, 19 , 4520456 , 7810268, new Equipo(29, "Sub18", "Medio", "Ecuatoriana","Blanco"));
        
        Futbolista objeto9 = new Futbolista(1.80, 18 , 6501456 , 6475961, new Equipo(22, "Sub20", "Facil", "Ecuatoriana","Azul Marino Con Rojo"));
        
        Futbolista objeto10 = new Futbolista(1.77, 20 , 7821456 , 3255960, new Equipo(23, "Sub19", "Medio", "Ecuatoriana","Negro"));
        
    }
   
}
