package polymorphism.ZomatoAppProject;

public class Beverages extends FoodShop{
	
	String type;
	String tyepname;
	int price;
	
	Beverages(){
		
	}
	
	Beverages(String name, String rating, String distance, boolean isFreeDelivery, String discount, String type, String typename, int price){
		
		super(name, rating, distance, isFreeDelivery, discount);
		this.type = type;
		this.tyepname = typename;
		this.price = price;
	}

	@Override
	public void eat() {
		
		System.out.println("Drinking it");
		System.out.println("It's Yummy");
		System.out.println("It's Delicious");
	}

}
