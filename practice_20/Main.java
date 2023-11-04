package practice_20;

public class Main {

    public static void main(String[] args) {

        String result;
        RPNCalculator calculator = new RPNCalculator();

        // Test 1: Normal operation
        result = calculator.calculate(new String[]{"2", "3", "+"});
        System.out.println("Expected Result: '5.0', Actual Result: '" + result + "'");

        // Test 2: Invalid operator
        result = calculator.calculate(new String[]{"2", "3", "x"});
        System.out.println("Expected Result: 'Invalid operator: x', Actual Result: '" + result + "'");

        // Test 3: Less operands
        result = calculator.calculate(new String[]{"2", "+"});
        System.out.println("Expected Result: 'Not enough operands for the operation: +', Actual Result: '" + result + "'");

        // Test 4: More operands
        result = calculator.calculate(new String[]{"2", "3", "4", "+"});
        System.out.println("Expected Result: 'Invalid expression: more operands than operations', Actual Result: '" + result + "'");

        // Test 5: Division by zero
        result = calculator.calculate(new String[]{"2", "0", "/"});
        System.out.println("Expected Result: 'Can't divide by zero', Actual Result: '" + result + "'");

        // Test 6: Double overflow
        result = calculator.calculate(new String[]{Double.toString(Double.MAX_VALUE), "2", "*"});
        System.out.println("Expected Result: 'Number out of range: " + Double.POSITIVE_INFINITY + "', Actual Result: '" + result + "'");

    }
}