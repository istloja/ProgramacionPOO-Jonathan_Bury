package ProgramacionPoo;

import java.util.Scanner;

public class comisionesDeVentas {

    public static void main(String[] args) {
        int sueldo = 200;
        double articulo1;
        double articulo2;
        double articulo3;
        double articulo4;
        double comision;
        double paga;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el articulo 1 \n");
        articulo1 = entrada.nextDouble();
        System.out.println("Introduzca el articulo 2 \n");
        articulo2 = entrada.nextDouble();
        System.out.println("Introduzca el articulo 3 \n");
        articulo3 = entrada.nextDouble();
        System.out.println("Introduzca el articulo 4 \n");
        articulo4 = entrada.nextDouble();

        comision = ((articulo1 + articulo2 + articulo3 + articulo4) * 0.09);
        paga = comision + sueldo;

        System.out.println("Su comision a cobrar es:" + paga);

    }

}
