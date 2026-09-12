package immutableClass;

public class OrderDriver {

	public static void main(String[] args) {
		Order o1 = new Order(123, "Laptop", 4, "Noida");
		Order o2 = new Order(124, "Jeans", 1, "GreaterNoida");
		Order o3 = new Order(125, "Shirt", 2, "Lucknow");
		Order o4 = new Order(126, "Fridge", 6, "Meerut");
		Order o5 = new Order(127, "TV", 8, "Gaziabad");
		
		System.out.println("=========Order o1 Details============");
		System.out.println("ObjectReference is: " +o1);
		System.out.println("ID is: " +o1.getOrderId());
		System.out.println("Name is: " +o1.getName());
		System.out.println("Quantity is: " +o1.getQuantity());
		System.out.println("Address is: " +o1.getAddress());
		
		System.out.println("=========Order o2 Details============");
		System.out.println("ObjectReference is: " +o2);
		System.out.println("ID is: " +o2.getOrderId());
		System.out.println("Name is: " +o2.getName());
		System.out.println("Quantity is: " +o2.getQuantity());
		System.out.println("Address is: " +o2.getAddress());
		
		System.out.println("=========Order o3 Details============");
		System.out.println("ObjectReference is: " +o3);
		System.out.println("ID is: " +o3.getOrderId());
		System.out.println("Name is: " +o3.getName());
		System.out.println("Quantity is: " +o3.getQuantity());
		System.out.println("Address is: " +o3.getAddress());
		
		System.out.println("=========Order o4 Details============");
		System.out.println("ObjectReference is: " +o4);
		System.out.println("ID is: " +o4.getOrderId());
		System.out.println("Name is: " +o4.getName());
		System.out.println("Quantity is: " +o4.getQuantity());
		System.out.println("Address is: " +o4.getAddress());
		
		System.out.println("=========Order o5 Details============");
		System.out.println("ObjectReference is: " +o5);
		System.out.println("ID is: " +o5.getOrderId());
		System.out.println("Name is: " +o5.getName());
		System.out.println("Quantity is: " +o5.getQuantity());
		System.out.println("Address is: " +o5.getAddress());
	}
}
