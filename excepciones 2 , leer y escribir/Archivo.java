package excepciones17072019;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

public class Archivo {

    public static void main(String[] args) {
        File archivo = new File("C:\\Users\\USUARIO\\Desktop\\texto.txt");
 //       System.out.println(archivo.exists());
        //para saber si el archivo no existe, devuelve true o false
    //    System.out.println(archivo.isDirectory());
        //para saber si es en una carpeta, devuelve true o false
        //Para saber la fecha de modificacion del archivo
 //       System.out.println(archivo.lastModified());
        //para obtener el nombre//
  //      System.out.println(archivo.getName());
        //sirve para borrar el archivo
        //System.out.println(archivo.delete());
        //para saber los archivos de una carpeta
  //      File carpeta = new File("C\\Users\\USUARIO\\Desktop\\");
//       String[] archivos = carpeta.list();
//       for (int i = 0; i < archivos.length; i++) {
//          System.out.println(archivos[i]);
//      }
        try{
        FileReader lector = new FileReader(archivo);//pasar el archivo a un objeto
        //para abrir el archivo y recorrer el archivo
        BufferedReader re = new BufferedReader(lector);
        String Linea = ""; 
        while ((Linea = re.readLine()) != null) {//Sirve para leer linea por linea el archivo
            System.out.println(Linea);
        }
        re.close();//para cerrar el archivo
        }catch(Exception e){
            System.out.println("ocurrio el error:" + e);
        }
        
        
   
        
     
        
    }

}
