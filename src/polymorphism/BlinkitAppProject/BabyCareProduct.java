package polymorphism.BlinkitAppProject;

public class BabyCareProduct extends Product{
	
	String BabyCareProductName;
	int Price;
	int Quantity;
	String Rating;
	String DeliveryTiming;
	String Age;
	
	BabyCareProduct(){
		
	}
	
	BabyCareProduct(String Productgroupname, String BabyCareProductName, int Price, int Quantity, String Rating, String DeliveryTiming, String Age){
		
		super(Productgroupname);
		this.BabyCareProductName = BabyCareProductName;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Rating = Rating;
		this.DeliveryTiming = DeliveryTiming;
		this.Age = Age;
	}
	
	public String toString() {
		return super.toString()+"BabyCareProductName is: " +BabyCareProductName+"\tPrice is: " +Price+"\tQuantity is: " +Quantity+"\tRating is: " +Rating+"\tDeliveryTiming is: " +DeliveryTiming+"\tAge is: " +Age;
	}



}
