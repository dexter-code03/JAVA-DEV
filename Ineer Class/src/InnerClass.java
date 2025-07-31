class Car
{
    public void drive()
    {
        System.out.println("Driving");
    }

    static class Alto extends Car
    {
        public void drive()
        {
            System.out.println("Alto Driving....");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        //Alto maruti = new Alto();Wrong
        //Car.Alto maruti = new Car.Alto();Alto is not created so it is not be used without making it static
        Car obj = new Car();
        //Car.Alto maruti = obj.new Car.Alto();//without static

        new Car.Alto().drive();//anonymous inner object

        Car.Alto waganR = new Car.Alto();
        waganR.drive();

        Car obj2 = new Car.Alto();
    }
}
