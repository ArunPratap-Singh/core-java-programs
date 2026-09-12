package polymorphism.ZomatoAppProject;

public class Breakfast extends FoodShop{
	
	String Breakfastname;
	int price;
	
	
	Breakfast(){
		
	}
	
	Breakfast(String name, String rating, String distance, boolean isFreeDelivery, String discount, String Breakfastname, int price){
		
		super(name, rating, distance, isFreeDelivery, discount );
		this.Breakfastname = Breakfastname;
		this.price = price;
	}

	@Override
	public void eat() {
		
		System.out.println("Eating Breakfast");
		System.out.println("Breakfast is Good And Delicious");
		
	}
	
	

}
