import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //username
        //1. намираме паролата -> username на обратно
        String username = scanner.nextLine();
        //username: "Desity16" -> password: "61ytiseD"
        String password = "";
        for (int position = username.length() - 1; position >= 0; position--) {
            //Взимам символа на текущата позиция
            char currentSymbol = username.charAt(position);
            //добавям към паролата
            password += currentSymbol;
        }

        //повтаряме: въвеждаме парола
        //спираме: въведената парола == password
        //продължаваме: въведената парола != password
        String enteredPassword = scanner.nextLine();
        int countFailedAttempts = 0;
        while (!enteredPassword.equals(password)) {
            //грешна парола
            countFailedAttempts++;
            //проверка дали не съм достигнал макс брой от 4 въвеждания
            if (countFailedAttempts >= 4) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            enteredPassword = scanner.nextLine();
        }

        //enteredPassword == password
        if (enteredPassword.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }
    }
}
