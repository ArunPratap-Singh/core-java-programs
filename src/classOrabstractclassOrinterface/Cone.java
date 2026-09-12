package classOrabstractclassOrinterface;

public class Cone implements ThreeDShape {
	double r;
	double h; 
	double l;
	
	Cone(){
		
	}
	
	Cone(double r, double h, double l){
		this.r = r;
		this.h = h;
		this.l = l;
	}
	@Override
	public void resize() {
		
		System.out.println("Resize Cone");
	}
	@Override
	public double volume() {
		return 1/3*h*Math.PI*r*r;
	}
	@Override
	public double totalSurfaceArea() {
		return Math.PI*r*(r+l);
	}
	@Override
	public double lateralSurfaceArea() {
		return Math.PI*r*l;
	}
	
	public String toString() {
		return "Radius is: " +r+"\tHeight is: " +h+"\tSlant Height is: " +l;
	}
}
