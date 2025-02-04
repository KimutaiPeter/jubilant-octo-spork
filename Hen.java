//Concrete class
//Normal class we create instances of...

public class Hen extends Chick {
    String name;

    public Hen(String assig_name) {
        this.name=assig_name;
    }

    @Override
    void walk() {
        System.out.println(name + " is walking on 2 legs.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Chirp! Chirp! I will be a hen one day");
    }
}