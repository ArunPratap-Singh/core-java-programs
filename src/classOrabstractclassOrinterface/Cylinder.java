package classOrabstractclassOrinterface;

public class Cylinder implements ThreeDShape {
	double r;
	double h;
	
	Cylinder(){
		
	}
	
	Cylinder(double r, double h){
		this.r = r;
		this.h = h;
	}
	@Override
	public void resize() {
		
		System.out.println("Resize Cylinder");
	}
	@Override
	public double volume() {
		return Math.PI*r*r*h;
	}
	@Override
	public double lateralSurfaceArea() {
		return 2*Math.PI*r*h;
	}
	@Override
	public double totalSurfaceArea() {
		return 2*Math.PI*r*(r+h);
	}
	
	public String toString() {
		return "Radius is: " +r+"\tHeight is: " +h;
	}

}
