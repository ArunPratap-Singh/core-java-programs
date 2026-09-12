package task2Assignment;

public class Hemisphere {
	
	double r;

	public String getDetails(){

		return "Radius is: " +r;

	}

	public double getVolume(){

		return 2.0/3*Math.PI*(r*r*r);

	}

	public double getLateralSurfaceArea(){

		return 2*Math.PI*(r*r);
	
	}

	public double getTotalSurfaceArea(){
	
		return 3*Math.PI*(r*r);
	
	}

}
