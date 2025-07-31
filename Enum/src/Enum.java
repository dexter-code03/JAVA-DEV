enum Laptop
{
     Lenevo(500),Macbook(1000),Dell(200),Asus(800);
    private final int price;

    public int getPrice() {
        return price;
    }

    Laptop(int price) {
        this.price = price;
    }
}
public class Enum {
    public static void main(String[] args) {
        Laptop [] device = Laptop.values();
        Laptop gig = Laptop.Macbook;
        System.out.println(gig.getClass().getSuperclass());//enum is class


        for(Laptop i : device )
        {
            System.out.println(i + ":" + i.getPrice());
        }
    }
}
