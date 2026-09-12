package immutableClass;

public class LaptopDriver {

	public static void main(String[] args) {
		
		Laptop l1 = new Laptop("Inspiron", "Dell", 75000, "4GB");
		Laptop l2 = new Laptop("XPS", "Dell", 85000, "8GB");
		Laptop l3 = new Laptop("ThinkPad", "Lenovo", 95000, "12GB");
		Laptop l4 = new Laptop("IdeaPad", "Lenovo", 105000, "24GB");
		Laptop l5 = new Laptop("Pavilion", "HP", 175000, "56GB");
		Laptop l6 = new Laptop("EliteBook", "HP", 155000, "10GB");
		Laptop l7 = new Laptop("MacBook Air", "Apple", 85000, "128GB");
		Laptop l8 = new Laptop("MacBook Pro", "Apple", 95000, "256GB");
		
		System.out.println("============Laptop l1 Details=============");
		System.out.println("ObjectReference is: " +l1);
		System.out.println("Name is: " +l1.getName());
		System.out.println("Brandname is: " +l1.getBrandname());
		System.out.println("Price is: " +l1.getPrice());
		System.out.println("Ram is: " +l1.getRam());
		
		System.out.println("====================================================");
		
		System.out.println("============Laptop l2 Details=============");
		System.out.println("ObjectReference is: " +l2);
		System.out.println("Name is: " +l2.getName());
		System.out.println("Brandname is: " +l2.getBrandname());
		System.out.println("Price is: " +l2.getPrice());
		System.out.println("Ram is: " +l2.getRam());
		
		System.out.println("======================================================");
		
		System.out.println("============Laptop l3 Details=============");
		System.out.println("ObjectReference is: " +l3);
		System.out.println("Name is: " +l3.getName());
		System.out.println("Brandname is: " +l3.getBrandname());
		System.out.println("Price is: " +l3.getPrice());
		System.out.println("Ram is: " +l3.getRam());
		
		System.out.println("=======================================================");
		
		System.out.println("============Laptop l4 Details=============");
		System.out.println("ObjectReference is: " +l4);
		System.out.println("Name is: " +l4.getName());
		System.out.println("Brandname is: " +l4.getBrandname());
		System.out.println("Price is: " +l4.getPrice());
		System.out.println("Ram is: " +l4.getRam());
		
		System.out.println("==========================================================");
		
		System.out.println("============Laptop l5 Details=============");
		System.out.println("ObjectReference is: " +l5);
		System.out.println("Name is: " +l5.getName());
		System.out.println("Brandname is: " +l5.getBrandname());
		System.out.println("Price is: " +l5.getPrice());
		System.out.println("Ram is: " +l5.getRam());
		
		System.out.println("==========================================================");
		
		System.out.println("============Laptop l6 Details=============");
		System.out.println("ObjectReference is: " +l6);
		System.out.println("Name is: " +l6.getName());
		System.out.println("Brandname is: " +l6.getBrandname());
		System.out.println("Price is: " +l6.getPrice());
		System.out.println("Ram is: " +l6.getRam());
		
		System.out.println("=========================================================");
		
		System.out.println("============Laptop l7 Details=============");
		System.out.println("ObjectReference is: " +l7);
		System.out.println("Name is: " +l7.getName());
		System.out.println("Brandname is: " +l7.getBrandname());
		System.out.println("Price is: " +l7.getPrice());
		System.out.println("Ram is: " +l7.getRam());
		
		System.out.println("==============================================================");
		
		System.out.println("============Laptop l8 Details=============");
		System.out.println("ObjectReference is: " +l8);
		System.out.println("Name is: " +l8.getName());
		System.out.println("Brandname is: " +l8.getBrandname());
		System.out.println("Price is: " +l8.getPrice());
		System.out.println("Ram is: " +l8.getRam());

	}

}
