package polymorphism.ZomatoAppProject;

public class ChaatAndSnacks extends FoodShop{
	
	String type;
	String typename;
	int price;
	
	ChaatAndSnacks(){
		
	}
	
	ChaatAndSnacks(String name, String rating, String distance, boolean isFreeDelivery, String discount, String type, String typename, int price){
		
		super(name, rating, distance, isFreeDelivery, discount);
		this.type = type;
		this.typename = typename;
		this.price = price;
	}
	
	@Override
	public void eat() {
		
		System.out.println("Eating Snacks and Chaat");
		System.out.println("It's So Yummy and Tasty O........");
	}

}
