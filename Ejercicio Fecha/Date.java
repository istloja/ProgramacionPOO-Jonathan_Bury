
package ProgramacionPoo;

import java.util.Date;

public class Date-TareaFecha {
    public static void main(String[] args) {
       /* Date fecha = new Date();
        System.out.println(fecha);
        System.out.println("Year:"+ (fecha.getYear()+1900));
        System.out.println("Month:"+fecha.getMonth());
        System.out.println("Day:"+fecha.getDay());
        System.out.println("Hour:"+fecha.getHours());*/
       
       Date fecha = new Date(101,6,18);
       Date fechaActual = new Date();
        System.out.println(fecha.after(fechaActual));
        System.out.println(fecha.before(fechaActual));
    }
    
}