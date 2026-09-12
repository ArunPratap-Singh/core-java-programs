package bean;

public class ProductDriver {

	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();
		Product p5 = new Product();
		Product p6 = new Product();
		
		p1.setName("Shirt");	p1.setPrice(1500);	p1.setBrand("Zara");	p1.setQuantity(3);
		p1.setName("Jeans");	p1.setPrice(1500);	p1.setBrand("Levis");	p1.setQuantity(1);
		p1.setName("Maza");	p1.setPrice(80);	p1.setBrand("Parle");	p1.setQuantity(2);
		p1.setName("Bread");	p1.setPrice(110);	p1.setBrand("Britannia");	p1.setQuantity(2);
		p1.setName("Laptop");	p1.setPrice(35000);	p1.setBrand("Lenovo");	p1.setQuantity(1);
		p1.setName("Shoes");	p1.setPrice(2500);	p1.setBrand("Campus");	p1.setQuantity(1);
		
		System.out.println("=========================================================");
		
		System.out.println("==========Product Details 1===========");
		System.out.println("Object reference is: " +p1);
		System.out.println("Name is: " +p1.getName());
		System.out.println("Price is: " +p1.getPrice());
		System.out.println("Brand is: " +p1.getBrand());
		System.out.println("Quantity is: " +p1.getQuantity());
		System.out.println("==================================");
		System.out.println("==========Product Details 2===========");
		System.out.println("Object reference is: " +p2);
		System.out.println("Name is: " +p2.getName());
		System.out.println("Price is: " +p2.getPrice());
		System.out.println("Brand is: " +p2.getBrand());
		System.out.println("Quantity is: " +p2.getQuantity());
		System.out.println("==================================");
		System.out.println("==========Product Details 3===========");
		System.out.println("Object reference is: " +p3);
		System.out.println("Name is: " +p3.getName());
		System.out.println("Price is: " +p3.getPrice());
		System.out.println("Brand is: " +p3.getBrand());
		System.out.println("Quantity is: " +p3.getQuantity());
		System.out.println("==================================");
		System.out.println("==========Product Details 4===========");
		System.out.println("Object reference is: " +p4);
		System.out.println("Name is: " +p4.getName());
		System.out.println("Price is: " +p4.getPrice());
		System.out.println("Brand is: " +p4.getBrand());
		System.out.println("Quantity is: " +p4.getQuantity());
		System.out.println("==================================");
		System.out.println("==========Product Details 5===========");
		System.out.println("Object reference is: " +p5);
		System.out.println("Name is: " +p5.getName());
		System.out.println("Price is: " +p5.getPrice());
		System.out.println("Brand is: " +p5.getBrand());
		System.out.println("Quantity is: " +p5.getQuantity());
		System.out.println("==================================");
		System.out.println("==========Product Details 6===========");
		System.out.println("Object reference is: " +p6);
		System.out.println("Name is: " +p6.getName());
		System.out.println("Price is: " +p6.getPrice());
		System.out.println("Brand is: " +p6.getBrand());
		System.out.println("Quantity is: " +p6.getQuantity());
		System.out.println("==================================");
	}

}
