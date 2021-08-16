import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MuOnline_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int health = 100;
        int initialBitCoins = 0;
        boolean isDead = false;
        int bestRoom = 0;

        List<String> listOfRooms = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        for (String room : listOfRooms) {
            String[] command = room.split(" ");
            switch (command[0]) {
                case "potion":
                    int hp = Integer.parseInt(command[1]);
                    if (health + hp > 100) {
                        hp = 100 - health;
                    }
                    health += hp;
                    if (health > 100) {
                        health = 100;
                    }
                    System.out.printf("You healed for %d hp.\n", hp);
                    System.out.printf("Current health: %d hp.\n", health);
                    break;
                case "chest":
                    int bitcoins = Integer.parseInt(command[1]);
                    initialBitCoins += bitcoins;
                    System.out.printf("You found %d bitcoins.\n", bitcoins);
                    break;
                default:
                    int monsterAttack = Integer.parseInt(command[1]);
                    String monsterType = command[0];
                    health -= monsterAttack;
                    if (health > 0) {
                        System.out.printf("You slayed %s.\n", monsterType);
                    } else {
                        System.out.printf("You died! Killed by %s.\n", monsterType);
                        isDead = true;
                    }
                    break;
            }
            bestRoom++;
            if (isDead) {
                break;
            }
        }
        if (isDead) {
            System.out.printf("Best room: %d", bestRoom);
        } else {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d\n", initialBitCoins);
            System.out.printf("Health: %d", health);
        }
    }
}
