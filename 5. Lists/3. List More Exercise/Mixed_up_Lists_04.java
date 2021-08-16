import java.util.*;
import java.util.stream.Collectors;

public class Mixed_up_Lists_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int firstRange = 0;
        int secondRange = 0;

        if (firstList.size() > secondList.size()) {
            firstRange = firstList.get(firstList.size() - 1);
            secondRange = firstList.get(firstList.size() - 2);
        } else if (firstList.size() < secondList.size()) {
            Collections.reverse(secondList);
            firstRange = secondList.get(secondList.size() - 1);
            secondRange = secondList.get(secondList.size() - 2);
        }

        List<Integer> resultList = new ArrayList<>();

        int i = 0;
        int j = 0;
        while (i < firstList.size() && j < secondList.size()) {
            resultList.add(firstList.get(i));
            resultList.add(secondList.get(j));
            i++;
            j++;
        }
        List<Integer> result = new ArrayList<>();
        for (Integer integer : resultList) {
            if (firstRange > secondRange) {
                if (integer > secondRange && integer < firstRange) {
                    result.add(integer);// print in ascending order the results
                }
            } else if (firstRange < secondRange) {
                if (integer < secondRange && integer > firstRange) {
                    result.add(integer);
                }
            }

        }
        // print in ascending order the results
        Collections.sort(result);
        for (Integer integer : result) {
            System.out.print(integer + " ");
        }
    }
}
