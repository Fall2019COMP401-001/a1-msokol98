package a1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int itemCount = scan.nextInt();
		Item[] items = new Item[itemCount];
		
		for(int i = 0; i < items.length; i++) {
			
			String itemName = scan.next();
			Double itemPrice = scan.nextDouble();
			items[i] = new Item(itemName, itemPrice, 0, 0);
			
		}	
		

		int customerCount = scan.nextInt();
		Customer[] customers = new Customer[customerCount];
		
		for(int j = 0; j < customers.length; j++) {
			
			
			String firstName = scan.next();
			String lastName = scan.next();
									
			int numUniqItems = scan.nextInt();
									
			List<Item> cusItems = new ArrayList<>();
			customers[j] = new Customer(firstName, lastName, numUniqItems, 0.0, cusItems);
			
			for(int u = 0; u < numUniqItems; u++) {
				int numCertainItem = scan.nextInt();
				String nameCertainItem = scan.next();
				for(Item i: items) {
					if(i.name.equalsIgnoreCase(nameCertainItem)) {
						i.timesBought += 1;
						cusItems.add(i);
					}
				}
			}
		}
		for(Item i: items) {
			for(Customer c: customers) {
				if(c.items.contains(i)) {
					i.numCustomersBoughtBy += 1;
				}
			}
			if(i.numCustomersBoughtBy == 0) {
				System.out.println("No customers bought " + i.name);
			} else {
				System.out.println(i.numCustomersBoughtBy + " customers bought " + i.timesBought + " " + i.name);
			}
		}
	}
}
