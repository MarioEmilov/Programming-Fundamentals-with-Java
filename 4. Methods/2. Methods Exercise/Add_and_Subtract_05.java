import java.util.Scanner;

public class Add_and_Subtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        int add = sum(number1, number2);
        int subtract = add - number3;
        System.out.println(subtract);

    }

    private static int sum(int number1, int number2) {
        return number1 + number2;
    }
}
