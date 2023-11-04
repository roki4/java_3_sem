public class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("Alexander Sergeevich Pushkin", "abcdefg@mail.ru", 'M');
        Author author2 = new Author("Abramtseva Natalya Kornelievna", "hijklmn@mail.ru", 'F');

        System.out.println(author1.getEmail());
        System.out.println(author2.getGender());
        System.out.println(author2.getName());
        System.out.println(author1.toString());
        System.out.println(author2.toString());
    }
}