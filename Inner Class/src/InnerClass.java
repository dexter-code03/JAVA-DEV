//
abstract class Car
{
    public abstract void drive();
}

public class InnerClass {
    public static void main(String[] args) {
        Car alto = new Car()
        {
            @Override
            public void drive() {
                System.out.println("Flying..");
            }
            public void fly()
            {
                System.out.println("Driving");
            }
        };
        alto.drive();
//        alto.fly();bcs the fly method when checked by compiler it is not available in Car class thats why it throws commpilation error


    }
}
