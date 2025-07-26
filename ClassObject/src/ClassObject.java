class Cars{
    private int gates;
    private int wheels;
    private int sheets;

    Cars(String name,int gates,int wheels,int sheets)
    {
        System.out.println("Constructor Called");
        this.gates=gates;
        this.sheets=sheets;
        this.wheels=wheels;
        System.out.println(name+" created");

    }

    public int getSheets()
    {
        return sheets;
    }
    public void setSheets(int sheets)
    {
        this.sheets = sheets;
    }
    public int getGates()
    {
        return gates;
    }
    public void setGates(int gates)
    {
        this.gates = gates;
    }
    public int getWheels()
    {
        return wheels;
    }
    public void setWheels(int wheels)
    {
        this.wheels = wheels;
    }
}

class ClassObject {
    public static void main(String[] args) {
        Cars nano = new Cars("nano",4,4,5);
        nano.setGates(9);
        nano.setWheels(10);
        nano.setSheets(6);
        System.out.println("Gates:"+nano.getGates()+"\nSheets:"+nano.getSheets()+"\nWheels:"+nano.getWheels());

    }
}
