import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Fancy_Barcodes_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "@#+(?<productName>[A-Z][A-Za-z0-9]{4,}[A-Z])@#+";
        Pattern pattern = Pattern.compile(regex);
        int n = Integer.parseInt(scanner.nextLine()); //брой на баркодове
        for (int i = 1; i <= n; i++) {
            String barcode = scanner.nextLine();
            //проверка дали е валиден
            Matcher matcher = pattern.matcher(barcode);
            //валиден -> търсим product group -> печатаме
            if (matcher.find()) {
                //валиден
                String productName = matcher.group("productName"); //"B r e a 0 D"
                StringBuilder productNumber = new StringBuilder(); //"" -> всички цифри от името на продукта
                for (int index = 0; index < productName.length(); index++) {
                    char currentSymbol = productName.charAt(index);
                    //проверка дали е цифра
                    if (Character.isDigit(currentSymbol)) {
                        productNumber.append(currentSymbol);
                    }
                }

                //отпечатваме productNumber
                //ако нямаме цифри
                if (productNumber.toString().equals("")) {
                    System.out.println("Product group: 00");
                } else {
                    System.out.printf("Product group: %s%n", productNumber);
                }

            }
            //невалиден -> печатаме
            else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
