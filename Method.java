public class Method {
    static void myMethod(){
        System.out.println("Me llamaron desde Main");
    }

    static void variableMethod(String name){
        System.out.println("Bienvenido al aprendizaje " + name);
    }

    static void multipleVariable(String name, int age){
        System.out.println("El usuario es: " + name + ". Su edad es: " + age);
    }

    static int returnDouble(int amount){
        return amount * 2;
    }

    public static void main(String[] args){
        // myMethod();
        // variableMethod("Alejandro");
        // multipleVariable("Majo", 25);
        // System.out.println(returnDouble(5));
        int twice = returnDouble(7);
        System.out.println(twice);
    }
}
