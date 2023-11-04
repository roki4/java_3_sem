package practice_6;

class Table extends Furniture {
    private int numberOfSeats;

    public Table(String name, double price, int numberOfSeats) {
        super(name, price);
        this.numberOfSeats = numberOfSeats;
    }

    public void displayInfo() {
        System.out.println("Table: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Number of seats: " + numberOfSeats);
    }
}