import java.util.*;

public class Problem_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> followers = new TreeMap<>();
        String command = scanner.nextLine();
        int countFollowers = 0;
        while (!command.equals("Log out")) {
            String[] commands = command.split(": ");
            String commandType = commands[0];
            switch (commandType) {
                case "New follower":
                    String username = commands[1];
                    if (!followers.containsKey(username)) {
                        followers.put(username, 0);
                        countFollowers++;
                    }
                    break;
                case "Like":
                    String username1 = commands[1];
                    int count = Integer.parseInt(commands[2]);
                    if (!followers.containsKey(username1)) {
                        followers.put(username1, 0);
                        countFollowers++;
                    }
                    int currentValue = followers.get(username1) + count;
                    followers.put(username1, currentValue);
                    break;
                case "Comment":
                    String username2 = commands[1];
                    if (!followers.containsKey(username2)) {
                        followers.put(username2, 0);
                        countFollowers++;
                    }
                    int currentValue1 = followers.get(username2) + 1;
                    followers.put(username2, currentValue1);
                    break;
                case "Blocked":
                    String username3 = commands[1];
                    if (!followers.containsKey(username3)) {
                        System.out.printf("%s doesn't exist.%n", username3);
                    } else {
                        followers.remove(username3);
                        countFollowers--;
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("%d followers%n", countFollowers);
        followers.entrySet()
                .stream()
                .sorted((a, b) -> Integer.compare(b.getValue(), a.getValue()))
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
