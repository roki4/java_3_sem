package practice_10;

public class Main5 {
    public static void main(String[] args) {
        int N = 12345;

        int sum = calculateSumOfDigits(N);
        System.out.println("Сумма цифр числа " + N + " равна " + sum);
    }

    // Рекурсивная функция для вычисления суммы цифр числа N
    public static int calculateSumOfDigits(int N) {
        // Базовый случай: если N меньше 10, то сумма цифр равна самому числу
        if (N < 10) {
            return N;
        }

        // Вызываем рекурсивно функцию для суммы цифр оставшейся части числа и добавляем последнюю цифру
        return N % 10 + calculateSumOfDigits(N / 10);
    }
}