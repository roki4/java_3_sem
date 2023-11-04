import java.awt.*;
import java.util.Random;
import javax.swing.*;

abstract class Shape {
    protected Color color;
    protected int x, y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public abstract void draw(Graphics g);
}

class Rectangle extends Shape {
    private int width, height;

    public Rectangle(Color color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}

class Circle extends Shape {
    private int radius;

    public Circle(Color color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}

public class RandomShapes extends JPanel {
    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;
    private static final int NUM_SHAPES = 20;

    private Shape[] shapes;

    public RandomShapes() {
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

        shapes = new Shape[NUM_SHAPES];
        Random random = new Random();

        for (int i = 0; i < NUM_SHAPES; i++) {
            int x = random.nextInt(WIDTH);
            int y = random.nextInt(HEIGHT);
            int size = random.nextInt(50) + 50;
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

            if (random.nextBoolean()) {
                shapes[i] = new Rectangle(color, x, y, size, size);
            } else {
                shapes[i] = new Circle(color, x, y, size / 2);
            }
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new RandomShapes());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
