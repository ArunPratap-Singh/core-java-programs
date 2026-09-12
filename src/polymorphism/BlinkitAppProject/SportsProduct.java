package polymorphism.BlinkitAppProject;

public class SportsProduct extends Product{
	
	String SportsProductName;
	int Price;
	int Quantity;
	String Rating;
	String DeliveryTiming;
	
	SportsProduct(){
		
	}
	
	SportsProduct(String Productgroupname, String SportsProductName, int Price, int Quantity, String Rating, String DeliveryTiming){
		
		super(Productgroupname);
		this.SportsProductName = SportsProductName;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Rating = Rating;
		this.DeliveryTiming = DeliveryTiming;
	}
	
	public String toString() {
		return super.toString()+"SportsProductName is: " +SportsProductName+"\tPrice is: " +Price+"\tQuantity is: " +Quantity+"\tRating is: " +Rating+"\tDeliveryTiming is: " +DeliveryTiming;
	}

}
