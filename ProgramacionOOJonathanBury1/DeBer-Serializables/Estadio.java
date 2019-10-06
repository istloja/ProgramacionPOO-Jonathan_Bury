
package equipo;

import java.io.Serializable;


public class Estadio implements Serializable {
   private Equipo equipo;
    private String pais;
    private String calles;

    public Estadio(Equipo equipo, String pais, String calles) {
        this.equipo = equipo;
        this.pais = pais;
        this.calles = calles;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCalles() {
        return calles;
    }

    public void setCalles(String calles) {
        this.calles = calles;
    }
    
    
}
