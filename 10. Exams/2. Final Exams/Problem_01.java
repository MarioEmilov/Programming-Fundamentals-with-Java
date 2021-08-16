import java.util.Locale;
import java.util.Scanner;

public class Problem_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Complete")) {
            String[] commandParts = command.split("\\s+");
            String commandName = commandParts[0];

            switch (commandName) {
                case "Make":
                    String cases = commandParts[1];
                    if (cases.equals("Upper")) {
                        email = email.toUpperCase(Locale.ROOT);
                    } else {
                        email = email.toLowerCase(Locale.ROOT);
                    }
                    System.out.println(email);
                    break;
                case "GetDomain":
                    int count = Integer.parseInt(commandParts[1]);
                    String sub = "";
                    sub = email.substring(email.length() - count, email.length());
                    System.out.println(sub);
                    break;
                case "GetUsername":
                    String character = "@";
                    if (email.contains(character)) {
                        int index = email.indexOf(character);
                        String sub1 = "";
                        sub1 = email.substring(0, index);
                        System.out.println(sub1);
                    } else {
                        System.out.printf("The email %s doesn't contain the @ symbol.%n", email);
                    }
                    break;
                case "Replace":
                    String symbol = commandParts[1];
                    email = email.replaceAll(symbol, "-");
                    System.out.println(email);
                    break;
                case "Encrypt":
                    for (int currentSymbol = 0; currentSymbol < email.length(); currentSymbol++) {
                        char symbol1 = email.charAt(currentSymbol);
                        int number = (char) symbol1;
                        System.out.print(number + " ");
                    }
                    break;
            }
            command = scanner.nextLine();
        }
    }
}
