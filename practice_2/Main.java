package practice_2;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // 1
        System.out.println("Первый номер: ");
        int[]numbers = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Сумма элементов массива 'sum', посчитанная циклом 'for' равна " + sum);

        sum = 0;
        int i = 0;
        do {
            sum += numbers[i];
            i++;
        } while (i < numbers.length);

        System.out.println("Сумма элементов массива 'sum', посчитанная циклом 'do/while' равна " + sum);
        sum = 0;
        i = 0;

        while (i < numbers.length) {
            sum += numbers[i];
            i++;
        }

        System.out.println("Сумма элементов массива 'sum', посчитанная циклом 'while' равна " + sum);
        // 2
//        System.out.println("Второй номер: ");
//        for (int k = 0; k < args.length; k++) {
//            System.out.println("Аргумент " + (k + 1) + ": " + args[k]);
//        }

        // 3
        for (int k = 1; k <= 10; k++) {
            System.out.println(k + " число гармонического ряда: " + (1.0 / k));
        }

        // 4
        Random random = new Random();
        int[] arr = new int[10];

        for (int k = 0; k < arr.length; k++) {
            arr[k] = random.nextInt(100);
        }

        System.out.println("Неотсортированный массив: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Отсортированный массив: " + Arrays.toString(arr));
        // 5
        System.out.println("Пятый номер:");
        System.out.println(factorial(3));
    }
    // функция, которая считает факториал
    public static long factorial(int n) {
        long f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }
}