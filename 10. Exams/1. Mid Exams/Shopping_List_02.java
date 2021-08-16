import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Shopping_List_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> shoppingList = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("Go Shopping!")) {
            String[] tokens = command.split(" ");
            switch (tokens[0]) {
                case "Urgent":
                    String item = tokens[1];
                    if (!shoppingList.contains(item)) {
                        shoppingList.add(0, item);
                    }
                    break;
                case "Unnecessary":
                    String item1 = tokens[1];
                    shoppingList.remove(item1);

                    break;
                case "Correct":
                    String oldItem = tokens[1];
                    String newItem = tokens[2];
                    if (shoppingList.contains(oldItem)) {
                        shoppingList.set(shoppingList.indexOf(oldItem), newItem);
                    }
                    break;
                case "Rearrange":
                    String item2 = tokens[1];
                    if (shoppingList.contains(item2)) {
                        shoppingList.remove(item2);
                        shoppingList.add(item2);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println(String.join(", ", shoppingList));
    }
}
