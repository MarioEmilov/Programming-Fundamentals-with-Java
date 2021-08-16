import java.util.Scanner;

public class Extract_Person_Information_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfLines; i++) {
            String currentLine = scanner.nextLine();

            int indexBeforeName = currentLine.indexOf("@");
            int indexAfterOfTheName = currentLine.indexOf("|");

            String name = currentLine.substring(indexBeforeName + 1, indexAfterOfTheName);

            int indexBeforeTheAge = currentLine.indexOf("#");
            int indexAfterTheAge = currentLine.indexOf("*");

            String age = currentLine.substring(indexBeforeTheAge + 1, indexAfterTheAge);
            System.out.printf("%s is %s years old.%n", name, age);
        }
    }
}
