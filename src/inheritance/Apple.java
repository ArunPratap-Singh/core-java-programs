package inheritance;

public class Apple extends Fruit2 {
	
	int quantity;
	
	Apple(){
		
	}
	
	Apple(String name, int price, String color, int quantity){
		super(name, price, color);
		this.quantity = quantity;
	}
	
	public String toString() {
		return super.toString()+"\tQuantity is: " +quantity;
	}

}
