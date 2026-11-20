package collectionFrameworkProject.Car;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class CarService {
	
	private List<Car> cars = new ArrayList<>();
	
	{
		cars.add(new Car("Tata", 750000, "White", 2018));
        cars.add(new Car("Tata", 850000, "Black", 2020));
        cars.add(new Car("Tata", 650000, "White", 2015));
        cars.add(new Car("Tata", 950000, "Red", 2022));
        cars.add(new Car("Maruti", 550000, "White", 2016));
        cars.add(new Car("Maruti", 750000, "Black", 2019));
        cars.add(new Car("Maruti", 850000, "Blue", 2021));
        cars.add(new Car("Hyundai", 900000, "White", 2017));
        cars.add(new Car("Hyundai", 1200000, "Black", 2020));
        cars.add(new Car("Hyundai", 1500000, "Red", 2023));
        cars.add(new Car("Mahindra", 1100000, "Black", 2018));
        cars.add(new Car("Mahindra", 1600000, "White", 2021));
        cars.add(new Car("Mahindra", 1900000, "Red", 2024));
        cars.add(new Car("Toyota", 1800000, "White", 2019));
        cars.add(new Car("Toyota", 2500000, "Black", 2022));
        cars.add(new Car("Toyota", 3500000, "Silver", 2024));
        cars.add(new Car("Honda", 800000, "Blue", 2015));
        cars.add(new Car("Honda", 1200000, "White", 2018));
        cars.add(new Car("Honda", 1400000, "Black", 2022));
        cars.add(new Car("Kia", 1000000, "Red", 2020));
    
	}
	
	Scanner sc = new Scanner(System.in);
	
	public List<Car> getAllCar(){
		
		return new ArrayList<>(cars);
	}
	
	public void addCar() {
		try {
				System.out.println("Enter Car Brand: ");
				String brand = sc.nextLine();
		
				System.out.println("Enter Car Price: ");
				double price = Double.parseDouble(sc.nextLine());
		
				System.out.println("Enter Car Color: ");
				String color = sc.nextLine();
		
				System.out.println("Enter Car Manufacturing Year: ");
				int manufacturingYear = Integer.parseInt(sc.nextLine());
		
				cars.add(new Car(brand, price, color, manufacturingYear));
				System.out.println("CAR ADDED SUCCESSFULLY!!!");
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
			System.out.println("CAR WAS NOT ADDED SUCCESSFULLY");
		}
	}
	
	public void accessCar() {
		
		for(Car c : cars) {
			
			System.out.println(c);
		}
	}
	
	public void accessByBrand() {
		
		System.out.println("Enter The Car Brand: ");
		String brand = sc.nextLine();
		
		boolean found = false;
		
		for(Car c : cars) {
		
			if(c.brand.equalsIgnoreCase("Tata")) {
				System.out.println(c);
				found = true;
			}
		}
		
		if(!found) {
			System.out.println("Car Brand Not Found.....");
		}
		
		System.out.println("Press Y/y to Continue Search By Brand......");
		char choice = sc.nextLine().charAt(0);
		
		if(choice == 'Y' && choice == 'y') {
			accessByBrand();
		}
	}
	
	public void accessByBrandAndPrice() {
		
		System.out.println("Enter The Car Brand: ");
		String brand = sc.nextLine();
		
		System.out.println("Enter The Car Price: ");
		double price = Double.parseDouble(sc.nextLine());
		
		boolean found = false;
		
		for(Car c : cars) {
			
			if(c.brand.equalsIgnoreCase(brand) && c.price == price) {
				
				System.out.println(c);
				found = true;
			}
		}
		
		if(!found) {
			
			System.out.println("Car Not Found For Given Brand And Price.....");
		}
		
		System.out.println("Press Y/y To Continue Search By Brand And Price.....");
		char choice = sc.nextLine().charAt(0);
		
		if(choice == 'Y' && choice == 'y') {
			
			accessByBrandAndPrice();
		}
	}
	
	public void accessBypriceRange() {
		
		System.out.println("Enter The Minimum Price....");
		double minPrice = Double.parseDouble(sc.nextLine());
		
		System.out.println("Enter The Maximum Price....");
		double maxPrice = Double.parseDouble(sc.nextLine());
		
		boolean found = false;
		
		if(minPrice > maxPrice) {
			
			System.out.println("Invalid price Range....");
		}
		
		for(Car c : cars) {
			
			if(c.price >= minPrice && c.price <= maxPrice) {
				
				System.out.println(c);
				found = true;
			}
		}
		
		if(!found) {
			
			System.out.println("No Cars Found in This Price Range!");
		}
		
		System.out.println("Press Y/y To Continue Search By Brand And Price.....");
		char choice = sc.nextLine().charAt(0);
		
		if(choice == 'Y' && choice == 'y') {
			
			accessBypriceRange();
		}
	}
	
	public void accessTataCarsByYearAndWhiteColour() {
		
		boolean found = false;
		
		for(Car c: cars) {
			
			if(c.brand.equalsIgnoreCase("Tata") && c.manufacturingYear >= 2015 && c.color.equalsIgnoreCase("While"));
			System.out.println(c);
			found = true;
		}
		
		if(!found) {
			
			System.out.println("No Matching Tata Cars Found!");
		}
		
		
	}
	
	public void accessAllBrandCar() {
		
		for(Car c : cars) {
			
			System.out.println(c.brand);
		}
	}
	
	public void accessAllBrandCarUniquly() {
		
		Set<String> brands = new LinkedHashSet<>();
		
		for(Car c : cars) {
			
			brands.add(c.brand);
		}
		
		System.out.println("========== UNIQUE CAR BRANDS ==========");
		
		for(String brand : brands) {
			
			System.out.println(brand);
		}
	}
	
	public void countCarsByBrand() {
		
		System.out.println("Enter Car Brand: ");
		String brand = sc.nextLine();
		
		int count = 0;
		
		for(Car c : cars) {
			
			if(c.brand.equalsIgnoreCase(brand))
				count++;
		}
		
		if(count > 0) {
			
			System.out.println("Brand is: " +brand);
			System.out.println("Total Car Available: " +count);
			
		}else {
			
			System.out.println("No Cars Available for Brand: " + brand);
		}
		
	}

}
