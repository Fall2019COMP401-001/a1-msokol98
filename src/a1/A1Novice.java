package a1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class A1Novice {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int count = scan.nextInt();
		
		int[] shoppers = new int[count];
		
		//System.out.println("# of shoppers: " + shoppers.length);
		
		for(int i = 0; i < shoppers.length; i++) {
			
			String firstName = scan.next();
			char firstInitial = firstName.charAt(0);
			String lastName = scan.next();
			int numUniqItems = scan.nextInt();
			
			String[] items = new String[numUniqItems];
			
			//System.out.println("# of unique items for " + firstInitial + ". " + lastName + ": " + items.length);
			
			double total = 0.0;
			
			for(int j = 0; j < items.length; j++) {
				int numCertainItem = scan.nextInt();
				String nameCertainItem = scan.next();
				double priceCertainItem = scan.nextDouble();
				
				//System.out.println("# of " + nameItem + " for " + firstInitial + ". " + lastName + ": " + numCertainItem);
				
				total += (numCertainItem * priceCertainItem);
			}
			
			System.out.println(firstInitial + ". " + lastName + ": " + String.format("%.2f", total));
			
			
		}	
		
		scan.close();
	}
}
