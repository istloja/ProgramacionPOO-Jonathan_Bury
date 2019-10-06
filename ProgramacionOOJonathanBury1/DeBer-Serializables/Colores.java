
package equipo;

import java.io.Serializable;


public class Colores implements Serializable {
    private Equipo equipo;
    private int numerodecolores;
    private String color;

    public Colores(Equipo equipo, int numerodecolores, String color) {
        this.equipo = equipo;
        this.numerodecolores = numerodecolores;
        this.color = color;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public int getNumerodecolores() {
        return numerodecolores;
    }

    public void setNumerodecolores(int numerodecolores) {
        this.numerodecolores = numerodecolores;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void lista2(String cUsersRafaelDesktopYolotxt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
