package polymorphism.BlinkitAppProject;

public class HairProducts extends Product{
	
	String HairProductName;
	int Price;
	int Quantity;
	String Rating;
	String DeliveryTiming;
	
	HairProducts(){
		
	}
	
	HairProducts(String Productgroupname, String HairProductName, int Price, int Quantity, String Rating, String DeliveryTiming){
		
		super(Productgroupname);
		this.HairProductName = HairProductName;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Rating = Rating;
		this.DeliveryTiming = DeliveryTiming;
	}
	
	public String toString() {
		return super.toString()+"HairProductName is: " +HairProductName+"\tPrice is: " +Price+"\tQuantity is: " +Quantity+"\tRating is: " +Rating+"\tDeliveryTiming is: " +DeliveryTiming;
	}

}
