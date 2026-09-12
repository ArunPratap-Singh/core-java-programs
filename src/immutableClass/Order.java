package immutableClass;

public final class Order {
	
	private final int orderid;
	private final String name;
	private final int quantity;
	private final String address;
	
	Order(int orderid, String name, int quantity, String address){
		this.orderid = orderid;
		this.name = name;
		this.quantity = quantity;
		this.address = address;
	}
	
	public int getOrderId() {
		return orderid;
	}
	
	public String getName() {
		return name;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public String getAddress() {
		return address;
	}

}
