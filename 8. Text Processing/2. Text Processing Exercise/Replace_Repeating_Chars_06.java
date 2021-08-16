import java.util.Scanner;

public class Replace_Repeating_Chars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        //+StringBuilder builder = new StringBuilder(inputText);
        //for (int index = 0; index < builder.length() - 1; index++) {
        //  if (builder.charAt(index) == builder.charAt(index + 1)) {
        //    builder.deleteCharAt(index + 1);
        //      index--;
        //    }
        // }
        //System.out.println(builder);

        StringBuilder newText = new StringBuilder();
        //1. добавям първата буква към новия текст
        //2. взимам всички други букви до края
        //-> проверявам дали текущата буква е различна от последната добавена в новия текст
        //ако е различна -> добавям я в новия текст
        char firstLetter = inputText.charAt(0);
        newText.append(firstLetter);
        for (int index = 1; index < inputText.length(); index++) {
            char currentSymbol = inputText.charAt(index);
            char lastAddedSymbolInNewText = newText.charAt(newText.length() - 1);
            if (currentSymbol != lastAddedSymbolInNewText) {
                newText.append(currentSymbol);
            }
        }
        System.out.println(newText);
    }
}
