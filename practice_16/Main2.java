package practice_16;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        ThrowsDemo2 demo = new ThrowsDemo2();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a key:");
        String key = scanner.nextLine();

        try {
            demo.printDetails(key);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}