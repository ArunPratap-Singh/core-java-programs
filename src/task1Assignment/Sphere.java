package task1Assignment;

public class Sphere {
	
	double r;

	public void printDetails(){

	System.out.println("Radius is: " +r);
	
	}

	public void printVolume(){

	double Volume = 4/3*3.14*(r*r*r);
	System.out.println("Volume is: " +Volume);

	}

	public void printLateralSurfaceArea(){

	double LateralSurfaceArea = 4*3.14*(r*r);
	System.out.println("LateralSurfaceArea is: " +LateralSurfaceArea);
	
	}

	public void printTotalSurfaceArea(){

	double TotalSurfaceArea = 4*3.14*(r*r);
	System.out.println("TotalurfaceArea is: " +TotalSurfaceArea);
	
	}

}
