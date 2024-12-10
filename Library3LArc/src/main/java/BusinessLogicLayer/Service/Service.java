package BusinessLogicLayer.Service;

import DataLayer.Repositories.BookRepository;
import DataLayer.models.BookModel;

public class Service {

    BookRepository bookRepository;

    public void addBook(BookModel book) {
        bookRepository.addBook(book);
    }

    public void searchBook(BookModel book) {
        bookRepository.searchBook(book);
    }

    public void removeBook(BookModel book) {
        bookRepository.removeBook(book);
    }
}
