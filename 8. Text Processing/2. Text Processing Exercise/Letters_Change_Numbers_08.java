import java.util.Scanner;

public class Letters_Change_Numbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] passwords = input.split("\\s+");
        double totalSum = 0.0;
        for (String password : passwords) {
            //пресмятаме стойността
            double currentSum = getCurrentSum(password);
            //сумираме
            totalSum += currentSum;
        }
        System.out.printf("%.2f", totalSum);
    }

    private static double getCurrentSum(String password) {
        //{буква}{число}{буква} -> "P3456Z"
        char firstLetter = password.charAt(0);
        char secondLetter = password.charAt(password.length() - 1);
        //първи начин: int number = Integer.parseInt(password.replace(firstLetter, ' ').replace(secondLetter, ' ').trim());
        //втори начин:
        StringBuilder builder = new StringBuilder(password);
        double number = Double.parseDouble(builder.deleteCharAt(0).deleteCharAt(builder.length() - 1).toString());
        //треити начин: int number = Integer.parseInt(password.substring(1, password.indexOf(secondLetter)));

        //проверка за първата буква
        if (Character.isUpperCase(firstLetter)) { //аски кода >= 65 и <= 90
            //позиция в азбуката
            int positionUpperLetter = (int) firstLetter - 64;
            number = number / positionUpperLetter;
        } else {
            int positionLowerLetter = (int) firstLetter - 96;
            number = number * positionLowerLetter;
        }
        //проверка за втората буква
        if (Character.isUpperCase(secondLetter)) {
            int positionUpperLetter = (int) secondLetter - 64;
            number = number - positionUpperLetter;
        } else {
            int positionLowerLetter = (int) secondLetter - 96;
            number = number + positionLowerLetter;
        }
        return number;
    }
}
