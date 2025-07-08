

public class DemoBook extends Book{
    
    public DemoBook(String ISBN, String title, int year){
        super(ISBN, title, year, 0.0);
    }
    
    public boolean isShippable(){
        return false;
    }
    public boolean isPurchasable(){
        return false;
    }
    public boolean hasQuantity(){
        return false;
    }
    
    public double buy(String ISBN){
        System.out.println("Demo book, not for sale");
        return 0.0;
    }
}