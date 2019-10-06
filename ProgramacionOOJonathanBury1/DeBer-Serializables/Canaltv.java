
package equipo;

import java.io.Serializable;


public class Canaltv implements Serializable{
    private Equipo equipo;
    private String año;
    private String Marca;
    private String canal;

    public Canaltv(Equipo equipo, String año, String Marca, String canal) {
        this.equipo = equipo;
        this.año = año;
        this.Marca = Marca;
        this.canal = canal;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }
    
}
