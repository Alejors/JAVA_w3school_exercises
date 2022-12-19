package Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args){
        //La Forma de crear un listado mutable.
        ArrayList<String> autos = new ArrayList<String>();

        //Agregar contenido
        autos.add("Volvo");
        autos.add("Suzuki");
        autos.add("Mitsubishi");
        autos.add("BMW");
        System.out.println(autos);

        //Acceder a un contenido particular
        System.out.println(autos.get(2));

        //Quitar contenido
        autos.remove(2);
        System.out.println("Tras eliminar, el tamaño es " + autos.size());

        //Ordenar con Collections
        System.out.println("Lista ordenada:");
        Collections.sort(autos);
        System.out.println(autos);
    }
}
