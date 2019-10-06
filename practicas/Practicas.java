package practicas;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Practicas {

    public static void main(String[] args) {
        //Cree una función que reciba tres enteros: x, y y z. Si alguno de ellos es 0 o negativo, o si son mayores que 255, la función debería devolver -1
        int[] arreglo = buscarSerie(255);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + ",");
        }
        Scanner entrada = new Scanner(System.in);
        int suma = 0;        
       

        
        for (int j = 0; j < arreglo.length; j++) {
            System.out.println("Ingrese el primer valor: " + (j+1));
            System.out.println(arreglo);
            /*a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del primer numero"));
            b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del segundo numero"));*/
           
        }
        for (int x = 0; x < 10; x++) {
            System.out.println("Ingrese el segundo valor: " + (x+1));
            System.out.println(arreglo);
            suma = suma + arreglo;
        }
        suma = suma + arreglo 
                  
                 
                 
        
    }

    public int funcionPedida(int x, int y, int[] arreglo) {
        int valor = -1;
        if (x > 0 && x < 255 && y > 0 && y < 255) {
            valor = arreglo[x] + arreglo[y];
        }
        return valor;
    }

    public static int[] buscarSerie(int limite) {
        int[] arreglo = new int[limite];
        int a = 7, b = 6;
        for (int i = 0; i < limite; i++) {
            if (i % 2 == 0) {
                arreglo[i] = a;
                a++;
            } else {
                arreglo[i] = b;
                b = b - 2;
            }
        }
        return arreglo;
    }

}
