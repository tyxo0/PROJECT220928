import java.util.Scanner;
class Book3 {
    String title, author;
    public Book3(String title, String author) {
        this.title = title;
        this.author = author;
    }
}
public class BookArray {
    public static void main(String[] args) {
        Book3 [] Book3 = new Book3[2];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < Book3.length; i++) {
            System.out.print("제목>>");
            String title = scanner.nextLine();
            System.out.print("저자>>");
            String author = scanner.nextLine();
            Book3[i] = new Book3(title, author);
        }
        for(int i = 0; i < Book3.length; i++)
            System.out.print("(" + Book3[i].title + ", " + Book3[i].author + ")");
        scanner.close();
    }
}
