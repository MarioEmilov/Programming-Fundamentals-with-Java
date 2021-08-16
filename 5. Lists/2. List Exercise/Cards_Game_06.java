import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Cards_Game_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> playerOne = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> playerTwo = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        while (playerOne.size() > 0 && playerTwo.size() > 0) {

            int firstPlayerCard = playerOne.remove(0);
            int secondPlayerCard = playerTwo.remove(0);

            if (firstPlayerCard > secondPlayerCard) {
                playerOne.add(firstPlayerCard);
                playerOne.add(secondPlayerCard);
            } else if (secondPlayerCard > firstPlayerCard) {
                playerTwo.add(secondPlayerCard);
                playerTwo.add(firstPlayerCard);
            }
        }

        if (playerOne.size() > 0)
            sumAndPrint(playerOne, "First");
        else if (playerTwo.size() > 0)
            sumAndPrint(playerTwo, "Second");
    }

    private static void sumAndPrint(List<Integer> playerWinner, String player) {
        int sum = 0;
        for (int element : playerWinner)
            sum += element;
        System.out.println(player + " player wins! Sum: " + sum);
    }
}
