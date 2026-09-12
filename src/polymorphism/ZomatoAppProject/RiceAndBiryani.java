package polymorphism.ZomatoAppProject;

public class RiceAndBiryani extends FoodShop{
	
	String type;
	boolean isVeg;
	int price;
	
	RiceAndBiryani(){
		
	}
	
	RiceAndBiryani(String name, String rating, String distance, boolean isFreeDelivery, String discount, String type, boolean isVeg, int price){
		
		super(name, rating, distance, isFreeDelivery, discount);
		this.type = type;
		this.isVeg = isVeg;
		this.price = price;
	}

	@Override
	public void eat() {
		
		if(type=="rice") {
			System.out.println("Eating Rice");
		}else
			System.out.println("Eating Biryani");
		System.out.println("Its Delicious but costly but Yummy");
		System.out.println("I Will Order It Again");
	}
	
	

}
