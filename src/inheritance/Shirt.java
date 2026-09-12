package inheritance;

public class Shirt extends Product{
	
	String color;
	String fabric;
	String type;
	String size;
	
	Shirt(){
		
	}
	
	Shirt(String brandname, int price, double quantity, int productid, String color, String fabric, String type, String size){
		
		super.brandname = brandname;
		super.price = price;
		super.quantity = quantity;
		super.productid = productid;
		this.color = color;
		this.fabric = fabric;
		this.type = type;
		this.size = size;
		
	}
	
	public String toString() {
		return super.toString()+"\tColor is: " +color+"\tFabric is: " +fabric+"\tType is: " +type+"\tSize is: " +size;
	}

}
