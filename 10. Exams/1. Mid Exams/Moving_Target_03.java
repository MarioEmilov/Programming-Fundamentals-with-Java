import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Moving_Target_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> sequence = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "Shoot":
                    int index = Integer.parseInt(tokens[1]);
                    int power = Integer.parseInt(tokens[2]);
                    if (index >= 0 && index < sequence.size()) {
                        sequence.set(index, sequence.get(index) - power);
                        if (sequence.get(index) <= 0) {
                            sequence.remove(index);
                        }
                    }
                    break;
                case "Add":
                    int index1 = Integer.parseInt(tokens[1]);
                    int value = Integer.parseInt(tokens[2]);
                    if (index1 >= 0 && index1 < sequence.size()) {
                        sequence.add(index1, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    int place = Integer.parseInt(tokens[1]);
                    int radius = Integer.parseInt(tokens[2]);

                    if (place >= 0 && place < sequence.size()) {
                        if (place - radius >= 0 && place + radius < sequence.size()) {
                            for (int i = place + radius; i >= place - radius; i--) {
                                sequence.remove(i);
                            }
                        } else {
                            System.out.println("Strike missed!");
                        }
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        int counter = 0;
        for (int number : sequence) {
            counter++;
            if (counter == sequence.size()) {
                System.out.print(number);
            } else {
                System.out.print(number + "|");
            }
        }
    }
}
