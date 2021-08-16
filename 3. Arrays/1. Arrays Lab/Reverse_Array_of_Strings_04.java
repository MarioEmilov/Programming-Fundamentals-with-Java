import java.util.Scanner;

public class Reverse_Array_of_Strings_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        for (int i = 0; i < input.length / 2; i++) {
            String temp = input[i];
            // i -> input.length - 1 - i
            // 0 -> 6 - 1 - 0 = 5
            // 1 -> 6 - 1 - 1 = 4
            // 2 -> 6 - 1 - 2 = 3
            input [i] = input[input.length - 1 - i];
            input [input.length - 1 - i] = temp;
        }
        System.out.println(String.join(" ", input));
    }
}
