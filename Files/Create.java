package Files;
import java.io.File;

public class Create {

    public static void main(String[] args) {
        File myObj = new File("Files/test.txt");
        // Crea el archivo si no existe
        try {
            if(myObj.createNewFile()){
                System.out.println("Se creó el archivo.");
            } else {
                System.out.println("El archivo ya existe.");
            }

        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }

    }
}
