
package equipo;

import java.io.Serializable;


public class Confederacion implements Serializable {
    private Equipo equipo;
    private int Año;
    private String region;

    public Confederacion(Equipo equipo, int Año, String region) {
        this.equipo = equipo;
        this.Año = Año;
        this.region = region;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    
    
}
