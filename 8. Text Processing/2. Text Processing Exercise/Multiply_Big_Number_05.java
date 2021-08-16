import java.math.BigInteger;
import java.util.Scanner;

public class Multiply_Big_Number_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstNumberStr = scanner.nextLine();
        String secondNUmberStr = scanner.nextLine();
        BigInteger firstNumber = new BigInteger(firstNumberStr);
        BigInteger secondNumber = new BigInteger(secondNUmberStr);
        //.add.subtract.divide.multiply
        System.out.println(firstNumber.multiply(secondNumber));
    }
}
