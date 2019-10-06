package programacionoojonathanbury1;


public class Metodo {

    public int calcularedad(int año, int fecha_actual){
        double edad = fecha_actual - año ;
        return  (int) edad;
    }
    public double calcularhipotenusa (double cateto_opuesto, double cateto_adyacente){
        double hipotenusa = Math.sqrt(Math.pow(cateto_opuesto,2) + Math.pow(cateto_adyacente,2));
        return hipotenusa;}

    public String edad(int edad) {
    if (edad >= 18){
        return "Es mayor de edad";
        }
        return "Es menor de edad";
    }
    
    public double calcular(boolean iva, double precio){
        if (iva == true){
            double iv = precio*0.12;
            double precio1 = precio+iv;
            return precio1;
        }else {
            return precio;
        }
    }
    
    public boolean Aprobar (double nota, int porcentajefaltas){
        if (nota >= 7 && porcentajefaltas < 20){
        return true;
        }else{
        return false;
        }
    }
     
 
}
