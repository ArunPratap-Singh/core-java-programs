package pojo;

public class ProductPojoDriver {

	public static void main(String[] args) {
		
		ProductPojo p1 = new ProductPojo("Shirt", 2500, "Zara", 5);
		ProductPojo p2 = new ProductPojo("Jeans", 1500, "Levis", 1);
		ProductPojo p3 = new ProductPojo("Maza", 50, "Parle", 1);
		ProductPojo p4 = new ProductPojo("Laptop", 55000, "Motorolo", 1);
		ProductPojo p5 = new ProductPojo("Desktop", 56000, "Acer", 1);
		
		System.out.println("===========================================");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
	}

}
