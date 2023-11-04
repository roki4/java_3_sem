package practice_6;

public class Main3 {
    public static void main(String[] args) {
        Chair chair1 = new Chair("Wooden Chair", 49.99, 4);
        Table table1 = new Table("Dining Table", 199.99, 6);
        Chair chair2 = new Chair("Office Chair", 79.99, 5);
        Table table2 = new Table("Coffee Table", 99.99, 2);

        Furniture[] furnitureArray = {chair1, table1, chair2, table2};
        FurnitureShop furnitureShop = new FurnitureShop(furnitureArray);
        furnitureShop.displayAllFurniture();
    }
}