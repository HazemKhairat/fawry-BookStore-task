
public abstract class Book {
    
	protected String ISBN;
	protected String title;
	protected int year;
	protected double price;

	public Book(String ISBN, String title, int year, double price) {
		this.ISBN = ISBN;
		this.title = title;
		this.year = year;
		this.price = price;
	}

	public String getISBN() {
		return this.ISBN;
	}
	public String getTitle() {
		return this.title;
	}
	public int getYear() {
		return this.year;
	}
	public double getPrice() {
		return this.price;
	}
	public int getQuantity() {
		return 0;
	}
	public double buy() {
	    return 0.0;
	}


	public abstract boolean isShippable();
	public abstract boolean isPurchasable();
	public abstract boolean hasQuantity();


}

