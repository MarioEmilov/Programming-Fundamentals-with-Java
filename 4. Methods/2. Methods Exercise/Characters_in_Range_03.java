import java.util.Scanner;

public class Characters_in_Range_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char start = scanner.nextLine().charAt(0);
        char end = scanner.nextLine().charAt(0);

        printAllSymbolBetween( start, end);
    }

    private static void printAllSymbolBetween(char start, char end) {
        if (start < end) {
            for (int symbol = start + 1; symbol < end; symbol++) {
                System.out.print((char) symbol + " ");
            }
        } else {
            for (int symbol = end + 1; symbol < start; symbol++) {
                System.out.print((char) symbol + " ");
            }
        }
    }
}
