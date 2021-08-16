import java.util.Arrays;
import java.util.Scanner;

public class Problem_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] items = Arrays.stream(scanner.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();
        int entryPoint = Integer.parseInt(scanner.nextLine());
        String itemsType = scanner.nextLine();

        int leftSum = 0;
        int rightSum = 0;
        for (int i = entryPoint - 1; i >= 0; i--) {
            int entryPointItem = items[entryPoint];
            if (itemsType.equals("cheap")) {
                if (items[i] < entryPointItem) {
                    leftSum += items[i];
                }
            } else if (itemsType.equals("expensive")) {
                if (items[i] >= entryPointItem) {
                    leftSum += items[i];
                }
            }
        }
        for (int i = entryPoint + 1; i <= items.length - 1; i++) {
            int entryPointItem = items[entryPoint];
            if (itemsType.equals("cheap")) {
                if (items[i] < entryPointItem) {
                    rightSum += items[i];
                }
            } else if (itemsType.equals("expensive")) {
                if (items[i] >= entryPointItem) {
                    rightSum += items[i];
                }
            }
        }
        if (leftSum >= rightSum) {
            System.out.printf("Left - %d", leftSum);
        } else {
            System.out.printf("Right - %d", rightSum);
        }
    }
}
