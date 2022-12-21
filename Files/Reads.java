package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reads {
    public static void main(String[] args){
        try {
            File file = new File("Files/test.txt");
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ocurrió un error");
            e.printStackTrace();
        }
    }
}
