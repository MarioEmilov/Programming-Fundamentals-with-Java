import java.util.Arrays;
import java.util.Scanner;

public class Magic_Sum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int number = Integer.parseInt(scanner.nextLine());

        for (int index = 0; index < array.length - 1; index++) {
            int firstIndex = array[index];
            for (int index2 = index + 1; index2 < array.length; index2++) {
                int secondIndex = array[index2];
                int sum = firstIndex + secondIndex;
                if (sum == number) {
                    System.out.println(array[index] + " " + array[index2]);
                }
            }
        }
    }
}
