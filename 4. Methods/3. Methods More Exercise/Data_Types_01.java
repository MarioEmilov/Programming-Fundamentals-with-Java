import java.util.Scanner;

public class Data_Types_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        switch (input){
            case "int":
                getInt(scanner);
                break;
            case "real":
                getReal(scanner);
                break;
            case "string":
                getString(scanner);
                break;
        }
    }
    private static void getInt(Scanner scanner){
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(number * 2);
    }
    private static void getReal(Scanner scanner){
        double number = Double.parseDouble(scanner.nextLine());
        System.out.printf("%.2f",number * 1.5);
    }
    private static void getString(Scanner scanner){
        String text = scanner.nextLine();
        System.out.println("$" + text + "$");
    }
}
