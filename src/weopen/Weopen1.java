package weopen;

public class Weopen1 {
	
	String name;
	int price;
	double weight;
	
	Weopen1(){
		
	}
	
	Weopen1(String name, int price, double weight){
		
		this.name = name;
		this.price = price;
		this.weight = weight;
	}
	
	public String toString() {
		return "Name is: " +name+"\tPrice is: " +price+"\tWeight is: " +weight;
	}

}
