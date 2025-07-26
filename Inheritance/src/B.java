public class B extends A {
    public B() {
        System.out.println("BBBBBBBBB");
    }

    @Override
    public void show() {
        System.out.println( num+1);
    }
    public void show2()
    {
        System.out.println(num+5);
    }
}
