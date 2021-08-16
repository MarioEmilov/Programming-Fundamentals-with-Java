import java.util.Scanner;

public class Decrypting_message_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder word = new StringBuilder();

        for (int character = 1; character <= n; character++) {
            char input = scanner.nextLine().charAt(0);
            int value = input + key;
            word.append((char)value);
        }
        System.out.println(word);
    }
}
