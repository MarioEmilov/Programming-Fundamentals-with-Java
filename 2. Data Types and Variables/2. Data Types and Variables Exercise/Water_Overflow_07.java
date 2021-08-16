import java.util.Scanner;

public class Water_Overflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int litters = 255;
        for (int count = 1; count <= n; count++) {
            int flowWater = Integer.parseInt(scanner.nextLine());
            litters -= flowWater;
            if (litters < 0) {
                System.out.println("Insufficient capacity!");
                litters += flowWater;
            }
        }
        System.out.println(255 - litters);
    }
}
