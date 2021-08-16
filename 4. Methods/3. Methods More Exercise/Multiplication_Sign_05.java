import java.util.Scanner;

public class Multiplication_Sign_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        multiplication(number1, number2, number3);
    }

    private static void multiplication(int number1, int number2, int number3) {
        if (number1 > 0 && number2 > 0 && number3 > 0 || number1 < 0 && number2 < 0 && number3 > 0 ||
                number1 < 0 && number2 > 0 && number3 < 0 || number1 > 0 && number2 < 0 && number3 < 0) {
            System.out.println("positive");
        } else if (number1 == 0 || number2 == 0 || number3 == 0) {
            System.out.println("zero");
        } else {
            System.out.println("negative");
        }
    }
}
