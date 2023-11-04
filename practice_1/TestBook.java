public class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book("Rich dad, poor dad", "Robert Kiyosaki");
        Book book2 = new Book("Grok algorithms", "Aditya Bhargavam algorithms");

        System.out.println(book1.toString());
        System.out.println(book2.toString());

        book1.setAuthor("J.D. Salinger");
        System.out.println(book1.toString());
    }
}