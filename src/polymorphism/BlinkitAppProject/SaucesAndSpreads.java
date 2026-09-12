package polymorphism.BlinkitAppProject;

public class SaucesAndSpreads extends Product{
	
	String SaucesorSpreads;
	String SaucesorSpreadsName;
	int Price;
	String Quantity;
	String Rating;
	String DeliveryTiming;
	
	SaucesAndSpreads(){
		
	}
	
	SaucesAndSpreads(String Productgroupname, String SaucesorSpreads, String SaucesorSpreadsName, int Price, String Quantity, String Rating, String DeliveryTiming){
		
		super(Productgroupname);
		this.SaucesorSpreads = SaucesorSpreads;
		this.SaucesorSpreadsName = SaucesorSpreadsName;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Rating = Rating;
		this.DeliveryTiming = DeliveryTiming;
		
	}
	
	public String toString() {
		return super.toString()+"SaucesorSpreads is: " +SaucesorSpreads+"\tSaucesorSpreadsName is: " +SaucesorSpreadsName+"\tPrice is: " +Price+"\tQuantity is: " +Quantity+"\tRating is: " +Rating+"\tDeliveryTiming is: " +DeliveryTiming;
	}

}
