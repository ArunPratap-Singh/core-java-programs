package polymorphism.BlinkitAppProject;

public class SpritualProducts extends Product{
	
	String SpritualProductsName;
	int Price;
	int Quantity;
	String Rating;
	String DeliveryTiming;
	
	SpritualProducts(){
		
	}
	
	SpritualProducts(String Productgroupname, String SpritualProductsName, int Price, int Quantity, String Rating, String DeliveryTiming){
		
		super(Productgroupname);
		this.SpritualProductsName = SpritualProductsName;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Rating = Rating;
		this.DeliveryTiming = DeliveryTiming;
	}
	
	public String toString() {
		return super.toString()+"SpritualProductsName is: " +SpritualProductsName+"\tPrice is: " +Price+"\tQuantity is: " +Quantity+"\tRating is: " +Rating+"\tDeliveryTiming is: " +DeliveryTiming;
	}

}
