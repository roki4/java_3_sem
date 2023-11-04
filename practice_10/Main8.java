package practice_10;

public class Main8 {
    public static void main(String[] args) {
        String word = "lol"; // слово для проверки

        if (isPalindrome(word)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    // Рекурсивная функция для проверки, является ли слово палиндромом
    public static boolean isPalindrome(String word) {
        int length = word.length();

        // Базовый случай: если длина слова меньше или равна 1, оно считается палиндромом
        if (length <= 1) {
            return true;
        }

        // Сравниваем первую и последнюю буквы слова (без учета регистра)
        char firstChar = Character.toLowerCase(word.charAt(0));
        char lastChar = Character.toLowerCase(word.charAt(length - 1));

        // Если первая и последняя буквы не совпадают, это не палиндром
        if (firstChar != lastChar) {
            return false;
        }

        // Вызываем рекурсивно функцию для сравнения оставшейся части слова без первой и последней букв
        return isPalindrome(word.substring(1, length - 1));
    }
}