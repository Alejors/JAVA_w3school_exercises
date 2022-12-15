import java.util.Scanner;

public class Prompt {
    public static void main(String[] args){
        System.out.println("¿Qué edad tienes?");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        in.close();
        System.out.print("Tienes " + age + " años. ");
        if(age >= 18){
            System.out.println("Eres un adulto...haz algo de tu vida!");
        }else{
            System.out.println("Deberías estar en el colegio a esta hora.");
        }
    }
}
