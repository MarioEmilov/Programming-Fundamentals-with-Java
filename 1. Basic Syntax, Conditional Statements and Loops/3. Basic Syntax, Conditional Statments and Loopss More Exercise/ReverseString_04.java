import java.util.Scanner;

public class ReverseString_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        String reversedWord = "";
        for (int position = word.length() - 1; position >= 0; position--) {
            char currentSymbol = word.charAt(position);
            reversedWord += currentSymbol;
        }
        System.out.println(reversedWord);
    }
}
