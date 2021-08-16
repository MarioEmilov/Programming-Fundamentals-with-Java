import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUni_Parking_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> parkingLot = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String command = tokens[0];

            switch (command) {
                case "register":
                    String name = tokens[1];
                    String plateNumber = tokens[2];
                    if (parkingLot.containsKey(name)) {
                        System.out.printf("ERROR: already registered with plate number %s%n", parkingLot.get(name));
                    } else {
                        parkingLot.put(name, plateNumber);
                        System.out.printf("%s registered %s successfully%n", name, plateNumber);
                    }
                    break;
                case "unregister":
                    String name1 = tokens[1];
                    if (!parkingLot.containsKey(name1)) {
                        System.out.printf("ERROR: user %s not found%n", name1);
                    } else {
                        System.out.printf("%s unregistered successfully%n", name1);
                        parkingLot.remove(name1);
                    }
                    break;
            }
        }
        parkingLot.entrySet().forEach(entry -> System.out.println(entry.getKey() + " => " + entry.getValue()));
    }
}
