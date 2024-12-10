package DataLayer.Repositories;

import DataLayer.models.BookModel;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class BookRepository {

    private Scanner scanner = new Scanner(System.in);
    private ArrayList<BookModel> books = new ArrayList<>();

    public void addBook(BookModel book) {
        books.add(book);
    }

    public void searchBook(BookModel book) {

        for(int i = 0; i < books.size(); i++){

            if(books.get(i) == book){
                System.out.println( "Found at index " + i );
            }
        }
    }

    public void removeBook(BookModel book) {

        for(int i = 0; i < books.size(); i++){

            if(books.get(i) == book){
                books.remove(i);
                System.out.println(" Removed!");
            }
        }
    }
}
