package practice_9;

// Пример класса, представляющего собаку с именем и ценой
class Dog implements Nameable, Priceable {
    private String name;
    private double price;

    public Dog(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}