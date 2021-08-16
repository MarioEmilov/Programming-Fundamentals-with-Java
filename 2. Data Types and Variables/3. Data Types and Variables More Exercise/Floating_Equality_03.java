import java.math.BigDecimal;
import java.util.Scanner;

public class Floating_Equality_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1 = Double.parseDouble(scanner.nextLine());
        double n2 = Double.parseDouble(scanner.nextLine());
        double eps = 0.000001;

        boolean isEqual = Math.abs(n1 - n2) < eps;

        if (isEqual) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
