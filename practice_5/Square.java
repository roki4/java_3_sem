package practice_5;

public class Square extends Rectangle {
    private double side;

    public Square(double side, String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.side = side;
    }

    public Square() {}

    public Square(double side) {
        this.color = "green";
        this.filled = false;
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "Square{" + "side = " + side + ", color = '" + color + '\'' + ", filled = " + filled + '}';
    }
}