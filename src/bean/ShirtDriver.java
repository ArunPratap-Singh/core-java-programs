package bean;

public class ShirtDriver {

	public static void main(String[] args) {
		Shirt s1 = new Shirt();
		Shirt s2 = new Shirt();
		Shirt s3 = new Shirt();
		Shirt s4 = new Shirt();
		Shirt s5 = new Shirt();
		Shirt s6 = new Shirt();
		
		s1.setBrandname("Levis");	s1.setPrice(700);	s1.setFabric("Cotton");	s1.setColor("Red");	s1.setSize("42CM"); 
		s2.setBrandname("Zara");	s2.setPrice(1000);	s2.setFabric("Cotton");	s2.setColor("White");	s2.setSize("38CM");
		s3.setBrandname("LiveSmart");	s3.setPrice(800);	s3.setFabric("Cotton");	s3.setColor("Blue");	s3.setSize("46CM");
		s4.setBrandname("Puma");	s1.setPrice(600);	s1.setFabric("Cotton");	s1.setColor("Orange");	s1.setSize("40CM");
		s1.setBrandname("US Polo");	s1.setPrice(1500);	s1.setFabric("Cotton");	s1.setColor("Yellow");	s1.setSize("42CM");
		s1.setBrandname("Jack and Jones");	s1.setPrice(700);	s1.setFabric("Cotton");	s1.setColor("Green");	s1.setSize("40CM");
		
		System.out.println("=========================================================");
		
		System.out.println("============Shirt Details1================");
		System.out.println("Object reference is: " +s1);
		System.out.println("Brandname is: " +s1.getBrandname());
		System.out.println("Price is: " +s1.getPrice());
		System.out.println("Fabric is: " +s1.getFabric());
		System.out.println("Color is: " +s1.getColor());
		System.out.println("Size is: " +s1.getSize());
		System.out.println("=============================================");
		System.out.println("============Shirt Details2================");
		System.out.println("Object reference is: " +s2);
		System.out.println("Brandname is: " +s2.getBrandname());
		System.out.println("Price is: " +s2.getPrice());
		System.out.println("Fabric is: " +s2.getFabric());
		System.out.println("Color is: " +s2.getColor());
		System.out.println("Size is: " +s2.getSize());
		System.out.println("=============================================");
		System.out.println("============Shirt Details3================");
		System.out.println("Object reference is: " +s3);
		System.out.println("Brandname is: " +s3.getBrandname());
		System.out.println("Price is: " +s3.getPrice());
		System.out.println("Fabric is: " +s3.getFabric());
		System.out.println("Color is: " +s3.getColor());
		System.out.println("Size is: " +s3.getSize());
		System.out.println("=============================================");
		System.out.println("============Shirt Details4================");
		System.out.println("Object reference is: " +s4);
		System.out.println("Brandname is: " +s4.getBrandname());
		System.out.println("Price is: " +s4.getPrice());
		System.out.println("Fabric is: " +s4.getFabric());
		System.out.println("Color is: " +s4.getColor());
		System.out.println("Size is: " +s4.getSize());
		System.out.println("=============================================");
		System.out.println("============Shirt Details5================");
		System.out.println("Object reference is: " +s5);
		System.out.println("Brandname is: " +s5.getBrandname());
		System.out.println("Price is: " +s5.getPrice());
		System.out.println("Fabric is: " +s5.getFabric());
		System.out.println("Color is: " +s5.getColor());
		System.out.println("Size is: " +s5.getSize());
		System.out.println("=============================================");
		System.out.println("============Shirt Details6================");
		System.out.println("Object reference is: " +s6);
		System.out.println("Brandname is: " +s6.getBrandname());
		System.out.println("Price is: " +s6.getPrice());
		System.out.println("Fabric is: " +s6.getFabric());
		System.out.println("Color is: " +s6.getColor());
		System.out.println("Size is: " +s6.getSize());
		System.out.println("=============================================");
		
		
	}

}
