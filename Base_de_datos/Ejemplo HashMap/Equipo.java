package ArchivosSerializables;

import java.util.HashMap;

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

    /*public static void main(String[] args) {
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("Programacion", 6);
        mapa.put("Ingles", 7);
        mapa.put("Base de datos", 10);
        mapa.put("Algebra", 9);
        System.out.println(mapa.get("Ingles"));
        System.out.println(mapa.get("Algebra") + 1);
        mapa.remove("Ingles");
        System.out.println(mapa);

        HashMap< String, Object> mapa1 = new HashMap<>();
        mapa1.put("Emelec", new Equipo(2, "Media", "Facil", "Masculina", "Rojo"));
        mapa1.put("Barcelona", new Equipo(5, "Media", "2", "Ecuatoriana", "Amarilla"));
        mapa1.put("Nacional", new Equipo(3, "Media", "Medio", "Femeninca", "Rojo"));
        //System.out.println(mapa1.get("Barcelona"));*/
        ;
        
}  

    

