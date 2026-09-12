package task1Assignment;

public class Cylinder {
	
	double r;
	double h;

	public void printDetails(){

	System.out.println("Radius is: " +r);
	System.out.println("Height is: " +h);

	}

	public void printVolume(){

	double Volume = 3.14*((r*r)*h);
	System.out.println("Volume is: " +Volume);

	}

	public void printLateralSurfaceArea(){

	double LateralSurfaceArea = 2*(3.14*(r*h));
	System.out.println("LateralSurfaceArea is: " +LateralSurfaceArea);
	
	}

	public void printTotalSurfaceArea(){

	double TotalSurfaceArea = 2*(3.14*r*(r+h));
	System.out.println("TotalSurfaceArea is: " +TotalSurfaceArea);
	
	}

}
