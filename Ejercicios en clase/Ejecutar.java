

package proyectos.en.clase;
public class Ejecutar {
    public static void main(String[] args) {
       /* String cadena = "Hola mundo";
        System.out.println(cadena.length());//sirve para contar la longitud de la cadena desde  en adelante
        System.out.println(cadena.equals("Hola mundo"));//sirve para comparar dos Strings el cual devuelve un booleano (true or false)
        System.out.println(cadena.contains("H"));//verifica si el caracter esta el la palabra que nosotros escribimies y si contiene la letra devuelve true or false*/
       String hola = "hola";
       System.out.println(hola.contains("d"));
                                                                                          
    }
    public boolean verificar (String cadena , char letra){
        boolean bandera = false;
        for (int i = 0; i <= cadena.length() ; i++) {
           
            if((cadena.charAt(i) == letra)){
                bandera = true;
            }      
        }
        return bandera;   
    }
}
      
        
