import java.util.*;
import java.util.stream.Collectors;

public class Students_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentCount = Integer.parseInt(scanner.nextLine());
        List<Student> students = new ArrayList<>();
        for (int student = 1; student <= studentCount; student++) {
            String studentData = scanner.nextLine();
            String [] splitData = studentData.split("\\s+");
            String firstName = splitData[0];
            String lastName = splitData[1];
            double grade = Double.parseDouble(splitData[2]);

            Student st = new Student(firstName, lastName, grade);
            students.add(st);
        }
        //descending by grade: ascending -> reverse
        students = students.stream().sorted(Comparator.comparing(Student::getGrade)).collect(Collectors.toList());
        Collections.reverse(students);

        for (Student s: students) {
            System.out.println(s.toString());
        }
    }
}
