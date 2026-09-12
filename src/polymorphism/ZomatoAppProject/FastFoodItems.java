package polymorphism.ZomatoAppProject;

public class FastFoodItems extends FoodShop{
	
	String itemname;
	String itemnametype;
	int price;
	
	FastFoodItems(){
		
	}
	
	FastFoodItems(String name, String rating, String distance, boolean isFreeDelivery, String discount, String itemname, String itemnametype, int price){
		
		super(name, rating, distance, isFreeDelivery, discount);
		this.itemname = itemname;
		this.itemnametype = itemnametype;
		this.price = price;
	}
	
	@Override
	public void eat() {
		
		System.out.println("Eating Fastfood");
		System.out.println("It's Yummy and Delicious");
		System.out.println("Waoooooooo.......");
	}

}
