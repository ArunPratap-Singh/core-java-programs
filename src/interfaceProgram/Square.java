package interfaceProgram;

public class Square implements TwoDShape{
	
	private double side;
	
	Square(){
		
	}
	
	Square(double side){
		
		if (side <= 0) {
			throw new IllegalArgumentException("Side Length Must Be Positive");
		}
		
		this.side = side;
	}
	
	public double area() {
		return side * side;
	}
	
	public double perimeter() {
		return 4 * side;
	}
	
	public void rotate() {
		System.out.println("Square is being rotated");
	}
	
	public void resize() {
		System.out.println("Square is being resized");
	}
	
	public String toString() {
		return "Square [Side is: " +side+ "]";
	}

}
