package interfaceProgram;

public class Cube implements ThreeDShape{
	
	private double side;
	
	Cube(){
		
	}
	
	Cube(double side){
		if(side <= 0) {
			throw new IllegalArgumentException("Side cannot be negative");
		}
		this.side = side;
	}

	@Override
	public void rotate() {
		System.out.println("Cube is being rotating");
		
	}

	@Override
	public void resize() {
		System.out.println("Cube is being resized");
		
	}

	@Override
	public double volume() {
		
		return side*side*side;
	}

	@Override
	public double totalSurfaceArea() {
		
		return 6*side*side;
	}

	@Override
	public double lateralSurfaceArea() {
		
		return 4*side*side;
	}
	
	public String toString() {
		return "Cube[Side is: " +side+" ] ";
	}

}
