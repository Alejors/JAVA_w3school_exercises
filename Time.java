import java.time.*;
import java.time.format.DateTimeFormatter;

public class Time {
    public static void main(String[] args){
        /* OPCION 1
        
        //CREAMOS UN OBJETO DE FECHA
        LocalDate today = LocalDate.now();
        
        //CREAR UN OBJETO DE HORA
        LocalTime time = LocalTime.now();
         
        */

        /*OPCION 2
        CREAR UN OBJETO CON FECHA Y HORA*/
        LocalDateTime now = LocalDateTime.now();

        //CREAR UN FORMATO PARA MOSTRAR FECHA Y OTRO PARA HORA
        DateTimeFormatter myDateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter myTimeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
        
        String today = now.format(myDateFormat);
        String time = now.format(myTimeFormat);
        //MOSTRAR LOS OBJETOS
        System.out.println(today);
        System.out.println(time);
        
    }
}
