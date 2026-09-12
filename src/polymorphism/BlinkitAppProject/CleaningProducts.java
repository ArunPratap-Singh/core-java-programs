package polymorphism.BlinkitAppProject;

public class CleaningProducts extends Product{
	
	String CleaningProductsName;
	int Price;
	String Quantity;
	String Rating;
	String DeliveryTiming;
	
	CleaningProducts(){
		
	}
	
	CleaningProducts(String Productgroupname, String CleaningProductsName, int Price, String Quantity, String Rating, String DeliveryTiming){
		
		super(Productgroupname);
		this.CleaningProductsName = CleaningProductsName;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Rating = Rating;
		this.DeliveryTiming = DeliveryTiming;
	}
	
	public String toString() {
		return super.toString()+"CleaningProductsName is: " +CleaningProductsName+"\tPrice is: " +Price+"\tQuantity is: " +Quantity+"\tRating is: " +Rating+"\tDeliveryTiming is: " +DeliveryTiming;
	}

}
