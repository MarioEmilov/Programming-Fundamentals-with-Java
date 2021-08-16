import java.util.*;

public class Company_Users_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<String>> companies = new TreeMap<>();
        while (!"End".equals(input)) {
            String companyName = input.split(" -> ")[0];
            String employeeId = input.split(" -> ")[1];
            if (!companies.containsKey(companyName)) {
                companies.put(companyName, new ArrayList<>());
            }
            if (!companies.get(companyName).contains(employeeId)) {
                companies.get(companyName).add(employeeId);
            }
            input = scanner.nextLine();
        }

        companies.entrySet()
                .forEach(entry -> {
                    System.out.println(entry.getKey());
                    entry.getValue().forEach(emp -> {
                        System.out.println("-- " + emp);
                    });
                });
    }
}

