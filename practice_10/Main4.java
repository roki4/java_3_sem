package practice_10;

public class Main4 {
    public static void main(String[] args) {
        int k = 3; // k - количество цифр
        int s = 15; // s - сумма цифр

        int count = countNumbersWithSum(k, s);
        System.out.println("Количество " + k + "-значных чисел с суммой цифр " + s + " равно " + count);
    }

    // Функция для подсчета количества k-значных чисел с суммой цифр s
    public static int countNumbersWithSum(int k, int s) {
        int count = 0;

        // Используем вложенные циклы для перебора всех возможных комбинаций цифр
        for (int firstDigit = 1; firstDigit <= 9; firstDigit++) {
            // Проверяем, что сумма оставшихся (k - 1) цифр не превышает (s - firstDigit)
            if (s - firstDigit >= 0 && s - firstDigit <= 9 * (k - 1)) {
                // Если условие выполняется, увеличиваем счетчик
                count += countNumbersWithSumRec(k - 1, s - firstDigit);
            }
        }

        return count;
    }

    // Рекурсивная функция для подсчета количества k-значных чисел с суммой цифр s
    public static int countNumbersWithSumRec(int k, int s) {
        // Базовый случай: если k = 1, возвращаем 1, если s находится в пределах от 1 до 9, иначе возвращаем 0
        if (k == 1) {
            return (s >= 1 && s <= 9) ? 1 : 0;
        }

        int count = 0;

        // Используем рекурсию для подсчета количества чисел с уменьшенным k и s
        for (int digit = 0; digit <= 9 && s - digit >= 0; digit++) {
            count += countNumbersWithSumRec(k - 1, s - digit);
        }

        return count;
    }
}