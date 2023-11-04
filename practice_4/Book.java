package practice_4;

public class Book {
    private String author;
    private String title;
    private int yearWritten;

    public Book(String author, String title, int yearWritten) {
        this.author = author;
        this.title = title;
        this.yearWritten = yearWritten;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearWritten() {
        return yearWritten;
    }

    public void setYearWritten(int yearWritten) {
        this.yearWritten = yearWritten;
    }
}