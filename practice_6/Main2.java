package practice_6;

public class Main2 {
    public static void main(String[] args) {
        Labrador labrador = new Labrador("Labrador Retriever", 3);
        System.out.println("Breed: " + labrador.getBreed());
        System.out.println("Age: " + labrador.getAge());
        labrador.makeSound();

        Bulldog bulldog = new Bulldog("English Bulldog", 5);
        System.out.println("Breed: " + bulldog.getBreed());
        System.out.println("Age: " + bulldog.getAge());
        bulldog.makeSound();
    }
}