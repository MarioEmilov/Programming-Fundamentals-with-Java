public class Person2 {
    //полета -> характеристики
    private String name;
    private String id;
    private int age;


    //конструктур
    public Person2(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return String.format("%s with ID: %s is %d years old.", this.name, this.id, this.age);
    }
}
