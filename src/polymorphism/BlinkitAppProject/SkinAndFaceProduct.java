package polymorphism.BlinkitAppProject;

public class SkinAndFaceProduct extends Product{
	
	String SkinorFaceProduct;
	String SkinorFaceProductName;
	int Price;
	int Quantity;
	String Rating;
	String DeliveryTiming;
	
	SkinAndFaceProduct(){
		
	}
	
	SkinAndFaceProduct(String Productgroupname, String SkinorFaceProduct, String SkinorFaceProductName, int Price, int Quantity, String Rating, String DeliveryTiming){
		
		super(Productgroupname);
		this.SkinorFaceProduct = SkinorFaceProduct;
		this.SkinorFaceProductName = SkinorFaceProductName;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Rating = Rating;
		this.DeliveryTiming = DeliveryTiming;
	}
	
	public String toString() {
		return super.toString()+"SkinorFaceProduct is: " +SkinorFaceProduct+"\tSkinorFaceProductName is: " +SkinorFaceProductName+"\tPrice is: " +Price+"\tQuantity is: " +Quantity+"\tRating is: " +Rating+"\tDeliveryTiming is: " +DeliveryTiming;
	}

}
