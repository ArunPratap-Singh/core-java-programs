package inheritance;

public class Mango extends Fruit {
	
	String quantity;
	
	Mango(){
		
	}
	
	Mango(String name, int price, String color, String quantity){
		super.name = name;
		super.price = price;
		super.color = color;
		this.quantity = quantity;
	}
	
	public String toString() {
		return super.toString()+"\tQuantity is: " +quantity;
	}

}
