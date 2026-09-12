package immutableClass;

public class ShirtDriver {

	public static void main(String[] args) {
		
		Shirt s1 = new Shirt("Peter England", "Cotton", 750, 4);
		Shirt s2 = new Shirt("Louis Philippe", "Linen", 1750, 2);
		Shirt s3 = new Shirt("Van Heusen", "Cotton-linen", 2750, 3);
		Shirt s4 = new Shirt("Arrow", "Cotton", 1950, 5);
		Shirt s5 = new Shirt("Allen Solly", "Cotton", 1850, 6);
		Shirt s6 = new Shirt("Raymond", "Cotton", 2000, 4);
		Shirt s7 = new Shirt("Levis", "Cotton", 4550, 8);
		
		System.out.println("===========Shirt s1 Details==============");
		System.out.println("ObjectReference is: " +s1);
		System.out.println("Brandname is: " +s1.getBrandname());
		System.out.println("Fabric is: " +s1.getFabric());
		System.out.println("Price is: " +s1.getPrice());
		System.out.println("Quantity is: " +s1.getQuantity());
		
		System.out.println("=========================================================");
		
		System.out.println("===========Shirt s2 Details==============");
		System.out.println("ObjectReference is: " +s2);
		System.out.println("Brandname is: " +s2.getBrandname());
		System.out.println("Fabric is: " +s2.getFabric());
		System.out.println("Price is: " +s2.getPrice());
		System.out.println("Quantity is: " +s2.getQuantity());
		
		System.out.println("=========================================================");
		
		System.out.println("===========Shirt s3 Details==============");
		System.out.println("ObjectReference is: " +s3);
		System.out.println("Brandname is: " +s3.getBrandname());
		System.out.println("Fabric is: " +s3.getFabric());
		System.out.println("Price is: " +s3.getPrice());
		System.out.println("Quantity is: " +s3.getQuantity());
		
		System.out.println("=========================================================");
		
		System.out.println("===========Shirt s4 Details==============");
		System.out.println("ObjectReference is: " +s4);
		System.out.println("Brandname is: " +s4.getBrandname());
		System.out.println("Fabric is: " +s4.getFabric());
		System.out.println("Price is: " +s4.getPrice());
		System.out.println("Quantity is: " +s4.getQuantity());
		
		System.out.println("=========================================================");
		
		System.out.println("===========Shirt s5 Details==============");
		System.out.println("ObjectReference is: " +s5);
		System.out.println("Brandname is: " +s5.getBrandname());
		System.out.println("Fabric is: " +s5.getFabric());
		System.out.println("Price is: " +s5.getPrice());
		System.out.println("Quantity is: " +s5.getQuantity());
		
		System.out.println("=========================================================");
		
		System.out.println("===========Shirt s6 Details==============");
		System.out.println("ObjectReference is: " +s6);
		System.out.println("Brandname is: " +s6.getBrandname());
		System.out.println("Fabric is: " +s6.getFabric());
		System.out.println("Price is: " +s6.getPrice());
		System.out.println("Quantity is: " +s6.getQuantity());
		
		System.out.println("=========================================================");
		
		System.out.println("===========Shirt s7 Details==============");
		System.out.println("ObjectReference is: " +s7);
		System.out.println("Brandname is: " +s7.getBrandname());
		System.out.println("Fabric is: " +s7.getFabric());
		System.out.println("Price is: " +s7.getPrice());
		System.out.println("Quantity is: " +s7.getQuantity());
		
		

	}

}
