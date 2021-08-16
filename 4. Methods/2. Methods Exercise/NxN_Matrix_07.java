import java.util.Scanner;

public class NxN_Matrix_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        nxn(n);
    }

    private static int nxn(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                    System.out.print(n + " ");
            }
            System.out.println();
        }
        return n;
    }
}
