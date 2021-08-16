import java.text.DecimalFormat;
import java.util.Scanner;

public class Math_operations_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int b = Integer.parseInt(scanner.nextLine());

        double result = calculate(a, operator, b);
        System.out.println(new DecimalFormat().format(result));
    }

    private static double calculate(int a, String operator, int b) {
        double result = 0.0;
        switch (operator) {
            case "/":
                result = a / b;
                break;
            case "*":
                result = a * b;
                break;
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
        }
        return result;
    }
}
