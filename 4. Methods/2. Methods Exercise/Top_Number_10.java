import java.util.Scanner;

public class Top_Number_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num ; i++) {
            if (divisibleByEight(i) && oddDigit(i)) {
                System.out.println(i);
            }
        }
    }
    private static boolean divisibleByEight(int num) {
        int sum = 0;
        while (num > 0) {
             sum += num % 10;
             num /= 10;
        }
        if (sum % 8 == 0) {
            return true;
        } else {
            return false;
        }
    }
    private static boolean oddDigit(int num) {
        int counter = 0;
        while (num > 0) {
            if ((num % 10) % 2 == 1) {
                counter++;
            }
            num /= 10;
        }
        if (counter >= 1) {
            return true;
        } else {
            return false;
        }
    }

}