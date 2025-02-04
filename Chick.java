//Abstract Class

//Defined by the abstract keyword
//Can define a class or method
//Abstract methods dont need a body
//for secure error free programs;
//Cant inherit an abstract class, must use the subclass of the abstract class


public abstract class Chick implements Chicken {
    

    // Implementing the eat() method from Animal interface
    public void eat() {
        System.out.println("I am eating.");
    }

    // Abstract method to be implemented by subclasses
    abstract void walk();
}