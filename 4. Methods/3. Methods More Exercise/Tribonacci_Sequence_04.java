import java.util.Scanner;

public class Tribonacci_Sequence_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i : Tribonacci(n)) {
            System.out.print(i + " ");
        }
    }

    static int[] Tribonacci(int n) {
        int[] tribonacci = new int[n];
        tribonacci[0] = 1;
        if (n > 3) {
            tribonacci[0] = 1;
            tribonacci[1] = 1;
            tribonacci[2] = 2;
            for (int i = 3; i < tribonacci.length; i++) {
                tribonacci[i] = tribonacci[i - 1] + tribonacci[i - 2] + tribonacci[i - 3];
            }
            return tribonacci;
        } else if (n == 2) {
            tribonacci[0] = 1;
            tribonacci[1] = 1;
            return tribonacci;
        } else if (n == 3) {
            tribonacci[0] = 1;
            tribonacci[1] = 1;
            tribonacci[2] = 2;
            return tribonacci;
        }
        return tribonacci;
    }
}
