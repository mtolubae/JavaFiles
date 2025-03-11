import java.util.Arrays;
import java.util.Objects;

public class Book {
    private String title;
    private String[] author;
    private int numberOfPages;

    public Book(String title, String author, int numberOfPages){
        this.title = title;
        //this.author = author;
        this.author = new String[2];
        this.author[0] = author;
        this.numberOfPages = numberOfPages;
    }

    public Book() {
        this.author = new String[2];
    }

    public String getTitle(){
        //return this.title;
        return title;
    }

    public void setTitle(String newTitle){
        title = newTitle;
    }

    public String getAuthor() {
        return this.author[0];
        //return author;
    }

    public void setAuthor(String author) {
        this.author[0] = author;
    }

    public void setAuthor(String author1, String author2){
        this.author[0] = author1;
        this.author[1] = author2;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }


    public boolean equals(Book book) {
        return getAuthor() == book.getAuthor() &&
                getTitle() == book.getTitle()  &&
                getNumberOfPages() == book.getNumberOfPages();
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + Arrays.toString(author) +
                ", numberOfPages=" + numberOfPages +
                '}';
    }
}

class MainBook{
    public static void main(String[] args){
        Book b1 = new Book();
        Book b2 = new Book("Harry Potter", "J.K. Rowling", 700);
        Book b3 = new Book("Harry Potter", "J.K. Rowling", 700);


        //System.out.println("Info about b1: "+ b1.getTitle() + " "+b1.getAuthor());
        //System.out.println("Info about b2: "+ b2.getTitle() + " "+b2.getAuthor());
        if(b2 == b3){
            System.out.println("Yes, b2 and b3 are the same");
        }
        else{
            System.out.println("No, NOT the same");
        }

        if(b2.equals(b3)){
            System.out.println("Yes, b2 and b3 are the same");
        }
        else{
            System.out.println("No, NOT the same");
        }
    }
}
