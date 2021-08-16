import java.math.BigInteger;
import java.util.Scanner;

public class Big_Factorial_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factorial = Integer.parseInt(scanner.nextLine());
        BigInteger bigInteger = new BigInteger("1");
        for (int i = 1; i <= factorial; i++) {
            bigInteger = bigInteger.multiply(new BigInteger("" + i));
        }
        System.out.println(bigInteger);
    }
}
