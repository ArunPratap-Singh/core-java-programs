package contructor.ConstructorCopy;

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
	
	Product(Product p){
		
		this.productname = p.productname;
		this.price = p.price;
		this.quantity = p.quantity;
	}
	
	public String toString() {
		
		return "ProductName is: " +productname+"\nPrice is: " +price+"\nQuantity is: " +quantity+"\n==========================="; 
	}


}
