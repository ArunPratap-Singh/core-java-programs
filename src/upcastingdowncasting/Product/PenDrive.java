package upcastingdowncasting.Product;

public class PenDrive extends Product{
	
	String storage;
	
	PenDrive(){
		
	}
	
	PenDrive(String name, int price, int quantity, String storage){
		super(name, price, quantity);
		this.storage = storage;
	}

}
