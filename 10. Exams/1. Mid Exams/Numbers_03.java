import java.util.*;

public class Numbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int count = 0;
        double sum = 0;
        for (int number : numbers) {
            sum += number;
            count++;
        }
        double average = sum / count;

        List<Integer> numberList = new ArrayList<>();
        for (int element : numbers) {
            if (element > average) {
                numberList.add(element);
            }
        }
        numberList.sort(Collections.reverseOrder());

        List<Integer> finalList = new ArrayList<>();
        for (int num : numberList) {
            if (finalList.size() < 5) {
                finalList.add(num);
            } else {
                break;
            }
        }
        if (finalList.isEmpty()) {
            System.out.println("No");
        } else {
            System.out.print(finalList.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
