// Singlton pattern Applied

import java.util.ArrayList;
import java.util.List;


public class Inventory {
	private static final int CURR_YEAR = 2025;

	private Inventory() {}
	private static Inventory instance;

	private static List<Book> books = new ArrayList<>();

	public static Inventory getInstance() {
		if(instance == null) {
			instance = new Inventory();
		}
		return instance;
	}

	public List<Book> getBooks() {
		return books;
	}

	public Book findBookByISBN(String ISBN) {
		for (Book book : books) {
			if (book.getISBN().equals(ISBN)) {
				return book;
			}
		}
		return null;
	}

	public void addBook(Book book) {
		Inventory.books.add(book);
	}

	public List<Book> removeOutDatedBook(int years) {
		List<Book> outDated = new ArrayList<>();

		books.removeIf(book -> {
			if(CURR_YEAR - book.getYear() >= years) {
				outDated.add(book);
				return true;
			}
			return false;
		});

		return outDated;
	}




}