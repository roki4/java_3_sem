package practice_16;

import java.util.Scanner;
//                                    Третий тест
public class ThrowsDemo2 {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key = "";
        while(key.equals("")) {
            System.out.println("Enter a key:");
            key = myScanner.nextLine();
            try {
                printDetails(key);
            } catch (Exception e) {
                System.out.println("Caught an exception in printDetails method.");
                key = "";  // Reset key to give the user another attempt
            }
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
}