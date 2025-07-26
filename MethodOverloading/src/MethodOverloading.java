class TestOverLoad
{
    final private int a;

    TestOverLoad(int a)
    {
        this.a=a;
    }
    //You can create method with same name just parameters should be different
    public int sum(int b,int c)
    {
        return a+b+c;
    }
    public int sum(int b,int c,int d)
    {
        return a+b+c+d;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        TestOverLoad demo = new TestOverLoad(10);
        System.out.println("Method Overloading:\n"+"Sum:"+demo.sum(2,6)+"\n"+"Sum:"+demo.sum(2,6,9));
    }
}
