import java.util.Scanner;

public class Messages_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lettersNum = Integer.parseInt(scanner.nextLine());
        int num = Integer.parseInt(scanner.nextLine());
        String numm = String.valueOf(num);
        String word = "";
        int mainDigit = num;
        int offset = 0;
        int index = 0;

        for (int i = 0; i < lettersNum; i++) {


            for (int j = 1; j < numm.length() ; j++) {
                mainDigit = mainDigit/10;
            }
            offset = (mainDigit - 2) * 3;
            index = (offset + numm.length() - 1)+97;
            if (mainDigit == 8 || mainDigit == 9) {
                index+=1;
            }
            if (mainDigit == 0) {
                index = 32;
            }
            char symbol = (char)index;
            word += symbol;

            offset = 0;
            index = 0;
            if (lettersNum-1 == i) {
                break;
            }
            num = Integer.parseInt(scanner.nextLine());
            numm = String.valueOf(num);
            mainDigit = num;
        }
        System.out.println(word);
    }
}
