package ProgramacionPOO;

import java.util.Scanner;

public class kilometrajedegasolina {

    public static void main(String args[]) { // Abre metodo main
        Scanner entrada = new Scanner(System.in);
        double galon;
        double kilometros;

        Calculo miObjeto = new Calculo();

        System.out.println("Introduzca el numero de galones: (-1 para terminar)");
        galon = entrada.nextDouble();
        System.out.println("Introduzca el numero de kilometros: ");
        kilometros = entrada.nextDouble();

        while (-1 != galon) {

            System.out.printf("El resultado es : %.2f ", miObjeto.Procesa_Datos(galon, kilometros));
            System.out.println();
            kilometros = entrada.nextDouble();
        }
    }

    private static class Calculo {

        public double Procesa_Datos(double gl, double km) {

            double promedio = km / gl;
            return promedio;
        }

    }
}
