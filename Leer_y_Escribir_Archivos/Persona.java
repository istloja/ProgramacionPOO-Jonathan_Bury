
package Leer_y_Escribir_Archivos;

import java.io.Serializable;

public class Persona implements Serializable {
    private String nombre;
    private String apellido;
    private int numero;
    private int cedula;
    private Sexo sexo;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int numero, int cedula, Sexo sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
        this.cedula = cedula;
        this.sexo = sexo;
    }
    
    
    
}
