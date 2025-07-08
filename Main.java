import java.util.*;

public class Main {
	public static void main(String[] args) {
	    // create only one object of Inventory
		Inventory inventory = Inventory.getInstance();
		
		
        // create new books
		PaperBook book1 = new PaperBook("B120", "Atomic Habits", 2018, 150.0, 10);
		EBook book2 = new EBook("B121", "Rich Dad Poor Dad", 2016, 150.0, "pdf");
		DemoBook book3 = new DemoBook("B122", "book3", 2016);
		PaperBook book4 = new PaperBook("B123", "Never Touch a Dinosaur!", 2019, 150.0, 10);
		PaperBook book5 = new PaperBook("B124", "book5", 2012, 150.0, 10);
		PaperBook book6 = new PaperBook("B125", "book6", 2012, 150.0, 10);
		   
		   
		// add books to the inventory
		inventory.addBook(book1);
		inventory.addBook(book2);
		inventory.addBook(book3);
		inventory.addBook(book4);
		inventory.addBook(book5);
		inventory.addBook(book6);
		
		// remove and return outdated books that passed specific number of years
		System.out.println("===== Outdated Books Test =====");
		List<Book> outDatedBooks = inventory.removeOutDatedBook(10);
		for(Book book : outDatedBooks){
		    System.out.println("The Book with ISBN " + book.getISBN() + " has been outdated");
		}
		
		// Buy a single book
		System.out.println("\n===== PaperBook Test =====");
		double test_book1 = book1.buy("B120", 5, "Cairo");
		System.out.println("\n===== EBook Test =====");
		double test_book2 = book2.buy("B121","hazem@gmail.com");
		System.out.println("\n===== DemoBook Test =====");
		double test_book3 = book3.buy("B122");
		System.out.println("\n===== Quantity Test =====");
		double test_book4 = book4.buy("B123", 12, "Cairo");

	}
}
