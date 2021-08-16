import java.util.Scanner;

public class String_Explosion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] texts = input.split(">");
        int strengthLeft = 0;

        for (int i = 0; i < texts.length; i++) {
            if (Character.isDigit(texts[i].charAt(0))) {
                int strength = Character.getNumericValue(texts[i].charAt(0)) + strengthLeft;

                if (texts[i].length() >= strength) {
                    texts[i] = texts[i].substring(strength);
                } else {
                    strengthLeft = strength - texts[i].length();
                    texts[i] = "";
                }
            }

            if (i == texts.length - 1) {
                System.out.print(texts[i]);
            } else {
                System.out.print(texts[i] + ">");
            }
        }
    }
}
