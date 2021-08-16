import java.util.Scanner;

public class Print_part_of_ASCII_table_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());

        for (int code = startNumber; code <= endNumber; code++) {
            System.out.print((char)code + " ");
        }
    }
}
