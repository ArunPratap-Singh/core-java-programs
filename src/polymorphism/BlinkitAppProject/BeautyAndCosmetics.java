package polymorphism.BlinkitAppProject;

public class BeautyAndCosmetics extends Product{
	
	String BeautyorCosmetics;
	String BeautyorCosmeticsProductName;
	int Price;
	int Quantity;
	String Rating;
	String DeliveryTiming;
	
	BeautyAndCosmetics(){
		
	}
	
	BeautyAndCosmetics(String Productgroupname, String BeautyorCosmetics, String BeautyorCosmeticsProductName, int Price, int Quantity, String Rating, String DeliveryTiming){
		
		super(Productgroupname);
		this.BeautyorCosmetics = BeautyorCosmetics;
		this.BeautyorCosmeticsProductName = BeautyorCosmeticsProductName;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Rating = Rating;
		this.DeliveryTiming = DeliveryTiming;
	}
	
	public String toString() {
		return super.toString()+"BeautyorCosmetics is: " +BeautyorCosmetics+"\tBeautyorCosmeticsProductName is: " +BeautyorCosmeticsProductName+"\tPrice is: " +Price+"\tQuantity is: " +Quantity+"\tRating is: " +Rating+"\tDeliveryTiming is: " +DeliveryTiming;
	}


}
