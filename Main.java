//Main function
public class Main {
    public static void main(String[] args) {
        Hen hen = new Hen("Chickenlina");

        hen.eat();       // Implemented in Mammal
        hen.walk();      // Implemented in Dog
        hen.makeSound(); // Implemented in Dog
    }
}