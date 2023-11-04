package practice_10;

public class Main7 {
    public static void main(String[] args) {
        int n = 36; // натуральное число

        System.out.println("Простые множители числа " + n + ":");
        printPrimeFactors(n, 2);
    }

    // Рекурсивная функция для вывода простых множителей числа n
    // Параметр divisor - текущий делитель для проверки
    public static void printPrimeFactors(int n, int divisor) {
        // Базовый случай: если n меньше или равно 1, завершаем рекурсию
        if (n <= 1) {
            return;
        }

        // Если текущий делитель делит n без остатка, это простой множитель
        if (n % divisor == 0) {
            System.out.print(divisor + " ");
            // Рекурсивно вызываем функцию для оставшейся части числа
            printPrimeFactors(n / divisor, divisor);
        } else {
            // Если текущий делитель не делит n без остатка, увеличиваем делитель
            printPrimeFactors(n, divisor + 1);
        }
    }
}