
package equipo;

import java.io.Serializable;

public class Equipo implements Serializable {
private String nombre;
private int numerodejugadores;
private String Apellido;
private int edad;
private int cedula;

    public Equipo(String nombre, int numerodejugadores, String Apellido, int edad, int cedula) {
        this.nombre = nombre;
        this.numerodejugadores = numerodejugadores;
        this.Apellido = Apellido;
        this.edad = edad;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumerodejugadores() {
        return numerodejugadores;
    }

    public void setNumerodejugadores(int numerodejugadores) {
        this.numerodejugadores = numerodejugadores;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
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

} 