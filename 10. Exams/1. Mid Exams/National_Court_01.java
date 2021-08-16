import java.util.Scanner;

public class National_Court_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int employeeOne = Integer.parseInt(scanner.nextLine());
        int employeeTwo = Integer.parseInt(scanner.nextLine());
        int employeeThree = Integer.parseInt(scanner.nextLine());
        int peopleCount = Integer.parseInt(scanner.nextLine());
        int time = 0;

        int allEmployee = employeeOne + employeeTwo + employeeThree;
        while (peopleCount > 0) {
            peopleCount -= allEmployee;
            time++;
            if (time % 4 == 0) {
                time++;
            }
        }
        System.out.printf("Time needed: %dh.", time);
    }
}
