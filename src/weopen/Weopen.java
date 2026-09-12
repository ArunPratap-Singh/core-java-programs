package weopen;

public class Weopen {
	
	String name;
	int price;
	double weight;
	
	Weopen(){
		
	}
	
	Weopen(String name, int price, double weight){
		
		this.name = name;
		this.price = price;
		this.weight = weight;
	}
	
	public String toString() {
		return "Name is: " +name+"\tPrice is: " +price+"\tWeight is: " +weight;
	}

}
