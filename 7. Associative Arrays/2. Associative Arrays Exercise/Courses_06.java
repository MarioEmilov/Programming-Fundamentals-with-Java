import java.util.*;

public class Courses_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<String>> courses = new LinkedHashMap<>();

        while (!input.equals("end")) {
            //"{име на курса} : {име на човек}" -> split (" : ") -> ["{courseName}", "{student name}"
            String courseName = input.split(" : ")[0];
            String personName = input.split(" : ")[1];
            if (!courses.containsKey(courseName)) {
                courses.put(courseName, new ArrayList<>());
            }
            //ако курса е нов -> връща празен списък
            //ако курса е стар -> връща моментния списък с хора
            courses.get(courseName).add(personName);
            input = scanner.nextLine();
        }
        //в ляво се сортират по-големия курс а в дясно по малките курсове
        courses.entrySet().stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                //compare (сравнява) стойността и връща 1, 0, -1 -> ако върне 1 (е2 > е1) ще ги размени
                //ако върне 0 -> ще ги запази и ако върне -1 -> отново ще ги остави
                //сортира курсовете(ключовете) по брой хора (descending order / намаляващ ред)
                .forEach(entry -> {
                    //key: име на курса
                    //value: списък с хората
                    //име на курса -> бр. хората
                            System.out.println(entry.getKey() + ": " + entry.getValue().size());
                            entry.getValue()
                            .stream().sorted().forEach(students -> System.out.println("-- " + students));
                            //ascending order / нарастващ ред
                        });
    }
}
