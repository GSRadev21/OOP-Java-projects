public class MyBook extends Book {

    private String title;
    private String author;
    private double price;

    public MyBook(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    public void getDetails(String title, String author, double price) {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
