package equipo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Futbolista implements Serializable {

    private Equipo equipo;
    private int edad;
    private String nombre;
    private double altura;
    private int goles;
    private int perdidadeGoles;
    private double quilometros;
    private int pasos;

    public Futbolista(Equipo equipo, int edad, String nombre, double altura, int goles,
            int perdidadeGoles, double quilometros, int pasos) {
        this.equipo = equipo;
        this.edad = edad;
        this.nombre = nombre;
        this.altura = altura;
        this.goles = goles;
        this.perdidadeGoles = perdidadeGoles;
        this.quilometros = quilometros;
        this.pasos = pasos;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getPerdidadeGoles() {
        return perdidadeGoles;
    }

    public void setPerdidadeGoles(int perdidadeGoles) {
        this.perdidadeGoles = perdidadeGoles;
    }

    public double getQuilometros() {
        return quilometros;
    }

    public void setQuilometros(double quilometros) {
        this.quilometros = quilometros;
    }

    public int getPasos() {
        return pasos;
    }

    public void setPasos(int pasos) {
        this.pasos = pasos;
    }

//public Futbolista verificarMenor(List<Futbolista> lista){
//   Futbolista menor = lista.get(0);
//    for (Futbolista futbolista : lista) {
//       if(menor.getEdad()>futbolista.getEdad()){
//           menor=futbolista;
//       } 
//    return menor;
    public static void main(String[] args) {
        Futbolista objeto = new Futbolista(new Equipo("barcelona", 11, "apellidos",
                 23, 1137489346), 23, "messi", 1.65, 23, 10, 20.40, 30);
        List<Futbolista> lista = null;
        System.out.println(objeto.verificarMenor(lista));
    }

    public Futbolista verificarMenor(List<Futbolista> lista) {
        Futbolista menor = lista.get(0);
        for (Futbolista futbolista : lista) {
            if (menor.getGoles() > futbolista.getGoles()) {
                menor = futbolista;
                return menor;

            }
        }
        return null;

    }

    public double porcentajeAcierto(Futbolista objeto) {
        return (objeto.getGoles()+objeto.getAltura())/objeto.getPerdidadeGoles();
    }

    public double porcentajedeEfectividad(Futbolista objeto) {
        return objeto.getPasos()/objeto.getPerdidadeGoles();
    }
    public double rendimiento(Futbolista objeto){
    return porcentajeAcierto(objeto)+porcentajedeEfectividad(objeto)+objeto.getQuilometros();
    }
    public Futbolista verificarMenor(List<Futbolista> lista) {
        Futbolista mayor = lista.get(0);
        for (Futbolista futbolista : lista) {
            if (rendimiento(mayor)> rendimiento(Futbolista)) {
                mayor = futbolista;
                return mayor;
}
//public Futbolista Rendimiento(List<Futbolista> lista){
// Futbolista numerodegoles=lista.get(0);
//    int goles=23;
//    int perdidadeGoles=10;
//    int respuesta = Acierto+Efectividad;
//    
//         
//        return null;
//}
//}

