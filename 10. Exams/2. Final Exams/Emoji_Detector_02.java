import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Emoji_Detector_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String digitRegex = "\\d";
        String regex = "(?<name>([*]{2})[A-Z][a-z]{2,}([*]{2})|([:]{2})[A-Z][a-z]{2,}([:]{2}))";

        Pattern patternDigit = Pattern.compile(digitRegex);
        Pattern patternEmoji = Pattern.compile(regex);

        int count = 0;
        int sum = 1;
        List<String> emojis = new ArrayList<>();

        Matcher matcherDigit = patternDigit.matcher(input);

        while (matcherDigit.find()) {
            int digit = Integer.parseInt(matcherDigit.group(0));
            sum = sum * digit;
        }

        Matcher matcherEmoji = patternEmoji.matcher(input);
        while (matcherEmoji.find()) {

            String name1 = matcherEmoji.group("name");

            int sumChar = 0;
            for (int i = 2; i < name1.length() - 2; i++) {
                char sign = name1.charAt(i);
                sumChar += (int) sign;
            }
            count++;

            if (sumChar > sum) {
                emojis.add(name1);
            }
        }

        System.out.printf("Cool threshold: %d%n", sum);
        System.out.printf("%d emojis found in the text. The cool ones are:%n", count);

        for (String emoji : emojis) {
            System.out.printf("%s%n", emoji);
        }
    }
}
