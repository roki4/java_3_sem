package practice_6;

class Labrador extends Dog {
    public Labrador(String breed, int age) {
        super(breed, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Labrador is barking");
    }
}