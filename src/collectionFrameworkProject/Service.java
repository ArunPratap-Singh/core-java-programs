package collectionFrameworkProject;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Service {

	private List<Shirt> shirts = new ArrayList<>();
	
	{
		shirts.add(new Shirt("Levis", 2500.0, "Red", 38));
		shirts.add(new Shirt("Peter England", 1800.0, "Blue", 40));
		shirts.add(new Shirt("Allen Solly", 2200.0, "Black", 42));
		shirts.add(new Shirt("Louis Philippe", 3000.0, "White", 40));
		shirts.add(new Shirt("Van Heusen", 2700.0, "Grey", 42));
		shirts.add(new Shirt("Raymond", 3500.0, "Navy Blue", 44));
		shirts.add(new Shirt("Arrow", 2400.0, "Green", 38));
		shirts.add(new Shirt("U.S. Polo Assn.", 2800.0, "Yellow", 40));
		shirts.add(new Shirt("Tommy Hilfiger", 4500.0, "Pink", 42));
		shirts.add(new Shirt("Blackberrys", 2600.0, "Maroon", 44));
		shirts.add(new Shirt("Roadster", 1500.0, "Olive", 38));
		shirts.add(new Shirt("Wrogn", 1900.0, "Brown", 40));
		shirts.add(new Shirt("Jack & Jones", 3200.0, "Purple", 42));
		shirts.add(new Shirt("Mufti", 2100.0, "Orange", 44));
		shirts.add(new Shirt("Peter England", 1600.0, "Sky Blue", 38));
		shirts.add(new Shirt("Allen Solly", 2300.0, "Cream", 40));
		shirts.add(new Shirt("Levis", 2900.0, "Dark Green", 42));
		shirts.add(new Shirt("Arrow", 2000.0, "Light Blue", 44));
		shirts.add(new Shirt("Van Heusen", 3100.0, "Charcoal", 38));
		shirts.add(new Shirt("Raymond", 3800.0, "Beige", 40));
	}
	
	Scanner sc = new Scanner(System.in);
	
	public List<Shirt> getAllShirt(){
		
		return new ArrayList<>(shirts);
	}
	
	public void addShirt() {
		
	try {
		System.out.println("Enter Shirt Brand: ");
		String brand = sc.nextLine();
		
		System.out.println("Enter Shirt Price: ");
		double price = Double.parseDouble(sc.nextLine());
		
		System.out.println("Enter Shirt Color: ");
		String color = sc.nextLine();
		
		System.out.println("Enter Shirt Size: ");
		int size = Integer.parseInt(sc.nextLine());
		
		shirts.add(new Shirt(brand, price, color, size));
		System.out.println("SHIRT ADDED SUCCESSFULLY");
	}catch(Exception e) {
		
		System.out.println("SHIRT IS NOT ADDED SUCCESSFULLY");
		System.out.println(e.getMessage());
	}
	
		System.out.println("Enter Y/y to Add Another Shirt....");
		char choice = sc.nextLine().charAt(0);
		
			if(choice == 'Y' || choice == 'y') {
				
				addShirt();
			}
	}
	
	public void accessAllShirt() {
		
		for(Shirt s : shirts) {
			
			System.out.println(s);
		}
	}
	
	public void accessByBrand() {
		
		System.out.println("Enter The Brand: ");
		String brand = sc.nextLine();
		
		boolean found = false;
		
		for(Shirt s : shirts) {
			if(s.brand.equalsIgnoreCase(brand))
				System.out.println(s);
				found = true;
		}
		
		if(!found) {
			System.out.println("Shirt Brand Not Found....");
		}
		
		System.out.println("Press Y/y to Continue Search By Brand...");
		char choice = sc.nextLine().charAt(0);
		
			if(choice == 'Y' || choice == 'y') {
				
				accessByBrand();
			}
	}
	
	public void accessByBrandAndSize() {
		
		System.out.println("Enter The Brand: ");
		String brand = sc.nextLine();
		
		System.out.println("Enter The Size: ");
		int size = Integer.parseInt(sc.nextLine());
		
		boolean found = false;
		
		for(Shirt s : shirts) {
			
			if(s.brand.equalsIgnoreCase(brand) && s.size == size)
				System.out.println(s);
				found = true;
		}
		
		if(!found) {
			System.out.println("Shirt Not Found for Given Brand and Size!");
		}
		
		System.out.println("Press Y/y to Continue Search By Brand And Size...");
		char choice = sc.nextLine().charAt(0);
		
			if(choice == 'Y' || choice == 'y') {
				
				accessByBrandAndSize();
			}
		
	}
	
	public void accessInPriceRange() {
		
		System.out.println("Enter Shirt Minimum Price: ");
		double minPrice = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Shirt Maximum Price: ");
		double maxPrice = Integer.parseInt(sc.nextLine());
		
		boolean found = false;
		
		if(minPrice > maxPrice) {
			System.out.println("Invalid Price Range....");
		}
		
		for(Shirt s : shirts) {
			
			if(s.price >= minPrice && s.price <= maxPrice) {
				
				System.out.println(s);
				found = true;
			}
		}
		
		if(!found) {
			System.out.println("No Shirts Found in This Price Range!");
		}
		
		System.out.println("Press Y/y To Continue Search In Price Range....");
		char choice = sc.nextLine().charAt(0);
		
			if(choice == 'Y' || choice == 'y') {
				
				accessInPriceRange();
			}
	}
	
	public void accessBySizeAndPriceRange() {
		
		System.out.println("Enter Size: ");
		int size = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Minimum Price: ");
		double minPrice = Double.parseDouble(sc.nextLine());
		
		System.out.println("Enter Maximum Price: ");
		double maxPrice = Double.parseDouble(sc.nextLine());
		
		boolean found = false;
		
		if(minPrice > maxPrice) {
			
			System.out.println("Invalid Range Entered....");
		}
		
		for(Shirt s : shirts) {
			
			if(s.size == size && s.price >= minPrice && s.price <= maxPrice) {
				
				System.out.println(s);
				found = true;
			}
		}
		
		if(!found) {
			System.out.println("No Shirts Found for the Given Size and Price Range!");
		}
		
		System.out.println("Press Y/y To Continue Search In Price Range And Size....");
		char choice = sc.nextLine().charAt(0);
		
			if(choice == 'Y' || choice == 'y') {
				
				accessBySizeAndPriceRange();
			}
	}
	
	public void listAllBrand() {
		
		for(Shirt s : shirts) {
			
			System.out.println(s.brand);
		}
	}
	
	public void listAllUniqueBrand() {
		
		Set<String> brands = new LinkedHashSet<>();
		
			for(Shirt s : shirts) {
				
				brands.add(s.brand);
			}
			
			System.out.println("========== UNIQUE AVAILABLE BRANDS ==========");
			
			for(String brand : brands) {
				
				System.out.println(brand);
			}
	}
	
	public void listAllSize() {
		
		for(Shirt s : shirts) {
			
			System.out.println(s.size);
		}
	}
	
	public void listAllUniqueSize() {
		
		Set<Integer> sizes = new LinkedHashSet<>();
		
		for(Shirt s : shirts) {
			
			sizes.add(s.size);
		}
		
		System.out.println("========== UNIQUE AVAILABLE SIZES ==========");
		
		for(Integer size : sizes) {
			
			System.out.println(size);
		}
	}
	
	public void listAllColor() {
		
		for(Shirt s : shirts) {
			
			System.out.println(s.color);
		}
	}
	
	public void listAllUniqueColor() {
		
	Set<String> colors = new LinkedHashSet<>();
	
		for(Shirt s : shirts) {
			
			colors.add(s.color);
		}
		
		System.out.println("========== UNIQUE AVAILABLE COLORS ==========");
		
		for(String color : colors) {
			
			System.out.println(color);
		}
	}
	
	public void countShirtsByBrand() {
		
		System.out.println("Enter Shirt Brand: ");
		String brand = sc.nextLine();
		
		int count = 0;
		
		for(Shirt s : shirts) {
			
			if(s.brand.equalsIgnoreCase(brand)) {
				count++;
			}
		}
		
		if(count > 0) {
			
			System.out.println("Brand is: " +brand);
			System.out.println("Total Number of Shirts are : " +count);
		}else {
			
			System.out.println("No Shirt Available For Brand: " +brand);
		}
	}
	
	public void countShirtByColor() {
		
		System.out.println("Enter Shirts Color: ");
		String color = sc.nextLine();
		
		int count = 0;
		
		for(Shirt s : shirts) {
			
			if(s.color.equalsIgnoreCase(color)) {
				count++;
			}
		}
		
		if(count > 0) {
			
			System.out.println("Color is: " +color);
			System.out.println("Total Number of Shirts: " +count);
		}else {
			
			System.out.println("No Shirt Available For Color: " +color);
		}
		
	}
	
	public void countShirtBySize() {
		
		System.out.println("Enter Shirt Size: ");
		int size = Integer.parseInt(sc.nextLine());
		
		int count = 0;
		
		for(Shirt s : shirts) {
			
			if(s.size == size) {
				count++;
			}
		}
		
		if(count > 0) {
			
			System.out.println("Size is: " +size);
			System.out.println("Total Number of Shirts: " +count);
		}else {
			
			System.out.println("No Shirt Available for Size: " +size);
		}
	}
	
	
}
