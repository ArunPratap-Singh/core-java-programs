package contructor;

public class Product {
	
	String productname;
	int price;
	int quantity;
	
	Product(){
		
	}
	
	Product(String productname, int price, int quantity){
		
		this.productname = productname;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String toString() {
		
		return "ProductName is: " +productname+"\nPrice is: " +price+"\nQuantity is: " +quantity+"\n==========================="; 
	}


}
