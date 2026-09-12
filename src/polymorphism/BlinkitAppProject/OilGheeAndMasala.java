package polymorphism.BlinkitAppProject;

public class OilGheeAndMasala extends Product{
	
	String OilorGheeorMasala;
	String OilorGheeorMasalaName;
	int Price;
	String Quantity;
	String Rating;
	String DeliveryTiming;
	
	
	OilGheeAndMasala(){
		
	}
	
	OilGheeAndMasala(String Productgroupname, String OilorGheeorMasala, String OilorGheeorMasalaName, int Price, String Quantity, String Rating, String DeliveryTiming){
		
		super(Productgroupname);
		this.OilorGheeorMasala = OilorGheeorMasala;
		this.OilorGheeorMasalaName = OilorGheeorMasalaName;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Rating = Rating;
		this.DeliveryTiming = DeliveryTiming;
	}
	
	public String toString() {
		
		return super.toString()+"OilorGheeorMasala is: " +OilorGheeorMasala+"\tOilorGheeorMasalaName is: " +OilorGheeorMasalaName+"\tPrice is: " +Price+"\tQuantity is: " +Quantity+"\tRating is: " +Rating+"\tDeliveryTiming is: " +DeliveryTiming;
	}

}
