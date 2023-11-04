package practice_4;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, 0.0, 0.0);

        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Center X: " + circle.getCenterX());
        System.out.println("Center Y: " + circle.getCenterY());

        circle.setRadius(7.0);
        circle.setCenterX(2.0);
        circle.setCenterY(3.0);

        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Center X: " + circle.getCenterX());
        System.out.println("Center Y: " + circle.getCenterY());
    }
}