
package ArchivosSerializables;

import java.io.Serializable;

public class Equipo {
    private int numero;
    private String Categoria;
    private String nivel;
    private String seleccion;
    private String color_de_uniforme;

    public Equipo() {
    }

    public Equipo(int numero, String Categoria, String nivel, String seleccion, String color_de_uniforme) {
        this.numero = numero;
        this.Categoria = Categoria;
        this.nivel = nivel;
        this.seleccion = seleccion;
        this.color_de_uniforme = color_de_uniforme;
    }

    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(String seleccion) {
        this.seleccion = seleccion;
    }

    public String getColor_de_uniforme() {
        return color_de_uniforme;
    }

    public void setColor_de_uniforme(String color_de_uniforme) {
        this.color_de_uniforme = color_de_uniforme;
    }   
    
}



