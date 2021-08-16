import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Man_O_War_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> pirateShip = Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> warship = Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());
        int maxHealth = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Retire")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "Fire" -> {
                    int index = Integer.parseInt(tokens[1]);
                    int damageWarship = Integer.parseInt(tokens[2]);
                    if (index >= 0 && index < warship.size()) {
                        int dmg = warship.get(index);
                        dmg = dmg - damageWarship;
                        if (dmg <= 0) {
                            System.out.println("You won! The enemy ship has sunken.");
                            return;
                        } else {
                            warship.remove(index);
                            warship.add(index, dmg);
                        }
                    }
                }
                case "Defend" -> {
                    int startIndex = Integer.parseInt(tokens[1]);
                    int endIndex = Integer.parseInt(tokens[2]);
                    int damagePirateShip = Integer.parseInt(tokens[3]);
                    if (startIndex >= 0 && endIndex < pirateShip.size()) {
                        for (int indexes = startIndex; indexes <= endIndex; indexes++) {
                            int dmg = pirateShip.get(indexes);
                            dmg = dmg - damagePirateShip;
                            if (dmg <= 0) {
                                System.out.println("You lost! The pirate ship has sunken.");
                                return;
                            } else {
                                pirateShip.remove(indexes);
                                pirateShip.add(indexes, dmg);
                                startIndex++;
                            }
                        }
                    }
                }
                case "Repair" -> {
                    int indexRepair = Integer.parseInt(tokens[1]);
                    int health = Integer.parseInt(tokens[2]);
                    if (indexRepair >= 0 && indexRepair < pirateShip.size()) {
                        if (health > maxHealth) {
                            health = maxHealth;
                            pirateShip.remove(indexRepair);
                            pirateShip.add(indexRepair, health);
                        } else {
                            int num = pirateShip.get(indexRepair);
                            pirateShip.remove(indexRepair);
                            pirateShip.add(indexRepair, health + num);
                        }
                    }
                }
                case "Status" -> {
                    int count = 0;
                    double percent = maxHealth * 0.2;
                    for (int sector : pirateShip) {
                        if (percent > sector) {
                            count++;
                        }
                    }
                    System.out.printf("%d sections need repair.%n", count);
                }
            }
            input = scanner.nextLine();
        }
        int sumPirateShip = 0;
        int sumWarship = 0;
        for (int pirateSector : pirateShip) {
            sumPirateShip += pirateSector;
        }
        System.out.printf("Pirate ship status: %d%n", sumPirateShip);
        for (int warSector : warship) {
            sumWarship += warSector;
        }
        System.out.printf("Warship status: %d", sumWarship);
    }
}