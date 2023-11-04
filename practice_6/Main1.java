package practice_6;

public class Main1 {
    public static void main(String[] args) {
        Plate plate = new Plate("glass", 10, 20);
        System.out.println("Material: " + plate.getMaterial());
        System.out.println("Price: " + plate.getPrice());
        System.out.println("Diameter: " + plate.getDiameter());
        plate.use();

        Cup cup = new Cup("porcelain", 5, 200);
        System.out.println("Material: " + cup.getMaterial());
        System.out.println("Price: " + cup.getPrice());
        System.out.println("Capacity: " + cup.getCapacity());
        cup.use();
    }
}