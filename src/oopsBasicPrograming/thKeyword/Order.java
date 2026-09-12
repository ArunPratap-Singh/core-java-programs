package oopsBasicPrograming.thKeyword;

public class Order {
	
	String orderid;
	int numberofproducts;
	String address;
	String deliverydate;
	
	public void setDetails(String orderid, int numberofproducts, String address, String deliverydate) {
		
		this.orderid = orderid;
		this.numberofproducts = numberofproducts;
		this.address = address;
		this.deliverydate = deliverydate;
	}
	
	public void printDetails() {
		System.out.println("Orderid is: " +orderid);
		System.out.println("Number Of Products is: " +numberofproducts);
		System.out.println("Address is: " +address);
		System.out.println("Delivery Date is: " +deliverydate);
	}

}
