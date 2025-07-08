import java.util.ArrayList;
import java.util.List;

public class EBook extends Book {
	private String fileType;

	public EBook(String ISBN, String title, int year, double price, String fileType) {
		super(ISBN, title, year, price);
		this.fileType = fileType;
	}

	public boolean isShippable() {
		return false;
	}
	public boolean isPurchasable() {
		return true;
	}
	public boolean hasQuantity() {
		return false;
	}

	public double buy(String ISBN, String email) {
		Inventory inventory = Inventory.getInstance();
		Book book = inventory.findBookByISBN(ISBN);

		if (book == null) {
			System.out.println("The book is not available.");
			return 0.0;
		}

		MailService mail = new MailService(book, email);
		System.out.println("Successful payment operation, The book (" + book.getTitle() +  ") sent to: " + email);
		return book.getPrice();
	}
}