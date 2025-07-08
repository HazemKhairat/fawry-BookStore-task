import java.util.ArrayList;
import java.util.List;


public class PaperBook extends Book {

	private int quantity;

	public PaperBook(String ISBN, String title, int year, double price, int quantity) {
		super(ISBN, title, year, price);
		this.quantity = quantity;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public boolean isShippable() {
		return true;
	}
	public boolean isPurchasable() {
		return true;
	}
	public boolean hasQuantity() {
		return true;
	}

	public double buy(String ISBN, int quantity, String address) {
		Inventory inventory = Inventory.getInstance();
		Book book = inventory.findBookByISBN(ISBN);

		if (book == null) {
			System.out.println("The book is not available.");
			return 0.0;
		}

		PaperBook paperBook = (PaperBook) book;
		if (quantity <= paperBook.getQuantity()) {
			paperBook.quantity -= quantity;  // Update the quantity in inventory
			ShippingService shipping = new ShippingService(paperBook, address);
			double paid_amount = (paperBook.getPrice() * quantity);
			System.out.println("The book (" + book.getTitle() + ") will be sent to " + address +
			                   " and the total price paid is: " + paid_amount);
			return paid_amount;
		} else {
			System.out.println("Not enough quantity of (" + book.getTitle() + ") book");
			return 0.0;
		}

	}

}