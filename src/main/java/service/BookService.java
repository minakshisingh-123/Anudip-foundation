package service;

import java.util.List;

import DAO.BookDAO;
import model.Book;
import model.Library;

public class BookService {
	
	 private final BookDAO bookDao = new BookDAO();

	    public void addBook(Book book) {
	        bookDao.addBook(book);
	    }

	    public List<Book> getAllBooks() {
	      return bookDao.getAllBooks();

  }

}