package task2Assignment;

public class Cone {
	
	double r;
	double h;
	double l;
	

	public String getDetails(){

		return "Radius r: " +r+ "\tHeight h: " +h+ "\tSlantHeight l: " +l;
	}

	public double getVolume(){

		return Math.PI*r*r*(h/3);
	}

	public double getLateralSurfaceArea(){
		
		return Math.PI*r*l;
	}

	public double getTotalSurfaceArea(){

		return Math.PI*r*(l+r);
	}

}
