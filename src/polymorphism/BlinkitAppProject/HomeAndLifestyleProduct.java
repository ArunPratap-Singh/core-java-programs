package polymorphism.BlinkitAppProject;

public class HomeAndLifestyleProduct extends Product{
	
	String HomeorLifestyleProduct;
	String HomeorLifestyleProductName;
	int Price;
	int Quantity;
	String Rating;
	String DeliveryTiming;
	
	HomeAndLifestyleProduct(){
		
	}
	
	HomeAndLifestyleProduct(String Productgroupname, String HomeorLifestyleProduct, String HomeorLifestyleProductName, int Price, int Quantity, String Rating, String DeliveryTiming){
		
		super(Productgroupname);
		this.HomeorLifestyleProduct = HomeorLifestyleProduct;
		this.HomeorLifestyleProductName = HomeorLifestyleProductName;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Rating = Rating;
		this.DeliveryTiming = DeliveryTiming;
	}
	
	public String toString() {
		return super.toString()+"HomeorLifestyleProduct is: " +HomeorLifestyleProduct+"\tHomeorLifestyleProductName is: " +HomeorLifestyleProductName+"\tPrice is: " +Price+"\tQuantity is: " +Quantity+"\tRating is: " +Rating+"\tDeliveryTiming is: " +DeliveryTiming;
	}


}
