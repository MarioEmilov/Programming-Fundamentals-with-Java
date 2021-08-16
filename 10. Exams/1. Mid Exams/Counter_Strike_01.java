import java.util.Scanner;

public class Counter_Strike_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int energy = Integer.parseInt(scanner.nextLine());
        int count = 0;
        String input = scanner.nextLine();
        while (!input.equals("End of battle")) {
            int neededEnergy = Integer.parseInt(input);
            if (neededEnergy > energy) {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", count, energy);
                return;
            } else {
                energy -= neededEnergy;
                count++;
            }
            if (count % 3 == 0) {
                energy += count;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Won battles: %d. Energy left: %d", count, energy);
    }
}
