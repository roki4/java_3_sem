package practice_6;

abstract class Furniture {
    protected String name;
    protected double price;

    public Furniture(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void displayInfo();
}
