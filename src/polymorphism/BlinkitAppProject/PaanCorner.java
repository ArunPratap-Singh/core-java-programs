package polymorphism.BlinkitAppProject;

public class PaanCorner extends Product{
	
	String ProductName;
	int Price;
	String Quantity;
	String Rating;
	String DeliveryTiming;
	
	PaanCorner(){
		
	}
	
	PaanCorner(String Productgroupname, String ProductName, int Price, String Quantity, String Rating, String DeliveryTiming){
		
		super(Productgroupname);
		this.ProductName = ProductName;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Rating = Rating;
		this.DeliveryTiming = DeliveryTiming;
		
	}
	
	public String toString() {
		return super.toString()+"\tProductName is: " +ProductName+"\tPrice is: " +Price+"\tQuantity is: " +Quantity+"\tRating is: " +Rating+"\tDeliveryTiming is: " +DeliveryTiming;
	}

}
