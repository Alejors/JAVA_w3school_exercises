package Files;
import java.io.File;

public class Delete {
    public static void main(String[] args){
        File file = new File("Files/test.txt");
        if(file.delete()){
            System.out.println("Se borró el archivo " + file.getName());
        }else{
            System.out.println("No se pudo borrar el archivo.");
        }
    }   
}
