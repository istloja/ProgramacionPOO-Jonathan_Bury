
package equipo;

import java.io.Serializable;

public class Main {
    public static void main(String[] args) {
    
    Equipo objeto =new Equipo("Emelec", 11,"los mejores", 23, 1150595555);
    Futbolista objeto1= new Futbolista(new Equipo("Barcelona", 11,"los mejores", 23, 1150595555), 23, "Rafael", 1.65, 20,10,20.40,30);
    Cuerpotecnico objeto2 = new Cuerpotecnico(new Equipo("Real madrid", 11, "los mejores", 24, 1138723848),"Marcelo", 40,1129354734);
    Colores objeto3= new Colores(new Equipo("Nacional", 11,"los mejores", 23, 1176595555), 4,"Rojo y Amarillo");
    Estadio objeto4= new Estadio(new Equipo("Chivas", 11,"los mejores", 23, 1150445555), "Mexico", "18 de noviembre");
    Operativo objeto5 = new Operativo(new Equipo("Liga de quito", 11,"los mejores", 23, 1153395855), "Ecuatoriana", "Guayaquil");
    Canaltv objeto6 = new Canaltv(new Equipo("Liga de loja", 11,"los mejores", 23, 1199395555), "2018", "TC", "Canal 7");
    Confederacion objeto7= new Confederacion(new Equipo("Independiente", 11,"los mejores", 23, 1156695555), 2019,"Costa");
    Vestuario objeto8= new Vestuario(new Equipo("Macara", 11,"los mejores", 23, 1153397755),"Estadio de Guayaquil", 23, 25);
    
        System.out.println("El jugador "+ objeto1.getNombre() + " pertenece al  equipo de "+ objeto.getNombre());
        System.out.println("El jugador "+objeto1.getNombre()+" Tiene el numero "+objeto.getNumerodejugadores());
        System.out.println("El jugador "+objeto1.getNombre()+" Perticipo en otros equipos "+objeto2.getEquipo().getNombre());
        System.out.println("El jugadr "+objeto1.getNombre()+" Salio en el canal y participo en otros equipos"+objeto6);
        System.out.println("Los goles son "+objeto1.getGoles());
        System.out.println(" Perdida de  goles "+objeto1.getPerdidadeGoles()
                        +" Quilometros "+ objeto1.getQuilometros() +" Pasos "+ objeto1.getPasos());
    }


    
} 

    
//
//            
//  if ( edad >= 23)
//                   
//     return "Edad es mayor o igual que edad1";
//            
//     else{
//   return " edad1 es menor ";
//    }
//     }
//                
//        boolean edadFutbolista= true;
//        
//          if(edadFutbolista>edad1Cuerpotecnico){
//            
//            System.out.println("correcto"+edadFutbolista);
//       
//        else{
//            System.out.println("incorrecto "+EdaddeCuerpotecnico);
//            
//            edadCuerpotecnico=false;
//            
//           
//      return listaEquipo;
//        

    
