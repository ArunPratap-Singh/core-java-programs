package immutableClass;

public final class Missile {
	
	private final String name;
	private final String range;
	private final int price;
	private final int stages;
	
	Missile(String name, String range, int price, int stages){ 
		this.name = name;
		this.range = range;
		this.price = price;
		this.stages = stages;
		
	}
	
	public String getName() {
		return name;
	}
	public String getRange() {
		return range;
	}
	public int getPrice() {
		return price;
	}
	public int getStages() {
		return stages;
	}
	

}
