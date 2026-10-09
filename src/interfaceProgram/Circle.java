package interfaceProgram;

public class Circle implements TwoDShape{
	
	private double r;
	
	Circle(){
		
	}
	
	Circle(double r){
		
		if(r < 0) {
			throw new RuntimeException("Radius Cannot Be Negative");
		}
		this.r = r;
	}

	@Override
	public void rotate() {
		System.out.println("Circle is being rotating");
		
	}

	@Override
	public void resize() {
		System.out.println("Circle is being resized");
		
	}

	@Override
	public double area() {
		
		return Math.PI*r*r;
	}

	@Override
	public double perimeter() {
		
		return 2*Math.PI*r;
	}
	
	public String toString() {
		return "Circle[Radius is: " +r+ "unit]";
	}
	

}
