public class Articles {
    //полета -> характеристики
    private String title;
    private String content;
    private String author;

    // създавеме конструктор, който ще приема трите стринга
    public Articles(String title, String content, String author) {
        //даваме стойности на стринговете, защото в момента е празен (в конзолата са подадени вече елементите от мейн класа)
        this.title = title;
        this.content = content;
        this.author = author;
    }
    //метод №1 - сменя content
    public void edit(String newContent) {
        this.content = newContent;
    }
    //метод №2 - сменя author
    public void changeAuthor(String newAuthor) {
        this.author = newAuthor;
    }
    //метод №3 - сменя title
    public void rename(String newTitle) {
        this.title = newTitle;
    }
    //метод №4 - печатаме
    public String toString() {
        //опиша как изглецда моя обект като стринг
        //"{title} - {content}:{author}"
        return this.title + " - " + this.content + ": " + this.author;
    }
}
