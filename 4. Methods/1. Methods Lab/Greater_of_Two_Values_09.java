import java.util.Scanner;

public class Greater_of_Two_Values_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  type    = scanner.nextLine ();
        String  a       = scanner.nextLine ();
        String  b       = scanner.nextLine ();
        switch (type) {
            case "int":
                System.out.println (getMax(Integer.parseInt (a),Integer.parseInt (b)));
                break;
            case "char":
                System.out.println (getMax (a.charAt (0),b.charAt (0)));
                break;
            case "string":
                System.out.println (getMax(a, b));
                break;
        }
    }
    private static int getMax(int firstNum, int secondNum) {
        if (firstNum > secondNum) {
            return firstNum;
        }
        return secondNum;
    }
    private static char getMax(char first, char second) {
        if (first > second) {
            return first;
        }
        return second;
    }
    private static String getMax(String first, String second) {
        if (first.compareTo(second) >= 0) {
            return first;
        }
        return second;
    }
}
