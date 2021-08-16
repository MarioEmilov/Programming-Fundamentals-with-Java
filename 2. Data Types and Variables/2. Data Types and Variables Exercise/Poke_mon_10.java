import java.util.Scanner;

public class Poke_mon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pokePower = Integer.parseInt(scanner.nextLine());//N
        int distance = Integer.parseInt(scanner.nextLine());//M
        int exhaustFactor = Integer.parseInt(scanner.nextLine());//Y
        int countTargets = 0;
        int z = pokePower;

        while (z >= distance) {
        z = z - distance;
        countTargets++;

        if (z == pokePower * 0.5 && exhaustFactor != 0) {
            z = z / exhaustFactor;
        }
        }
        System.out.println(z);
        System.out.println(countTargets);
    }
}
