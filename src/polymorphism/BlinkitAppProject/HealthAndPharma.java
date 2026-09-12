package polymorphism.BlinkitAppProject;

public class HealthAndPharma extends Product{
	
	String HealthorPharma;
	String HealthorPharmaProductName;
	int Price;
	int Quantity;
	String Rating;
	String DeliveryTiming;
	
	HealthAndPharma(){
		
	}
	
	HealthAndPharma(String Productgroupname, String HealthorPharma, String HealthorPharmaProductName, int Price, int Quantity, String Rating, String DeliveryTiming){
		
		super(Productgroupname);
		this.HealthorPharma = HealthorPharma;
		this.HealthorPharmaProductName = HealthorPharmaProductName;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Rating = Rating;
		this.DeliveryTiming = DeliveryTiming;
	}
	
	public String toString() {
		return super.toString()+"HealthorPharma is: " +HealthorPharma+"\tHealthorPharmaProductName is: " +HealthorPharmaProductName+"\tPrice is: " +Price+"\tQuantity is: " +Quantity+"\tRating is: " +Rating+"\tDeliveryTiming is: " +DeliveryTiming;
	}


}
