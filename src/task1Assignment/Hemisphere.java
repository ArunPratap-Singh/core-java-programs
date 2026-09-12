package task1Assignment;

public class Hemisphere {
	
	double r;

	public void printDetails(){

	System.out.println("Radius is: " +r);

	}

	public void printVolume(){

	double Volume = 2/3*3.14*(r*r*r);
	System.out.println("Volume is: " +Volume);

	}

	public void printLateralSurfaceArea(){

	double LateralSurfaceArea = 2*3.14*(r*r);
	System.out.println("LateralSurfaceArea is: " +LateralSurfaceArea);
	
	}

	public void printTotalSurfaceArea(){

	double TotalSurfaceArea = 3*3.14*(r*r);
	System.out.println("TotalurfaceArea is: " +TotalSurfaceArea);
	
	}


}
