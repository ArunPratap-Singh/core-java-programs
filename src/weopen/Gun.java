package weopen;

public class Gun extends Weopen {
	
	int bullets;
	String range;
	
	Gun(){
		
	}
	
	Gun(String name, int price, double weight, int bullets, String range){
		
		super.name = name;
		super.price = price;
		super.weight = weight;
		this.bullets = bullets;
		this.range = range;
	}
	
	public String toString() {
		
		return super.toString()+"\tBullets is: " +bullets+"\tRange is: " +range;
	}

}
