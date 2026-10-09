package interfaceProgram;

public class Cylinder implements ThreeDShape{
	
	private double radius;
	private double height;
	
	Cylinder(){
		
	}
	
	Cylinder(double radius, double height){
		
		if(radius < 0 || height < 0) {
			throw new RuntimeException("Radius and Height cannot be negative");
		}
		this.radius = radius;
		this.height = height;
	}

	@Override
	public void rotate() {
		System.out.println("Cylinder is being rotating");
		
	}

	@Override
	public void resize() {
		System.out.println("Cylinder is being resized");
		
	}

	@Override
	public double volume() {
		
		 return 2 * Math.PI * radius * (radius + height);
	}

	@Override
	public double totalSurfaceArea() {
		
		return 2*Math.PI*radius*height;
	}

	@Override
	public double lateralSurfaceArea() {
		
		return 2 * Math.PI * radius * height;
	}
	
	public String toString() {
		return "Cylinder [Radius is: " +radius+", Height is: " +height+" ]";
	}
	
	

}
