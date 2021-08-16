import java.util.*;

public class Students_05 {
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


    static Students_2_06.Student findStudent (String firstName, String lastName, List<Students_2_06.Student> students){
        for (Students_2_06.Student student : students) {
            if (student.getFirstName().equalsIgnoreCase(firstName)
                    && student.getLastName().equalsIgnoreCase(lastName)){
                return student;

            }

        }

        return null;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Students_2_06.Student> students = new ArrayList<>();


        String input = scanner.next();
        while (input.equalsIgnoreCase("end")){
            String firstName = input;
            String lastName = scanner.next();
            int age = scanner.nextInt();
            String hometown = scanner.next();


            Students_2_06.Student existingStudent = findStudent(firstName, lastName,students);
            if (existingStudent != null){
                existingStudent.setAge(age);
                existingStudent.setHometown(hometown);
            }else {
                Students_2_06.Student student = new Students_2_06.Student(firstName, lastName, age, hometown);
                students.add(student);
            }
            input = scanner.next();
        }

        String cityName = scanner.next();

        for (Students_2_06.Student student : students) {
            if (student.getHometown().equals(cityName)){
                System.out.printf("%s %s is %d years old.%n",
                        student.getFirstName(),student.getLastName(),student.getAge());

            }
        }
    }
}

