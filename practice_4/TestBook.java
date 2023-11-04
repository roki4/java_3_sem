package practice_4;

public class TestBook {
    public static void main(String[] args) {
        Book book = new Book("John Doe", "The Book", 2000);

        System.out.println("Author: " + book.getAuthor());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Year Written: " + book.getYearWritten());

        book.setAuthor("Jane Smith");
        book.setTitle("New Book");
        book.setYearWritten(2021);

        System.out.println("Author: " + book.getAuthor());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Year Written: " + book.getYearWritten());
    }
}