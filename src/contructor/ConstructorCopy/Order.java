package contructor.ConstructorCopy;

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
	
	Order(Order o){
		
		this.orderid = o.orderid;
		this.price = o.price;
		this.deliverydate = o.deliverydate;
		this.itemname = o.itemname;
	}
	
	//Getters or Accessors
	public String toString(){

		return "Orderid is: " +orderid+"\nItemName is: " +itemname+"\nPrice is: " +price+"\nDeliverydate is: " +deliverydate+"\n=============================";
	}

}
