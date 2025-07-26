public class C extends B{
    public C() {
        System.out.println("CCCCCCCC");
    }
    public C(int a)
    {
        System.out.println(a+20);
    }


    @Override
    public void show() {
        System.out.println(num+2);
    }

    @Override
    public void show2() {
        System.out.println(num+10);
    }
}
