import java.util.Scanner;

public class Array_Rotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //масив
        String input = scanner.nextLine(); //"51 47 32 61 21"
        String[] numbers = input.split(" ");//"51 47 32 61 21".split(" ") -> ["51", "47", "32", "61", "21"]
        int countRotations = Integer.parseInt(scanner.nextLine()); //брой на ротациите

        for (int rotation = 1; rotation <= countRotations; rotation++) {
            //ротация
            //1. взимам си първия елемент
            String firstElement = numbers[0];
            //2. местя всички елементи с 1 наляво (индексът на елемента = индекс - 1
            for (int index = 0; index < numbers.length - 1; index++) {
                numbers[index] = numbers[index + 1];
            }
            //3. на последния индекс = първия елемент
            numbers[numbers.length - 1] = firstElement;
        }
        System.out.println(String.join(" ", numbers));
        /* Това е същото като горното принтиране
        for (String number : numbers) {
            System.out.print(number + " ");
        }
         */
    }
}
