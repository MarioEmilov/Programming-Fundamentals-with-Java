import java.util.Scanner;

public class Bonus_Scoring_System_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());
        int lectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());
        double maxBonus = 0;
        int studentAttend = 0;

        for (int i = 0; i < students; i++) {
            int studentAttendances = Integer.parseInt(scanner.nextLine());
            double totalBonus = (studentAttendances * 1.0 / lectures) * (5 + additionalBonus);
            if (totalBonus > maxBonus) {
                maxBonus = totalBonus;
                studentAttend = studentAttendances;
            }
        }
        System.out.printf("Max Bonus: %.0f.%n", maxBonus);
        System.out.printf("The student has attended %d lectures.", studentAttend);
    }
}
