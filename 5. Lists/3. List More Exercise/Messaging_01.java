import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Messaging_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        //String message = sc.nextLine();
        StringBuilder message = new StringBuilder(sc.nextLine());

        for (int i = 0; i < numbers.size(); i++) {
            String output = "";
            int currentNumber = numbers.get(i);
            int sum = 0;
            while(currentNumber > 0){
                int digit = currentNumber % 10;
                sum += digit;
                currentNumber /= 10;
            }
            if(sum > message.length()){
                sum = sum - message.length();
            }
            output += message.charAt(sum);
            message.deleteCharAt(sum);
            System.out.print(output);
        }
    }
}

