import java.util.Arrays;
import java.util.Scanner;

public class Condense_Array_to_Number_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayIntegers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        while (arrayIntegers.length > 1) {
            int [] condense = new int[arrayIntegers.length - 1];
            for (int i = 0; i < condense.length; i++) {
                condense[i] = arrayIntegers[i] + arrayIntegers[i + 1];
            }
            arrayIntegers = condense;
        }
        System.out.println(arrayIntegers[0]);
    }
}
