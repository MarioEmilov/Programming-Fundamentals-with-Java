import java.util.*;

public class Articles2_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Articles2> articleList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] articleToken = scanner.nextLine().split(", ");
            String title = articleToken[0];
            String content = articleToken[1];
            String author = articleToken[2];
            Articles2 article = new Articles2(title, content, author);
            if (!articleList.contains(article)) {
                articleList.add(article);
            }
        }
        String filter = scanner.nextLine();
        switch (filter) {
            case "content":
                Collections.sort(articleList, new Comparator<Articles2>() {
                    @Override
                    public int compare(Articles2 o1, Articles2 o2) {
                        return o1.content.compareTo(o2.content);
                    }
                });
                break;
            case "title":
                Collections.sort(articleList, new Comparator<Articles2>() {
                    @Override
                    public int compare(Articles2 o1, Articles2 o2) {
                        return o1.title.compareTo(o2.title);
                    }
                });
                break;
            case "author":
                Collections.sort(articleList, new Comparator<Articles2>() {
                    @Override
                    public int compare(Articles2 o1, Articles2 o2) {
                        return o1.author.compareTo(o2.author);
                    }
                });
                break;
        }
        for (Articles2 article : articleList) {
            System.out.println(article);
        }
    }
}
