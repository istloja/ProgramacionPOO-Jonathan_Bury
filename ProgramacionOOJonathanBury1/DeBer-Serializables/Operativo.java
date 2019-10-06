
package equipo;

import java.io.Serializable;


public class Operativo implements Serializable {
    private Equipo equipo;
    private String nacionalidad;
    private String lugar;

    public Operativo(Equipo equipo, String nacionalidad, String lugar) {
        this.equipo = equipo;
        this.nacionalidad = nacionalidad;
        this.lugar = lugar;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    
}
