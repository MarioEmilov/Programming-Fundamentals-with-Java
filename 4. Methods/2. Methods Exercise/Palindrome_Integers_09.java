import java.util.Scanner;

public class Palindrome_Integers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        while (!command.equals("END")) {
            System.out.println(isPalindrome(command));
            command = scanner.nextLine();
        }
    }
    //Метод, който провверява дали числото е палиндром -> true и false
    private static boolean isPalindrome(String number) {
        //проверка дали числото е същото, като числото записано наобратно
        String reversedNumber = getReversedNumber(number);
        return number.equals(reversedNumber);
    }
    //Метод, който взима обратното на числото
    private static String getReversedNumber(String number) {
        //обхождаме числото от последния към първия елемент
        String reversed = "";
        for (int index = number.length() - 1; index >= 0; index--) {
            char currentElement = number.charAt(index);
            reversed += currentElement;
        }
        return reversed;
    }
}
