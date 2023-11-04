package practice_6;

class Plate extends Dish {
    private int diameter;

    public Plate(String material, int price, int diameter) {
        super(material, price);
        this.diameter = diameter;
    }

    @Override
    public void use() {
        System.out.println("Using the plate");
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
}