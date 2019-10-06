package tareajava;
public class JuegoAdivinaImpar extends JuegoAdivinaNumero {
    
    public JuegoAdivinaImpar(int vidas, int numero) {
        super(vidas, numero);
        
    }
    public double validaNumero() {
        if (numero % 2 != 0) {
            System.out.println(true);
            if (numero % 2 == 0) {
                System.out.println("Error");
                System.out.println(false);
        }  
    }
        return numero;
    }
    
}
