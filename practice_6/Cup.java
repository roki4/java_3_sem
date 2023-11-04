package practice_6;

class Cup extends Dish {
    private int capacity;

    public Cup(String material, int price, int capacity) {
        super(material, price);
        this.capacity = capacity;
    }

    @Override
    public void use() {
        System.out.println("Using the cup");
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}