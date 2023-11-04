public class TestBall {
    public static void main(String[] args) {
        Ball ball1 = new Ball("red");
        Ball ball2 = new Ball("blue");

        System.out.println(ball1.toString());
        System.out.println(ball2.toString());

        ball1.setColor("green");
        System.out.println(ball1.toString());
    }
}