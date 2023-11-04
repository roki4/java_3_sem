package practice_5;

class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {}

    public Rectangle(String color, boolean filled, double width, double length) {
        this.color = color;
        this.filled = filled;
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length) {
        this.color = "red";
        this.filled = true;
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}