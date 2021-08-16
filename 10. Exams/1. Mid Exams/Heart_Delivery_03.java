import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Heart_Delivery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> houses = Arrays.stream(scanner.nextLine().split("@")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        int index = 0;
        int count = 0;
        while (!command.equals("Love!")) {
            String[] operations = command.split(" ");

            switch (operations[0]) {
                case "Jump":
                    int length = Integer.parseInt(operations[1]);
                    index += length;

                    if (index >= houses.size()) {
                        index = 0;
                    }

                    if (houses.get(index) == 0) {
                        System.out.printf("Place %d already had Valentine's day.\n", index);
                        break;
                    }

                    houses.set(index, houses.get(index) - 2);

                    if (houses.get(index) == 0) {
                        count++;
                        System.out.printf("Place %d has Valentine's day.\n", index);
                        break;
                    }
            }
            command = scanner.nextLine();
        }

        if (houses.size() != count) {
            System.out.printf("Cupid's last position was %d.\n", index);
            System.out.printf("Cupid has failed %d places.", houses.size() - count);
        } else {
            System.out.printf("Cupid's last position was %d.\n", index);
            System.out.println("Mission was successful.");
        }
    }
}
