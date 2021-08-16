import java.util.Scanner;

public class Repeat_Strings_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        for (String word : words) {
            //Принтираме word според нейната дължина
            String repeatWord = repeatWord(word, word.length());
            System.out.print(repeatWord);
        }
    }

    private static String repeatWord(String word, int numberOfRepetitions) {
        String result = "";
        for (int i = 0; i < numberOfRepetitions; i++) {
            result += word;
        }
        return result;
    }
}
