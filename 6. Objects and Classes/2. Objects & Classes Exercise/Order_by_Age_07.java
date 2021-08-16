import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Order_by_Age_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person2> people = new ArrayList<>();

        while (true) {
            String personalData = scanner.nextLine();
            if (personalData.equals("End")) {
                break;
            }
            String[] splitData = personalData.split("\\s+");
            String name = splitData[0];
            String id = splitData[1];
            int age = Integer.parseInt(splitData[2]);

            Person2 person2 = new Person2(name, id, age);
            people.add(person2);
        }
        people.sort(Comparator.comparing(Person2::getAge));
        for (Person2 person : people) {
            System.out.println(person.toString());
        }
    }
}
