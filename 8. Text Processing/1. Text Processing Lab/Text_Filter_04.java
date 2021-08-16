import java.util.Scanner;

public class Text_Filter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] forbiddenWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String forbiddenWord:forbiddenWords) {
            //replace with ****
            //Linux -> *****
            //Windows -> *******
            String wordOfStars = convertWordToStarts(forbiddenWord);
            text = text.replace(forbiddenWord, wordOfStars);
        }
        System.out.println(text);
    }

    private static String convertWordToStarts(String forbiddenWord) {
        String wordOfStars = "";
        for (int i = 0; i < forbiddenWord.length(); i++) {
            wordOfStars += "*";
        }
        return wordOfStars;
    }
}
