package DataLayer.models;

public class BookModel {

    private String title;
    private String author;
    private String publisher;
    private int yearOfPublication;

    public BookModel(String title, String author, String publisher, int yearOfPublication) {

        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
    }
}
