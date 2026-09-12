package classOrabstractclassOrinterface;

public class Hemisphere implements ThreeDShape {
	
	double r;
	
	Hemisphere(){
		
	}
	Hemisphere(double r){
		this.r = r;
	}
	@Override
	public void resize() {
		
		System.out.println("Resize Hemisphere");
	}
	@Override
	public double volume() {
		return 2/3*Math.PI*r*r*r;
	}
	@Override
	public double lateralSurfaceArea() {
		return 2*Math.PI*r*r;
	}
	@Override
	public double totalSurfaceArea() {
		return r*Math.PI*r*r;
	}
	
	public String toString() {
		return "Radius is: " +r;
	}

}
