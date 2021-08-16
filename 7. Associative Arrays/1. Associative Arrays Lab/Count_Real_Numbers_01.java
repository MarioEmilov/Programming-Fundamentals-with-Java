import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Count_Real_Numbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        double[] numberArray = Arrays.stream(input).mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> numbers = new TreeMap<>();

        for (double number : numberArray) {
            if (!numbers.containsKey(number)) {
                numbers.put(number, 1);
            } else {
                int occurrence = numbers.get(number);
                occurrence++;
                numbers.put(number, occurrence);
            }
        }
        for (Map.Entry<Double, Integer> entry : numbers.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
