import java.lang.*;

public class Ball {
    private String color;

    public Ball(String color) {

        this.color = color;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public String toString() {

        return "Ball color is " + color;
    }
}