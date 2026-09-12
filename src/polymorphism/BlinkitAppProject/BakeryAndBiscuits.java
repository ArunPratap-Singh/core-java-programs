package polymorphism.BlinkitAppProject;

public class BakeryAndBiscuits extends Product{
	
	String BakeryorBiscuits;
	String BakeryorBiscuitsName;
	int Price;
	String Quantity;
	String Rating;
	String DeliveryTiming;
	
	BakeryAndBiscuits(){
		
	}
	
	BakeryAndBiscuits(String Productgroupname, String BakeryorBiscuits, String BakeryorBiscuitsName, int Price, String Quantity, String Rating, String DeliveryTiming){
		
		super(Productgroupname);
		this.BakeryorBiscuits = BakeryorBiscuits;
		this.BakeryorBiscuitsName = BakeryorBiscuitsName;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Rating = Rating;
		this.DeliveryTiming = DeliveryTiming;
	}
	
	public String toString() {
		
		return super.toString()+"BakeryorBiscuits is: " +BakeryorBiscuits+"\tBakeryorBiscuitsName is: " +BakeryorBiscuitsName+"\tPrice is: " +Price+"\tQuantity is: " +Quantity+"\tRating is: " +Rating+"\tDeliveryTiming is: " +DeliveryTiming;
	}

}
