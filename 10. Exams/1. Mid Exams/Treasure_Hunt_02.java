import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Treasure_Hunt_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> loots = Arrays.stream(input.split("\\|")).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("Yohoho!")) {
            String[] tokens = command.split(" ");

            switch (tokens[0]) {
                case "Loot":
                    for (int i = 1; i < tokens.length; i++) {
                        if (!loots.contains(tokens[i])) {
                            loots.add(0, tokens[i]);
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(tokens[1]);
                    if (index >= 0 && index < loots.size()) {
                        String value = loots.get(index);
                        loots.remove(index);
                        loots.add(value);
                    }
                    break;
                case "Steal":
                    int numberOfStolenItems = Integer.parseInt(tokens[1]);

                    if (numberOfStolenItems >= loots.size()) {
                        int counter = 0;
                        for (String item : loots) {
                            counter++;
                            if (counter == loots.size()) {
                                System.out.println(item);
                            } else {
                                System.out.printf("%s, ", item);
                            }
                        }
                        System.out.println("Failed treasure hunt.");
                        return;
                    } else {
                        int counter = loots.size() - numberOfStolenItems;
                        for (int i = loots.size() - numberOfStolenItems; i <= loots.size() - 1; i++) {
                            counter++;
                            if (counter == loots.size()) {
                                System.out.println(loots.get(i));
                            } else {
                                System.out.printf("%s, ", loots.get(i));
                            }
                        }

                    }
                    int counter = loots.size() - 1 - numberOfStolenItems;
                    for (int i = loots.size() - 1; i >= loots.size()  - numberOfStolenItems; i--) {
                        if (counter != i) {
                            loots.remove(i);
                        } else {
                            break;
                        }
                    }
                }
            command = scanner.nextLine();
        }
        double numberOfLetters = 0;
        for (String currentWord : loots) {
            numberOfLetters += currentWord.length();

        }
        double averageSum = numberOfLetters / (loots.size());
        System.out.printf("Average treasure gain: %.2f pirate credits.", averageSum);
    }
}
