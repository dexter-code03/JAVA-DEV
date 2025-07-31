//abstract class A
//{
//    abstract public void show();
//    abstract public void move();
//}

// TOPIC 1: BASIC INTERFACE WITH CONSTANTS AND METHODS
interface Blueprint
{
    // Interface variables are implicitly public, static, and final
    // These act as constants that can be accessed without creating objects
    int legs = 2;//it will be final and static
    int hands = 2;

    // Interface methods are implicitly public and abstract
    // Any class implementing this interface must provide implementations
    void moveHands();
    void moveLegs();
}

// TOPIC 2: IMPLEMENTING AN INTERFACE
class Human implements Blueprint
{
    // Must be public because interface methods are implicitly public
    // This is the concrete implementation of the abstract method from Blueprint
    public void moveHands ()
    {
        System.out.println("Move Hands");
    }

    // Must provide implementation for all methods declared in the interface
    public void moveLegs ()
    {
        System.out.println("Move legs");
    }
}

// TOPIC 3: INTERFACE INHERITANCE CHAIN
// Interfaces can extend other interfaces, creating a hierarchy
interface A
{
    void printA();
}

// Interface B extends A, so it inherits printA() method
// Any class implementing B must implement both printA() and printB()
interface B extends A
{
    void printB();
}

// Interface C extends B, which means it inherits both printA() and printB()
// Any class implementing C must implement all three methods
interface C extends B
{
    void printC();
}

// TOPIC 4: MULTIPLE INTERFACE IMPLEMENTATION
// This class implements all three interfaces A, B, and C
// Since C extends B extends A, implementing C alone would be sufficient
class Imp implements A,B,C
{
    // Implementation of method from interface A
    @Override
    public void printA() {
        System.out.println("hello A");
    }

    // Implementation of method from interface B
    @Override
    public void printB() {
        System.out.println("hello B");
    }

    // Implementation of method from interface C
    @Override
    public void printC() {
        System.out.println("hello C");
    }
}

// TOPIC 5: STRATEGY PATTERN WITH INTERFACES
// This interface defines a contract for computer operations
interface Computer
{
    // Any implementing class must provide their own version of run()
    String run();
}

// Concrete implementation of Computer interface for Desktop
class Desktop implements Computer
{
    // Desktop's specific implementation of run method
    public String run()
    {
        return "Desktop";
    }
}

// Concrete implementation of Computer interface for Laptop
class Laptop implements Computer
{
    // Laptop's specific implementation of run method
    public String run()
    {
        return "Laptop";
    }
}

// TOPIC 6: DEPENDENCY INJECTION AND POLYMORPHISM
// This class doesn't depend on specific computer types, only the Computer interface
class Developer
{
    // This method accepts any object that implements Computer interface
    // This is polymorphism - same method works with different implementations
    public void work(Computer machine)
    {
        // Calls the run() method of whatever Computer implementation is passed
        System.out.println("Developer working on " + machine.run());
    }
}

public class Interface {
    public static void main(String[] args) {
        // DEMONSTRATION 1: Basic interface implementation
        Human a = new Human();
        a.moveHands();  // Calls Human's implementation of moveHands()
        a.moveLegs();   // Calls Human's implementation of moveLegs()

        /////
        // DEMONSTRATION 2: Interface inheritance and polymorphism
        // Reference type is B, but object type is Imp
        B test = new Imp();
        test.printA();  // Available because B extends A
        test.printB();  // Available in B interface
        // test.printC(); // Would NOT compile - printC() not visible through B reference

        // Reference type is C, so all methods are accessible
        C test1 = new Imp();
        test1.printC(); // Available in C interface
        // test1.printA() and test1.printB() are also available but not called here

        //
        // DEMONSTRATION 3: Strategy pattern and polymorphism
        // Both variables are Computer type, but hold different implementations
        Computer dell = new Laptop();    // Computer reference, Laptop object
        Computer lenevo = new Desktop();  // Computer reference, Desktop object

        // Developer works with any Computer implementation
        Developer vyom = new Developer();
        vyom.work(dell);    // Passes Laptop object, calls Laptop's run() method
        vyom.work(lenevo);  // Passes Desktop object, calls Desktop's run() method
        // This demonstrates loose coupling - Developer doesn't need to know specific types
    }
}
