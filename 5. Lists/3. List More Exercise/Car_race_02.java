import java.util.Scanner;

public class Car_race_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        String[] splitData = input.split("\\s+");

        double sum1 = 0;
        double sum2 = 0;

        for (int i = 0; i < splitData.length / 2; i++) {


            if (Integer.parseInt(splitData[i]) != 0) {
                sum1 += Integer.parseInt(splitData[i]);
            } else {
                sum1 *= 0.8;
            }
        }

        for (int i = splitData.length - 1; i > splitData.length / 2; i--) {

            if (Integer.parseInt(splitData[i]) != 0) {
                sum2 += Integer.parseInt(splitData[i]);
            } else {
                sum2 *= 0.8;
            }
        }

        if (sum1 < sum2) {
            System.out.printf("The winner is left with total time: %.1f", sum1);
        } else {
            System.out.printf("The winner is right with total time: %.1f", sum2);
        }
    }
}

