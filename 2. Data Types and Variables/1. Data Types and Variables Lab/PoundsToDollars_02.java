import java.util.Scanner;

public class PoundsToDollars_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pounds = Double.parseDouble(scanner.nextLine());
        double USDollars = pounds * 1.31;
        System.out.printf("%.3f", USDollars);
    }
}
