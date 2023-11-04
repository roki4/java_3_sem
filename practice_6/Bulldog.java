package practice_6;

class Bulldog extends Dog {
    public Bulldog(String breed, int age) {
        super(breed, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Bulldog is barking");
    }
}