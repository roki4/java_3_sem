package practice_9;

public class ObjectInterfacesExample {
    public static void main(String[] args) {
        // Создаем объекты с различными именами и ценами
        Dog bulldog = new Dog("Chucky", 150);
        Car bmw = new Car("BMW", 50000);

        // Проверяем методы getName() и getPrice() для объектов
        System.out.println("Имя собаки: " + bulldog.getName());
        System.out.println("Цена BMW: $" + bmw.getPrice());
    }
}