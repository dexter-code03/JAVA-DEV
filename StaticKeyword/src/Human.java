public class Human {
    String name;
    int age;
    public static int legs;
    public static int hands;

    static
    {
        legs = 2;
        hands = 2;
        System.out.println("Static Block Executed");
    }

    Human(String name,int age)
    {
        this.age=age;
        this.name=name;
        System.out.println("Constructor Executed");
    }

    static void id(Human obj)
    {
        System.out.println(obj.name+":"+obj.age+" "+"legs:"+legs);
    }

}
