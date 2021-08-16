import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> productsQuantity = new LinkedHashMap<>();
        Map<String, Double> productsPrice = new LinkedHashMap<>();
        Map<String, Double> products = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("buy")) {
            String[] product = input.split("\\s+");
            String name = product[0];
            double price = Double.parseDouble(product[1]);
            int quantity = Integer.parseInt(product[2]);

            if (!productsQuantity.containsKey(name)) {
                productsQuantity.put(name, quantity);
                productsPrice.put(name, price);
                products.put(name, 0.0);
            } else {
                productsPrice.put(name, price);
                int currentQuantity = productsQuantity.get(name);
                productsQuantity.put(name, currentQuantity += quantity);
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, Double> entry : products.entrySet()) {
            String key = entry.getKey();
            double value = productsPrice.get(key) * productsQuantity.get(key);
            products.put(key, value);
        }
        for (Map.Entry<String, Double> entry : products.entrySet()) {
            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
        }
    }
}
