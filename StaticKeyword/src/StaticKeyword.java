public class StaticKeyword {
    public static void main(String[] args) {
        Human vyom = new Human("VYOM",21);
        Human Dex = new Human("Dex",21);
        System.out.println(vyom.name+":"+vyom.age+" "+"legs:"+Human.legs);
        vyom.id(vyom);
    }
}
