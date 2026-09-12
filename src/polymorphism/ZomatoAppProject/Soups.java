package polymorphism.ZomatoAppProject;

public class Soups extends FoodShop{
	
	String soupname;
	int price;
	
	Soups(){
		
	}
	
	Soups(String name, String rating, String distance, boolean isFreeDelivery, String discount, String soupname, int price){
		
		super(name, rating, distance, isFreeDelivery, discount);
		this.soupname = soupname;
		this.price = price;
	}

	@Override
	public void eat() {
		
		System.out.println("Drinking Soup");
		System.out.println("Soup Is Tasty");
		System.out.println("Soup is Very MucH Healthy And Good For Body");
		System.out.println("Prices are Normal but its quality is very good");
	}
	
	

}
