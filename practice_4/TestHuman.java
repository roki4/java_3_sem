package practice_4;

public class TestHuman {
    public static void main(String[] args) {
        Head head = new Head("brown", "blue");
        Leg leftLeg = new Leg(100);
        Leg rightLeg = new Leg(100);
        Hand leftHand = new Hand(5);
        Hand rightHand = new Hand(5);

        Human human = new Human(head, leftLeg, rightLeg, leftHand, rightHand);

    }
}