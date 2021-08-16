import java.util.Scanner;

public class Common_Elements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1 ред -> масив1
        //2 ред -> масив2

        String firstRow = scanner.nextLine(); //"Hey hello 2 4"
        String secondRow = scanner.nextLine(); //"10 hey 4 hello"

        String[] array1 = firstRow.split(" "); //["Hey", "hello", "2", "4"]
        String[] array2 = secondRow.split(" "); //["10", "hey", "4", "hello"]

        for (String secondWord : array2) {
            for (String firstWord : array1) {
                if(secondWord.equals(firstWord)) {
                    System.out.print(firstWord + " ");
                }
            }
        }
    }
}
