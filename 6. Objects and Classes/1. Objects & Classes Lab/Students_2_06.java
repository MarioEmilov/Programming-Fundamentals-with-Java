import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students_2_06 {
    static  class Student{

        private  String firstName;
        private  String lastName;
        private  int age;
        private  String hometown;

        public Student(String firstName, String lastName, int age, String hometown) {

            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.hometown = hometown;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getHometown() {
            return hometown;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
        public void setHometown(String hometown) {
            this.hometown = hometown;
        }
    }


    static Student findStudent (String firstName, String lastName, List<Student> students){
        for (Student student : students) {
            if (student.getFirstName().equalsIgnoreCase(firstName)
                    && student.getLastName().equalsIgnoreCase(lastName)){
                return student;

            }

        }

        return null;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();


        String input = scanner.next();
        while (input.equalsIgnoreCase("end")){
            String firstName = input;
            String lastName = scanner.next();
            int age = scanner.nextInt();
            String hometown = scanner.next();


            Student existingStudent = findStudent(firstName, lastName,students);
            if (existingStudent != null){
                existingStudent.setAge(age);
                existingStudent.setHometown(hometown);
            }else {
                Student student = new Student(firstName, lastName, age, hometown);
                students.add(student);
            }
            input = scanner.next();
        }

        String cityName = scanner.next();

        for (Student student : students) {
            if (student.getHometown().equals(cityName)){
                System.out.printf("%s %s is %d years old.%n",
                        student.getFirstName(),student.getLastName(),student.getAge());

            }
        }
    }
}
