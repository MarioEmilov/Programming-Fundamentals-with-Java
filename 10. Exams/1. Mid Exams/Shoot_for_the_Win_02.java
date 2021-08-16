import java.util.Arrays;
import java.util.Scanner;

public class Shoot_for_the_Win_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] targets = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String input = scanner.nextLine();
        int count = 0;

        while (!input.equals("End")) {
            int index = Integer.parseInt(input);
            int shootTarget = 0;
            if (index >= 0 && index < targets.length && targets[index] != -1) {
                shootTarget = targets[index];
                targets[index] = -1;
                count++;
            }
            for (int i = 0; i < targets.length; i++) {
                if (shootTarget < targets[i] && targets[i] != -1) {
                    targets[i] -= shootTarget;
                } else if (shootTarget >= targets[i] && targets[i] != -1) {
                    targets[i] += shootTarget;
                }
            }
            input = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", count);
        for (int i = 0; i < targets.length; i++) {
            System.out.print(targets[i]);
            if (i < targets.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
