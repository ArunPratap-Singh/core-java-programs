package classOrabstractclassOrinterface;

public class Cube implements ThreeDShape {
	double a;
	
	Cube(){
		
	}
	
	Cube(double a){
		this.a = a;
	}
	@Override
	public void resize() {
		
		System.out.println("Resize Cube");
	}
	@Override
	public double volume() {
		return a*a*a;
	}
	@Override
	public double lateralSurfaceArea() {
		return 4*a*a;
	}
	@Override
	public double totalSurfaceArea() {
		return 6*a*a;
	}
	
	public String toString() {
		return "Size is: " +a;
	}

}
