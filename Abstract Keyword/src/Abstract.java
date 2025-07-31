public class Abstract {
    public static void main(String[] args) {
        //Abstract Keyword
        Alto maruti = new Alto();
        maruti.drive();
        maruti.music();
        //Car alto = new Car();'Car' is abstract; cannot be instantiated
        Car WaganR = new Alto();
        WaganR.drive();
        WaganR.music();

    }
}
