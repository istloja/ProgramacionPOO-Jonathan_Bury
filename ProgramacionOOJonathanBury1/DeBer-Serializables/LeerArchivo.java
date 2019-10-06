
package equipo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class LeerArchivo  {
//es para escribir  archivos{
    public void escribir(String archivo,Futbolista futbolista) {

        try {
            ObjectOutputStream ejemplo = new ObjectOutputStream(new FileOutputStream(archivo));
            ejemplo.writeObject(futbolista);
            ejemplo.close();
        } catch (IOException e) {
            System.out.println("erro " + e);
        }

    }

    public void archivo(String archivo) {
        try {
            ObjectInputStream leer = new ObjectInputStream(new FileInputStream(archivo));
            Object auxiliar = leer.readObject();
            Futbolista futbolista = (Futbolista) auxiliar;
            System.out.println(futbolista.getEquipo().getNombre());

        } catch (Exception e) {

            System.out.println("error " + e);

        }
    }

    public void LeerArchivo(String ruta) {
        try {
            //leer el archivo
            ObjectInputStream leer = new ObjectInputStream(new FileInputStream(ruta));
            Object auxiliar = leer.readObject();

            
            while (auxiliar != null) {
            Futbolista futbolista = (Futbolista) auxiliar;
            System.out.println(futbolista.getEquipo().getNombre());
            auxiliar = leer.readObject();
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }

    public void escribirLista(String direccion, List<Futbolista> listaFutbolista) {
        try {
            ObjectOutputStream leer = new ObjectOutputStream(new FileOutputStream(direccion));
            for (Futbolista futbolista : listaFutbolista) {
                leer.writeObject(futbolista);
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }
        public List <Futbolista> lista(String direccion){
         List<Futbolista> lista = new ArrayList<>();
        try{
        ObjectInputStream leer = new ObjectInputStream(new FileInputStream(direccion));
          Object auxiliar = leer.readObject();
          while (auxiliar!=null){
              
              Futbolista futbolista = (Futbolista) auxiliar;
            System.out.println(futbolista.getEquipo().getNombre());
            auxiliar = leer.readObject();
          }
              
        } catch (Exception e){
                
        } 
        return lista;
        }
        
public void escribir1(String archivo,Colores colores) {

        try {
            ObjectOutputStream ejemplo = new ObjectOutputStream(new FileOutputStream(archivo));
            ejemplo.writeObject(colores);
            ejemplo.close();
        } catch (IOException e) {
            System.out.println("erro " + e);
        }

    }

    public void archivo1(String archivo) {
        try {
            ObjectInputStream leer = new ObjectInputStream(new FileInputStream(archivo));
            Object auxiliar = leer.readObject();
            Colores colores = (Colores) auxiliar;
            System.out.println(colores.getEquipo().getNombre());

        } catch (Exception e) {

            System.out.println("error " + e);

        }
    }

    public void LeerArchivo1(String ruta) {
        try {
            //leer el archivo
            ObjectInputStream leer = new ObjectInputStream(new FileInputStream(ruta));
            Object auxiliar = leer.readObject();

            
            while (auxiliar != null) {
            Colores colores = (Colores) auxiliar;
            System.out.println(colores.getEquipo().getNombre());
            auxiliar = leer.readObject();
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }

    public void escribirLista1(String direccion, List<Colores> lista2Colores) {
        try {
            ObjectOutputStream leer = new ObjectOutputStream(new FileOutputStream(direccion));
            for (Colores colores : lista2Colores) {
                leer.writeObject(colores);
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }
        public List <Colores> lista2(String direccion){
         List<Colores> lista2 = new ArrayList<>();
        try{
        ObjectInputStream leer = new ObjectInputStream(new FileInputStream(direccion));
          Object auxiliar = leer.readObject();
          while (auxiliar!=null){
              
             Colores colores = (Colores) auxiliar;
            System.out.println(colores.getEquipo().getNombre());
            auxiliar = leer.readObject();
          }
              
        } catch (Exception e){
                
        } 
        return lista2;
        }
        

        
    public static void main(String[] args) {
        LeerArchivo objeto = new LeerArchivo();
        LeerArchivo objeto2 = new LeerArchivo();
        Futbolista objeto1= new Futbolista(new Equipo("Barcelona", 11,"los mejores", 23, 1150595555), 23, "Rafael", 1.65, 20,10,20.40,30);
        objeto.escribir("C:\\Users\\Rafael\\Desktop/Yolo.txt", objeto1);
        Colores objeto3= new Colores(new Equipo("Nacional", 11,"los mejores", 23, 1176595555), 4,"Rojo y Amarillo");
        objeto2.escribir1("C:\\Users\\Rafael\\Desktop/Yolo.txt", objeto3);
        objeto.archivo("C:\\Users\\Rafael\\Desktop/Yolo.txt");
        objeto2.archivo1("C:\\Users\\Rafael\\Desktop/Yolo.txt");
        
         
        
        List<Futbolista> lista = new ArrayList<>();
        List<Colores> lista2 = new ArrayList<>();
        lista.add(objeto1);
        lista2.add(objeto3);

        objeto.escribirLista("C:\\Users\\Rafael\\Desktop/Yolo.txt", lista);
        objeto2.escribirLista1("C:\\Users\\Rafael\\Desktop/Yolo.txt", lista2);
        objeto.LeerArchivo("C:\\Users\\Rafael\\Desktop/Yolo.txt");
        objeto2.LeerArchivo1("C:\\Users\\Rafael\\Desktop/Yolo.txt");
        List<Futbolista> lista1 = objeto.lista("C:\\Users\\Rafael\\Desktop/Yolo.txt");
//        List2<Colores> lista2 = objeto.lista2("C:\\Users\\Rafael\\Desktop/Yolo.txt");
    for (Futbolista futbolista: lista1) {
        for (Colores colores: lista2) {
            System.out.println(objeto1.getNombre());
             System.out.println(objeto3.getColor());
        }
    }
    }}

