import java.util.Scanner;

public class Password_Validator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine(); //Дължина (6-10); Съдържа само букви и цифри; Проверка дали има 2 цифри
        boolean isValidLength = isValidLength(password);
        if (!isValidLength) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        boolean isValidContent = isValidContent(password);
        if (!isValidContent) {
            System.out.println("Password must consist only of letters and digits");
        }
        boolean isValidCount = isValidCountDigits(password);
        if (!isValidCount) {
            System.out.println("Password must have at least 2 digits");
        }
        if (isValidLength && isValidContent && isValidCount) {
            System.out.println("Password is valid");
        }
    }

    //Метод за проверка на дължината -> true(валидна дължина) false(невалидна)
    private static boolean isValidLength(String password) {
        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        } else {
            return false;
        }
    }
    //Метод за проверка на съдържанието за букви и цифри -> true(валидна) и false(невалидна)
    private static boolean isValidContent(String password) {
        for (int index = 0; index < password.length(); index++) {
            char currentSymbol = password.charAt(index);
            if (!Character.isLetterOrDigit(currentSymbol)) {
                return false;
            }
        }
        return true;
    }
    //Метод за проверка на броя на цифрите в паролата -> true(валидна) и false(невалидна)
    private static boolean isValidCountDigits(String password) {
        int count = 0;
        for (int index = 0; index < password.length(); index++) {
            char currentSymbol = password.charAt(index);
            if (Character.isDigit(currentSymbol)) {
                count++;
            }
        }
        return count >= 2;
    }
}
