package weopen;

public class Missile extends Weopen1 {
	
	String range;
	String status;
	String type;
	String warhead;
	String speed;
	
	Missile(){
		
	}
	
	Missile(String name, int price, double weight, String range, String status, String type, String warhead, String speed){
		
		super(name, price, weight);
		this.range = range;
		this.status = status;
		this.type = type;
		this.warhead = warhead;
		this.speed = speed;
	}
	
	public String toString() {
		return super.toString()+"\tRange is: " +range+"\tStatus is: " +status+"\tType is: " +type+"\tWarhead is: " +warhead+"\tSpeed is: " +speed;
	}
}
