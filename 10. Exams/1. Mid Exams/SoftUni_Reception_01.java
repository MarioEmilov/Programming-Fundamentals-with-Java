import java.util.Scanner;

public class SoftUni_Reception_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int employeeOne = Integer.parseInt(scanner.nextLine());
        int employeeTwo = Integer.parseInt(scanner.nextLine());
        int employeeThree = Integer.parseInt(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        int time = 0;

        int allEmployee = employeeOne + employeeTwo + employeeThree;
        while (studentsCount > 0) {
            studentsCount -= allEmployee;
            time++;
            if (time % 4 == 0) {
                time++;
            }
        }
        System.out.printf("Time needed: %dh.", time);
    }
}
