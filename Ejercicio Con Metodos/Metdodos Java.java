
package equipo;

import java.io.Serializable;


public class Vestuario implements Serializable {
    private Equipo equipo;
    private String lugar;
    private int numerojugador;
    private int edadesEntre;

    public Vestuario(Equipo equipo, String lugar, int numerojugador, int edadesEntre) {
        this.equipo = equipo;
        this.lugar = lugar;
        this.numerojugador = numerojugador;
        this.edadesEntre = edadesEntre;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getNumerojugador() {
        return numerojugador;
    }

    public void setNumerojugador(int numerojugador) {
        this.numerojugador = numerojugador;
    }

    public int getEdadesEntre() {
        return edadesEntre;
    }

    public void setEdadesEntre(int edadesEntre) {
        this.edadesEntre = edadesEntre;
    }
    
    
}
