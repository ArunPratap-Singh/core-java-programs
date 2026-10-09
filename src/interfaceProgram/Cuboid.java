package interfaceProgram;

public class Cuboid implements ThreeDShape{
	
	private double length;
	private double breadth;
	private double height;
	
	Cuboid(){
		
	}
	
	Cuboid(double length, double breadth, double height){
		
		if(length < 0 || breadth < 0 || height < 0) {
			throw new RuntimeException("Length, Breadth, Height Cannotb be Negative");
		}
	}

	@Override
	public void rotate() {
		System.out.println("Cuboid is being rotating");
		
	}

	@Override
	public void resize() {
		System.out.println("Cuboid is being resized");
		
	}

	@Override
	public double volume() {
		
		return length*breadth*height;
	}

	@Override
	public double totalSurfaceArea() {
		
		return 2*(length*breadth+breadth*height+height*length);
	}

	@Override
	public double lateralSurfaceArea() {
		
		return 2*height*(length+breadth);
	}
	
	public String toString() {
		return "Cuboid [Length is: " +length+", Breadth is: " +breadth+", Height is: " +height+"]";
	}
	
	

}
