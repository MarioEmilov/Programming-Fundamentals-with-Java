import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Bomb_Numbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();
        String[] commandData = command.split("\\s+");
        int bombNumber = Integer.parseInt(commandData[0]);
        int powerNumber = Integer.parseInt(commandData[1]);
        int sum = 0;

        while (numbers.contains(bombNumber)) {
            int indexBomb = numbers.indexOf(bombNumber);

            int left = Math.max(0, indexBomb - powerNumber);
            int right = Math.min(numbers.size() - 1, indexBomb + powerNumber);

            for (int i = right; i >= left; i--) {
                numbers.remove(i);
            }
        }
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}
