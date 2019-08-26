package a1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class A1Adept {

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
									
			customers[j] = new Customer(firstName, lastName, numUniqItems, 0.0, null);
			
			for(int u = 0; u < numUniqItems; u++) {
				int numCertainItem = scan.nextInt();
				String nameCertainItem = scan.next();
				for(Item i: items) {
					if(i.name.equalsIgnoreCase(nameCertainItem)) {
						customers[j].total += (numCertainItem * i.price);
					}
				}
			}
			
		}
		
		
		scan.close();
		
		
		System.out.println("Biggest: " + findMax(customers));
		System.out.println("Smallest: " + findMin(customers));
		System.out.println("Average: " + findAvg(customers));
		
	}
	static String findMax(Customer customers[]) {
		Customer currentMax = customers[0];
		for(Customer c: customers) {
			if(c.total > currentMax.total) {
				currentMax = c;
			}
		}
		return currentMax.firstName + " " + currentMax.lastName + " (" + String.format("%.2f", currentMax.total) + ")";
	}
	static String findMin(Customer customers[]) {
		Customer currentMin = customers[0];
		for(Customer c: customers) {
			if(c.total < currentMin.total) {
				currentMin = c;
			}
		}
		return currentMin.firstName + " " + currentMin.lastName + " (" + String.format("%.2f", currentMin.total) + ")";
	}
	static String findAvg(Customer customers[]) {
		double cumTotal = 0.0;
		for(Customer c: customers) {
			cumTotal += c.total;
		}
		double avg = cumTotal/customers.length;
		return String.format("%.2f", avg);
	}
}
