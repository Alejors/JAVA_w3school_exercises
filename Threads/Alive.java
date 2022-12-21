package Threads;

public class Alive extends Thread{ //una opción a extends es implements Runnable, así se puede extender más clases y usar threads
    public static int amount = 0;
    
    public static void main (String[] args){
        Alive thread = new Alive();
        thread.start();

        //Ahora se usa método isAlive() para esperar el thread
        while(thread.isAlive()){
            System.out.println("Esperando...");
        }

        System.out.println("Main: " + amount);
        amount ++;
        System.out.println("Main: " + amount);
    }

    public void run(){
        amount ++;
    }
}
