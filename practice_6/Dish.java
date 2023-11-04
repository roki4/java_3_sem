package practice_6;

abstract class Dish {
    private String material;
    private int price;

    public Dish(String material, int price) {
        this.material = material;
        this.price = price;
    }

    public abstract void use();

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}