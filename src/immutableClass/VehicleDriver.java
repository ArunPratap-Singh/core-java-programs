package immutableClass;

public class VehicleDriver {

	public static void main(String[] args) {
		
		Vehicle v1 = new Vehicle("Swift", "Maruti Suzuki", 750000, 4, "White");
		Vehicle v2 = new Vehicle("Baleno", "Maruti Suzuki", 850000, 4, "Black");
		Vehicle v3 = new Vehicle("Creta", "Hyundai", 950000, 4, "Red");
		Vehicle v4 = new Vehicle("Venue", "Hyundai", 750000, 4, "Grey");
		Vehicle v5 = new Vehicle("Nexon", "Tata Motors", 8500000, 4, "Dark Grey");
		Vehicle v6 = new Vehicle("Punch", "Tata Motors", 9500000, 4, "Brown");
		
		System.out.println("==========Vehicle v1 Details===========");
		System.out.println("ObjectReference is: " +v1);
		System.out.println("Name is: " +v1.getName());
		System.out.println("Brandname is: " +v1.getBrandName());
		System.out.println("Price is: " +v1.getPrice());
		System.out.println("NumberOfWheels is: " +v1.getNumberOfWheels());
		System.out.println("Color is: " +v1.getColor());
		
		System.out.println("=================================================");
		
		System.out.println("==========Vehicle v2 Details===========");
		System.out.println("ObjectReference is: " +v2);
		System.out.println("Name is: " +v2.getName());
		System.out.println("Brandname is: " +v2.getBrandName());
		System.out.println("Price is: " +v2.getPrice());
		System.out.println("NumberOfWheels is: " +v2.getNumberOfWheels());
		System.out.println("Color is: " +v2.getColor());
		
		System.out.println("==============================================");
		
		System.out.println("==========Vehicle v3 Details===========");
		System.out.println("ObjectReference is: " +v3);
		System.out.println("Name is: " +v3.getName());
		System.out.println("Brandname is: " +v3.getBrandName());
		System.out.println("Price is: " +v3.getPrice());
		System.out.println("NumberOfWheels is: " +v3.getNumberOfWheels());
		System.out.println("Color is: " +v3.getColor());
		
		System.out.println("==================================================");
		
		System.out.println("==========Vehicle v4 Details===========");
		System.out.println("ObjectReference is: " +v4);
		System.out.println("Name is: " +v4.getName());
		System.out.println("Brandname is: " +v4.getBrandName());
		System.out.println("Price is: " +v4.getPrice());
		System.out.println("NumberOfWheels is: " +v4.getNumberOfWheels());
		System.out.println("Color is: " +v4.getColor());
		
		System.out.println("=====================================================");
		
		System.out.println("==========Vehicle v5 Details===========");
		System.out.println("ObjectReference is: " +v5);
		System.out.println("Name is: " +v5.getName());
		System.out.println("Brandname is: " +v5.getBrandName());
		System.out.println("Price is: " +v5.getPrice());
		System.out.println("NumberOfWheels is: " +v5.getNumberOfWheels());
		System.out.println("Color is: " +v5.getColor());
		
		System.out.println("======================================================");
		
		System.out.println("==========Vehicle v6 Details===========");
		System.out.println("ObjectReference is: " +v6);
		System.out.println("Name is: " +v6.getName());
		System.out.println("Brandname is: " +v6.getBrandName());
		System.out.println("Price is: " +v6.getPrice());
		System.out.println("NumberOfWheels is: " +v6.getNumberOfWheels());
		System.out.println("Color is: " +v6.getColor());
		
	}
}
