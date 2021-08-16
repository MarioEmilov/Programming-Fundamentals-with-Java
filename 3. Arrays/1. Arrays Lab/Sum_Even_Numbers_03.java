import java.util.Arrays;
import java.util.Scanner;

public class Sum_Even_Numbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        /*
        int[] numbers = new int [input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
         */
        int[] numbers = Arrays.stream(input).mapToInt(element -> Integer.parseInt(element)).toArray();
        int evenSum = 0;
        for(int number : numbers) { // просто минаваме през всеки един елемент на numbers Array и като минаваме сумираме четни и нечетни числа
            if (number % 2 == 0) {
                evenSum += number;
            }
        }
        System.out.println(evenSum);
    }
}