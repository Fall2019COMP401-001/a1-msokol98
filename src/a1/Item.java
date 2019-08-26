package a1;

public class Item {
	
	String name; 
	double price;
	int timesBought;
	int numCustomersBoughtBy;
	
	public Item(String name, double price, int timesBought, int numCustomersBoughtBy) {
		this.name = name;
		this.price = price;
		this.timesBought = timesBought;
		this.numCustomersBoughtBy = numCustomersBoughtBy;
	}
}
