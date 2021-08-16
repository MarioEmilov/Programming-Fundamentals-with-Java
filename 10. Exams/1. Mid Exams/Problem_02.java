import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nameList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String command = scanner.nextLine();
        int blacklistNames = 0;
        int lostNames = 0;

        while (!command.equals("Report")) {
            String[] tokens = command.split(" ");
            switch (tokens[0]) {
                case "Blacklist":
                    String name = tokens[1];
                    if (nameList.contains(name)) {
                        int index = nameList.indexOf(name);
                        System.out.printf("%s was blacklisted.%n", name);
                        nameList.set(index, "Blacklisted");
                        blacklistNames++;
                    } else {
                        System.out.printf("%s was not found.%n", name);
                    }
                    break;
                case "Error":
                    int index = Integer.parseInt(tokens[1]);
                    if (index >= 0 && index < nameList.size()) {
                        String indexName = nameList.get(index);
                        if (indexName.equals("Blacklisted") || indexName.equals("Lost")) {
                            command = scanner.nextLine();
                            continue;
                        } else {
                            System.out.printf("%s was lost due to an error.%n", indexName);
                            nameList.set(index, "Lost");
                            lostNames++;
                        }
                    }
                    break;
                case "Change":
                    int index1 = Integer.parseInt(tokens[1]);
                    String newName = tokens[2];
                    if (index1 >= 0 && index1 < nameList.size()) {
                        String oldName = nameList.get(index1);
                        nameList.set(index1, newName);
                        System.out.printf("%s changed his username to %s.%n", oldName, newName);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Blacklisted names: %d%n", blacklistNames);
        System.out.printf("Lost names: %d%n", lostNames);
        System.out.println(String.join(" ", nameList));
    }
}
