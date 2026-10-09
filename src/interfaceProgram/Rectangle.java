package interfaceProgram;

public class Rectangle implements TwoDShape{
	
	private double length;
	private double breadth;
	
	Rectangle(){
		
	}
	
	Rectangle(double length, double breadth){
		
		if(length < 0 || breadth < 0) {
			throw new RuntimeException("Length and Breadth cannot be negative");
		}
		
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void rotate() {
		System.out.println("Rectangle is being rotated");
		
	}

	@Override
	public void resize() {
		System.out.println("Rectangle is being resized");
		
	}

	@Override
	public double area() {
		
		return length * breadth;
	}

	@Override
	public double perimeter() {
		
		return 2 * (length + breadth);
	}
	
	public String toString() {
		
		return "Rectangle[Length is: " +length+" unit, Breadth is: " +breadth+" unit]";
	}

}
