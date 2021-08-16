import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantity = Integer.parseInt(scanner.nextLine());
        String group = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;

        if (group.equals("Students")) {
            switch (day) {
                case "Friday":
                    price = quantity * 8.45;
                    break;
                case "Saturday":
                    price = quantity * 9.80;
                    break;
                case "Sunday":
                    price = quantity * 10.46;
                    break;
            }
            if (quantity >=30){
                price = price * 0.85;

            }
        } else if (group.equals("Business")) {
            if (quantity >=100) {
                quantity -= 10;
            }
            switch (day) {
                case "Friday":
                    price = quantity * 10.90;
                    break;
                case "Saturday":
                    price = quantity * 15.60;
                    break;
                case "Sunday":
                    price = quantity * 16.00;
                    break;
            }
        } else if (group.equals("Regular")){
            switch (day) {
                case "Friday":
                    price = quantity * 15.00;
                    break;
                case "Saturday":
                    price = quantity * 20.00;
                    break;
                case "Sunday":
                    price = quantity * 22.50;
                    break;
            }
            if (quantity >=10 && quantity<=20){
                price = price * 0.95;
            }
        }
        System.out.printf("Total price: %.2f",price);
    }
}
