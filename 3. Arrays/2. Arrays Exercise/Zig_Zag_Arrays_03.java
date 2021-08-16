import java.util.Scanner;

public class Zig_Zag_Arrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine()); //брой редове
        int[] array1 = new int[n]; //масив 1
        int[] array2 = new int[n];//масив 2
        //четен ред -> първо число (втори масив); второ число (първи масив)
        //нечетен ред -> първо число (първи масив); второ число(втори масив)
        for (int row = 0; row < n; row++) {// 0 -> 1, 1 -> 2, 2 ->3
            String input = scanner.nextLine(); //"12 34" -> split(" ") -> ["12", "34"]
            int firstNumber = Integer.parseInt(input.split(" ")[0]);
            int secondNumber = Integer.parseInt(input.split(" ")[1]);
            //проверка дали е четен реда
            if((row + 1) % 2 == 0) {
                array1[row] = secondNumber;
                array2[row] = firstNumber;
            } else {
                array1[row] = firstNumber;
                array2[row] = secondNumber;
            }
        }
        //отпечатаме масив 1
        for (int number : array1) {
            System.out.print(number + " ");
        }
        System.out.println();
        //отпечатаме масив 2
        for (int number : array2 ) {
            System.out.print(number + " ");
        }
    }
}
