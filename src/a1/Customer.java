package a1;

import java.util.List;

public class Customer {
	String firstName;
	String lastName;
	int numUniqItems;
	double total;
	List<Item> items;

	
	public Customer(String firstName, String lastName, int numUniqItems, double total, List<Item> items) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.numUniqItems = numUniqItems;
		this.total = total;
		this.items = items;
	}
}
