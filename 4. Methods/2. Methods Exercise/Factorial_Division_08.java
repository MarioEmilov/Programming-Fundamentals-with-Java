import java.text.DecimalFormat;
import java.util.Scanner;

public class Factorial_Division_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        System.out.println(new DecimalFormat("0.00").format(result(number1, number2)));
    }

    private static double result(double number1, double number2) {
        double result1 = 1;
        for (int factorial1 = 1; factorial1 <= number1; factorial1++) {
            result1 = factorial1 * result1;
        }
        double result2 = 1;
        for (int factorial2 = 1; factorial2 <= number2; factorial2++) {
            result2 = factorial2 * result2;
        }
        return result1 / result2;
    }
}
