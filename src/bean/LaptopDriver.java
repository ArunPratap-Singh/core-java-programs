package bean;

public class LaptopDriver {

	public static void main(String[] args) {
		
		Laptop l1 = new Laptop();
		Laptop l2 = new Laptop();
		Laptop l3 = new Laptop();
		Laptop l4 = new Laptop();
		Laptop l5 = new Laptop();
		Laptop l6 = new Laptop();
		
		l1.setBrandname("Lenovo");	l1.setPrice(50000);	l1.setRam("4GB");	l1.setColor("White");
		l2.setBrandname("Motorola");	l2.setPrice(30000);	l2.setRam("5GB");	l2.setColor("Grey");
		l3.setBrandname("Dell");	l3.setPrice(60000);	l3.setRam("15GB");	l3.setColor("Dark Grey");
		l4.setBrandname("Asus");	l4.setPrice(70000);	l4.setRam("8GB");	l4.setColor("Blue");
		l5.setBrandname("MAC 15");	l5.setPrice(450000);	l5.setRam("12GB");	l5.setColor("Silver");
		l6.setBrandname("HP");	l6.setPrice(40000);	l6.setRam("6GB");	l6.setColor("Silver Grey");
		
		System.out.println("===============================================================");
		
		System.out.println("===========Laptop Details 1============");
		System.out.println("Obeject reference is: " +l1);
		System.out.println("Brandname is: " +l1.getBrandname());
		System.out.println("Price is: " +l1.getPrice());
		System.out.println("Ram is: " +l1.getRam());
		System.out.println("Color is: " +l1.getColor());
		System.out.println("===================================");
		System.out.println("===========Laptop Details 2============");
		System.out.println("Obeject reference is: " +l2);
		System.out.println("Brandname is: " +l2.getBrandname());
		System.out.println("Price is: " +l2.getPrice());
		System.out.println("Ram is: " +l2.getRam());
		System.out.println("Color is: " +l2.getColor());
		System.out.println("===================================");
		System.out.println("===========Laptop Details 3============");
		System.out.println("Obeject reference is: " +l3);
		System.out.println("Brandname is: " +l3.getBrandname());
		System.out.println("Price is: " +l3.getPrice());
		System.out.println("Ram is: " +l3.getRam());
		System.out.println("Color is: " +l3.getColor());
		System.out.println("===================================");
		System.out.println("===========Laptop Details 4============");
		System.out.println("Obeject reference is: " +l4);
		System.out.println("Brandname is: " +l4.getBrandname());
		System.out.println("Price is: " +l4.getPrice());
		System.out.println("Ram is: " +l4.getRam());
		System.out.println("Color is: " +l4.getColor());
		System.out.println("===================================");
		System.out.println("===========Laptop Details 5============");
		System.out.println("Obeject reference is: " +l5);
		System.out.println("Brandname is: " +l5.getBrandname());
		System.out.println("Price is: " +l5.getPrice());
		System.out.println("Ram is: " +l5.getRam());
		System.out.println("Color is: " +l5.getColor());
		System.out.println("===================================");
		System.out.println("===========Laptop Details 6============");
		System.out.println("Obeject reference is: " +l6);
		System.out.println("Brandname is: " +l6.getBrandname());
		System.out.println("Price is: " +l6.getPrice());
		System.out.println("Ram is: " +l6.getRam());
		System.out.println("Color is: " +l6.getColor());
		System.out.println("===================================");
		
		

	}

}
