package polymorphism.BlinkitAppProject;

public class VegetablesAndFruits extends Product{
	
	String VegetablesOrFruits;
	String VegetablesOrFruitsName;
	int Price;
	String Quantity;
	String DeliveryTiming;
	
	VegetablesAndFruits(){
		
	}
	
	VegetablesAndFruits(String Productgroupname, String VegetablesOrFruits, String VegetablesOrFruitsName, int Price, String Quantity, String DeliveryTiming){
		
		super(Productgroupname);
		this.VegetablesOrFruits = VegetablesOrFruits;
		this.VegetablesOrFruitsName = VegetablesOrFruitsName;
		this.Price = Price;
		this.Quantity = Quantity;
		this.DeliveryTiming = DeliveryTiming;
	}
	
	public String toString() {
		return super.toString()+"VegetablesOrFruits is: " +VegetablesOrFruits+"\tVegetablesOrFruitsName is: " +VegetablesOrFruitsName+"\tPrice is: " +Price+"\tQuantity is: " +Quantity+"\tDeliveryTiming is: " +DeliveryTiming;
	}
}
