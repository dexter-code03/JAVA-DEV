public class Student {
    private String name;
    private int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public void show()
    {
        System.out.println(name+":"+id);
    }
}
