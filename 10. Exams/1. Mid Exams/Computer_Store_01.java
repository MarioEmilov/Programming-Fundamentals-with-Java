import java.util.Scanner;

public class Computer_Store_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceWithoutTaxes = 0.0;
        double taxes = 0.0;
        double totalPrice = 0.0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("special")) {
                totalPrice = totalPrice * 0.90;
                break;
            } else if (input.equals("regular")) {
                break;
            }
            double partPrice = Double.parseDouble(input);
            if (partPrice < 0) {
                System.out.println("Invalid price!");
                continue;
            }
            priceWithoutTaxes += partPrice;
            double tax = partPrice * 0.20;
            taxes += tax;
            totalPrice += partPrice + tax;

        }
        if (totalPrice == 0) {
            System.out.println("Invalid order!");
            return;
        }
        System.out.println("Congratulations you've just bought a new computer!");
        System.out.printf("Price without taxes: %.2f$%n", priceWithoutTaxes);
        System.out.printf("Taxes: %.2f$%n", taxes);
        System.out.println("-----------");
        System.out.printf("Total price: %.2f$", totalPrice);
    }
}
