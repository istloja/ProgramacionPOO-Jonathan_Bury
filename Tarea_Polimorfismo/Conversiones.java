package Tarea_Polimorfismo;

public class Conversiones {

    public static void main(String[] args) {
        double anguloEnGrados = 45;

        double anguloEnRadianes = Math.toRadians(anguloEnGrados);
        System.out.println("De grados a Radianes" + anguloEnGrados + "° = " + anguloEnRadianes + "rad");

        anguloEnGrados = Math.toRadians(anguloEnRadianes);
        System.out.println("Radianes a Grados" + anguloEnRadianes + "rad = " + anguloEnGrados + "°");

    }

}
