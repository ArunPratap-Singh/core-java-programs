package polymorphism.BlinkitAppProject;

public class Electronics extends Product{
	
	String ElectronicsProductName;
	int Price;
	int Quantity;
	String Rating;
	String DeliveryTiming;
	
	Electronics(){
		
	}
	
	Electronics(String Productgroupname, String ElectronicsProductName, int Price, int Quantity, String Rating, String DeliveryTiming){
		
		super(Productgroupname);
		this.ElectronicsProductName = ElectronicsProductName;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Rating = Rating;
		this.DeliveryTiming = DeliveryTiming;
	}
	
	public String toString() {
		return super.toString()+"ElectronicsProductName is: " +ElectronicsProductName+"\tPrice is: " +Price+"\tQuantity is: " +Quantity+"\tRating is: " +Rating+"\tDeliveryTiming is: " +DeliveryTiming;
	}

}
