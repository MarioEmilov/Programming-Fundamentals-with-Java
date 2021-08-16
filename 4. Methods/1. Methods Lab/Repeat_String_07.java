import java.util.Scanner;

public class Repeat_String_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int repetition = Integer.parseInt(scanner.nextLine());
        String repeatedString = repeatString (text, repetition);
        System.out.println(repeatedString);
    }

    private static String repeatString(String text, int repetition) {
        String result = "";
        for (int i = 0; i < repetition; i++) {
            result = result + text;
        }
        return result;
    }
}
