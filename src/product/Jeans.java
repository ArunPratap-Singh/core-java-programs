package product;

public class Jeans extends ProductJ {
	
	String color;
	String fabric;
	String size;
	
	Jeans(){
		
	}
	
	Jeans(String brandname, int price, double quantity, int productid, String color, String fabric, String size){
		
		super.brandname = brandname;
		super.price = price;
		super.quantity = quantity;
		super.productid = productid;
		this.color = color;
		this.fabric = fabric;
		this.size = size;
		
	}
	
	public String toString() {
		return super.toString()+"\tColor is: " +color+"\tFabric is: " +fabric+"\tSize is: " +size;
	}


}
