package contructor;

public class Order {
	
	long orderid;
	String itemname;
	int price;
	String deliverydate;

	Order(){
		
	}
	
	//Setters or Mutators
	Order(long orderid, String itemname, int price, String deliverydate){
		
		this.orderid = orderid;
		this.itemname = itemname;
		this.price = price;
		this.deliverydate = deliverydate;
	}
	
	//Getters or Accessors
	public String toString(){

		return "Orderid is: " +orderid+"\nItemName is: " +itemname+"\nPrice is: " +price+"\nDeliverydate is: " +deliverydate+"\n=============================";
	}

}
