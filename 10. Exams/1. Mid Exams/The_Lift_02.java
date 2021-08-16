import java.util.Arrays;
import java.util.Scanner;

public class The_Lift_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int waitingPeople = Integer.parseInt(scanner.nextLine());
        String[] userInput = scanner.nextLine().split(" ");
        int[] liftCabins = Arrays.stream(userInput).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < liftCabins.length; i++) {
            int peopleInCabin = liftCabins[i];
            int freeSpace = 4 - peopleInCabin;

            if (peopleInCabin == 4) {
                continue;
            }
            if (freeSpace >= waitingPeople) {
                liftCabins[i] = liftCabins[i] + waitingPeople;
                waitingPeople = 0;
                break;
            }
            liftCabins[i] = 4;
            waitingPeople = waitingPeople - freeSpace;
        }
        boolean hasEmptySeats = false;
        for (int peopleInCabin : liftCabins) {
            if (peopleInCabin < 4) {
                hasEmptySeats = true;
                break;
            }
        }
        if (hasEmptySeats) {
            System.out.println("The lift has empty spots!");
        } else if (!hasEmptySeats && waitingPeople != 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", waitingPeople);
        }
        Arrays.stream(liftCabins).forEach(value -> System.out.print(value + " "));
    }
}
