import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mirror_Words_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<String> words = new ArrayList<>();

        int wordCount = 0;

        String mirrorRegex = "([#@])(?<firstWord>[A-Za-z]{3,})\\1\\1(?<secondWord>[A-za-z]{3,})\\1";
        Pattern mirrorPattern = Pattern.compile(mirrorRegex);
        Matcher mirrorMatcher = mirrorPattern.matcher(input);

        while (mirrorMatcher.find()) {

            String firstWord = mirrorMatcher.group("firstWord");
            String secondWord = mirrorMatcher.group("secondWord");

            wordCount++;

            StringBuilder reversedWord = new StringBuilder(secondWord);
            reversedWord.reverse();

            if (reversedWord.toString().equals(firstWord)) {
                words.add(String.format("%s <=> %s", firstWord, secondWord));
            }
        }
        if (wordCount == 0 && words.size() == 0) {
            System.out.println("No word pairs found!");
            System.out.println("No mirror words!");
        } else if (wordCount > 0 && words.size() == 0) {
            System.out.println(wordCount + " word pairs found!");
            System.out.println("No mirror words!");
        } else {
            System.out.println(wordCount + " word pairs found!");
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", words));
        }
    }
}
