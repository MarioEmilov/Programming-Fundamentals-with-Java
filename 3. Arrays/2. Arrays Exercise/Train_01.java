import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine()); //брой на вагоните
        int [] peopleInWagons = new int[n]; //[12, 24, 8]

        for (int index = 0; index <= peopleInWagons.length - 1; index++) {
            peopleInWagons[index] = Integer.parseInt(scanner.nextLine());
        }

        //всеки елемент от масива -> принтирам -> сумирам
        int sumPeople = 0;
        for (int countPeople : peopleInWagons) {
            System.out.print(countPeople + " ");
            sumPeople += countPeople;
        }

        System.out.println();
        System.out.println(sumPeople);
    }
}
