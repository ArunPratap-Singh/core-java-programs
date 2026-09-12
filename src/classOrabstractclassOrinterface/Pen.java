package classOrabstractclassOrinterface;

public abstract class Pen {
	
	String brand;
	int price;
	String inkColor;
	double tipsize;
	String type;
	
	Pen(){
		
	}
	
	Pen(String brand, int price, String inkColor, double tipsize, String type){
		
		this.brand = brand;
		this.price = price;
		this.inkColor = inkColor;
		this.tipsize = tipsize;
		this.type = type;
	}
	
	public abstract void write();
	
	public String toString() {
		return "Brand is: " +brand+"\tPrice is: " +price+"\tInkColor is: " +inkColor+"\tTipsize is: " +tipsize+"\tType is: " +type;
	}
}
