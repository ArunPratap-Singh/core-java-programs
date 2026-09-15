package generics.Animal;

public class Box<T> {
	
	private T t;
	
	Box(){
		
	}
	
	Box(T t){
		this.t = t;
	}
	
	public String getDetials() {
		return "Value is: " +t;
	}
	
	public T getT() {
		return t;
	}

}
