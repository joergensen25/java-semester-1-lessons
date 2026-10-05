package opgave01;

public class Book {
    String title;
    String author;
    String forlag;
    String genre;
    int pages;

    public Book(String title, String author, String forlag, int pages) {
        this.author = author;
        this.title = title;
        this.forlag = forlag;
        this.pages = pages;


    }


    public static void main(String[] args) {
        Book book1 = new Book("Lærebog i Programmering", "Jens Jensen","Gyldendal" ,1000);

        System.out.println("Bogens titel er "+book1.title +", bogens forfatter er "+book1.author +
                " og bogen har "+book1.pages +" sider.");

        Book book2 = new Book("Lærebog i Geoteknik", "Hans Hansen","Gyldendal",950);
        System.out.println("Bogens titel er "+book2.title +", bogens forfatter er "+book2.author +
                " og bogen har "+book2.pages +" sider.");




    }
}
