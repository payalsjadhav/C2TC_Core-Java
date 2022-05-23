package queries.service;

import java.util.List;

import queries.entities.Book;


public interface BookService {
	void addBook(Book book);
	Book getBookById(int id);
	List<Book> getBookByTitle(String title);
	Long getBookCount();
	List<Book> getAuthorBooks(String author);
	List<Book> getAllBooks();
	List<Book> getBooksInPriceRange(double low, double high);
}
