public class Differentmethods {
    // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main method
  public static void main(String[] args) {
    myStaticMethod(); // El método estático puede llamarse desde main sin instanciar
    // myPublicMethod(); Esto generaría un error

    Differentmethods myObj = new Differentmethods(); // Se genera una instancia de la clase
    myObj.myPublicMethod(); // Se puede llamar el método público
  }
}
