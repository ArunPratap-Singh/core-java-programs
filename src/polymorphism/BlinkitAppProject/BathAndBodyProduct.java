package polymorphism.BlinkitAppProject;

public class BathAndBodyProduct extends Product{
	
	String BathorBodyProduct;
	String BathorBodyProductName;
	int Price;
	int Quantity;
	String Rating;
	String DeliveryTiming;
	
	BathAndBodyProduct(){
		
	}
	
	BathAndBodyProduct(String Productgroupname, String BathorBodyProduct, String BathorBodyProductName, int Price, int Quantity, String Rating, String DeliveryTiming){
		
		super(Productgroupname);
		this.BathorBodyProduct = BathorBodyProduct;
		this.BathorBodyProductName = BathorBodyProductName;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Rating = Rating;
		this.DeliveryTiming = DeliveryTiming;
	}
	
	public String toString() {
		return super.toString()+"BathorBodyProduct is: " +BathorBodyProduct+"\tBathorBodyProductName is: " +BathorBodyProductName+"\tPrice is: " +Price+"\tQuantity is: " +Quantity+"\tRating is: " +Rating+"\tDeliveryTiming is: " +DeliveryTiming;
	}

}
