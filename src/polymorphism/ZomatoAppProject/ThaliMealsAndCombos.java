package polymorphism.ZomatoAppProject;

public class ThaliMealsAndCombos extends FoodShop{
	
	String mealsname;
	int price;
	
	ThaliMealsAndCombos(){
		
	}	
	ThaliMealsAndCombos(String name, String rating, String distance, boolean isFreeDelivery, String discount, String mealsname, int price){
		
		super(name, rating, distance, isFreeDelivery, discount);
		this.mealsname = mealsname;
		this.price = price;
	}
	
	@Override					
	public void eat() {
		
		System.out.println("Eating Food");
		System.out.println("Food is Very Much Tasty And Delicous");
		System.out.println("It's So Yummy");
		System.out.println("I Will Order It Again From This Shop");
	}

}
