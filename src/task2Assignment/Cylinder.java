package task2Assignment;

public class Cylinder {
	
	double r;
	double h;

	public String getDetails(){

		return "Radius is: " +r+ "\tHeight is: " +h;

	}

	public double getVolume(){

		return Math.PI*((r*r)*h);

	}

	public double getLateralSurfaceArea(){

		return 2*(Math.PI*(r*h));
	
	}

	public double getTotalSurfaceArea(){

		return 2*(Math.PI*r*(r+h));
	
	}


}
