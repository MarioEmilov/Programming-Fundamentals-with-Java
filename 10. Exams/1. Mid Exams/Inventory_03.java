import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inventory = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("Craft!")) {
            String[] tokens = command.split(" - ");
            switch (tokens[0]) {
                case "Collect":
                    String item = tokens[1];
                    if (!inventory.contains(item)) {
                        inventory.add(item);
                    }
                    break;
                case "Drop":
                    String item1 = tokens[1];
                    inventory.remove(item1);
                    break;
                case "Combine Items":
                    String item2 = tokens[1];
                    String[] items = item2.split(":");
                    String oldItem = items[0];
                    String newItem = items[1];
                    if (inventory.contains(oldItem)) {
                        int index = inventory.indexOf(oldItem);
                        inventory.add(index + 1, newItem);
                    }
                    break;
                case "Renew":
                    String item3 = tokens[1];
                    if (inventory.contains(item3)) {
                        String currentItem = item3;
                        inventory.remove(item3);
                        inventory.add(currentItem);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println(String.join(", ", inventory));
    }
}
