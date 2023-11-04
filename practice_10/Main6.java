package practice_10;

public class Main6 {
    public static void main(String[] args) {
        int n = 16;

        if (isPrime(n, 2)) {
            System.out.println("YES"); // число простое
        } else {
            System.out.println("NO"); // число составное
        }
    }

    // Рекурсивная функция для проверки, является ли число n простым
    // Параметр divisor - текущий делитель для проверки
    public static boolean isPrime(int n, int divisor) {
        // Базовый случай: если n меньше или равно 1, то оно не является простым числом
        if (n <= 1) {
            return false;
        }

        // Если текущий делитель стал больше, чем корень из n, то n простое
        if (divisor * divisor > n) {
            return true;
        }

        // Если n делится на divisor без остатка, то оно составное
        if (n % divisor == 0) {
            return false;
        }

        // Вызываем рекурсивно функцию с увеличенным делителем
        return isPrime(n, divisor + 1);
    }
}