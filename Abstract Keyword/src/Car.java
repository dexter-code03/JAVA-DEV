// Abstract class Car
abstract public class Car {
//    public void drive()
//    {
//
//    }
// Abstract method drive - must be implemented by subclasses
    public abstract void drive();//No need to implement just define the method and it will define by class which uses this class
    // Concrete method music - provides implementation
    public void music()
    {
        System.out.println("Playing..");
    }

}
