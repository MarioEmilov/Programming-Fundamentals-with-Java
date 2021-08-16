import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Drum_Set_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double savings = Double.parseDouble(scan.nextLine());
        List<Integer> originalDrumSet = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scan.nextLine();
        List<Integer> drumSet = addAllDigitsFromTheOrignalSet(originalDrumSet);

        while (!command.equals("Hit it again, Gabsy!")) {
            int hitPower = Integer.parseInt(command);
            for (int i = 0; i < drumSet.size(); i++) {
                drumSet.set(i, drumSet.get(i) - hitPower);
                if (drumSet.get(i) <= 0) {
                    if (originalDrumSet.get(i) * 3 <= savings) {
                        savings -= (originalDrumSet.get(i) * 3);
                        drumSet.set(i, originalDrumSet.get(i));
                    } else {
                        drumSet.remove(i);
                        originalDrumSet.remove(i);
                        if (i <= drumSet.size() - 1) {
                            i = i - 1;
                        }
                    }
                }
            }
            command = scan.nextLine();
        }
        for (Integer i : drumSet) {
            System.out.print(i + " ");

        }
        System.out.printf("%nGabsy has %.02flv.", savings);

    }

    static List<Integer> addAllDigitsFromTheOrignalSet(List<Integer> originalDrumSet) {
        List<Integer> addNumbers = new ArrayList<>();
        for (Integer integer : originalDrumSet) {
            addNumbers.add(integer);

        }
        return addNumbers;
    }
}