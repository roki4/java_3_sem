package practice_6;

class Chair extends Furniture {
    private int numberOfLegs;

    public Chair(String name, double price, int numberOfLegs) {
        super(name, price);
        this.numberOfLegs = numberOfLegs;
    }

    public void displayInfo() {
        System.out.println("Chair: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Number of legs: " + numberOfLegs);
    }
}