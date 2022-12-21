package Exceptions;

public class Throw {
    static void checkAge(int age){
        if(age < 18){
            throw new ArithmeticException("Access denied - Does not comply minimum age.");
        }else{
            System.out.println("Access granted - Meets required age!");
        }
    }
    public static void main(String[] args){
        //Ends program with error message described
        // checkAge(15);

        //This prints Access granted message
        checkAge(20);
    }
}
