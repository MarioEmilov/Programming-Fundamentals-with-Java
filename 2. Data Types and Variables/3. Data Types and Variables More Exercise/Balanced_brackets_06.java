import java.util.Scanner;

public class Balanced_brackets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder symbolToLetter = new StringBuilder();
        boolean isValid = false;

        for (int i = 1; i <= n; i++) {
            String symbol = scanner.nextLine();

            if (symbol.equals("(") || symbol.equals(")")) {
                symbolToLetter.append(symbol);
            }else {
                continue;
            }
            if (symbolToLetter.toString().equals("()")) {
                symbolToLetter = new StringBuilder();
                isValid = true;
            }else {
                isValid = false;
            }
        }
        if (isValid) {
            System.out.println("BALANCED");
        }else {
            System.out.println("UNBALANCED");
        }
    }
}

