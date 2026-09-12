package fruit;

public class Orange extends Fruit1 {
	
	int quantity;

	
	Orange(){
		
	}
	
	Orange(String name, int price, String color, int quantity){
		super(name, price, color);
		this.quantity = quantity;
	}
	
	public String toString() {
		return super.toString()+"\tQuantity is: " +quantity;
	}
}
