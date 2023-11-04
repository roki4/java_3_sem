package practice_16;

import java.util.Scanner;
//                              Второй тест
public class ThrowsDemo1 {
    public void getKey() {
        Scanner myScanner = new Scanner( System.in );
        String key = myScanner.next();
        printDetails( key );
    }

    public void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println( message );
        } catch ( Exception e) {
            System.out.println("Caught an exception in printDetails method.");
        }
    }

    private String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }
}