package Files;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public static void main(String[] args){
        try{
            FileWriter writer = new FileWriter("Files/test.txt");
            for(int i = 0; i < 10; i++){
                writer.write((i+1) + " Mississipi\n");
            }
            System.out.println("Se escribió el archivo.");
            writer.close();
        }catch(IOException e){
            System.out.println("Ups, algo malió sal");
            e.printStackTrace();

        }
    }
}
