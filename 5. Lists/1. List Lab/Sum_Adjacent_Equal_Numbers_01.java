import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Sum_Adjacent_Equal_Numbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] userInput = scanner.nextLine().split(" ");
        /* Дългия начин на четене на лист от конзолата
        List<Double> numberList = new ArrayList<>();
        String[] userInput = scanner.nextLine().split(" ");
        for (String stringNumber : userInput) {
            numberList.add(Double.parseDouble(stringNumber));
        }
        */
        List<Double> numberList = Arrays.stream(userInput).map(Double::parseDouble).collect(Collectors.toList());
        //3 3 6 1 -> 6 6 1 -> 12 1
        for (int i = 0; i < numberList.size() - 1; i++) {
            if (numberList.get(i).equals(numberList.get(i + 1))){
                double sum = numberList.get(i) + numberList.get(i + 1);
                numberList.set(i, sum);
                numberList.remove(i + 1);
                i = -1; //За да започваме отначало да проверяваме дали има равни индекси
            }
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.#");
        for (Double number : numberList) {
            System.out.print(decimalFormat.format(number) + " ");
        }
    }
}
