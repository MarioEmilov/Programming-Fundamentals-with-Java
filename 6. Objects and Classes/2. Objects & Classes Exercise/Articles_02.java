import java.util.Scanner;

public class Articles_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String articleData = scanner.nextLine(); //"{title}, {content}, {author}"
        String[] splitData = articleData.split(", ");
        String title = splitData[0];
        String content = splitData[1];
        String author = splitData[2];

        //Създаваме нов обект от клас Articles
        Articles article = new Articles(title, content, author);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            String commandName = command.split(": ")[0];
            String commandParameter = command.split(": ")[1];

            switch (commandName) {
                case "Edit":
                    article.edit(commandParameter);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(commandParameter);
                    break;
                case "Rename":
                    article.rename(commandParameter);
                    break;
            }
        }
        System.out.println(article.toString());
    }
}
