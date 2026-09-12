package task1Assignment;

public class Cube {
	
	double a;

	public void printDetails(){

	System.out.println("Side a: " +a);
	}

	public void printVolume(){

	double Volume = a*a*a;
	System.out.println("Volume is: " +Volume);
	}

	public void printLateralSurfaceArea(){

	double LateralSurfaceArea = 4*(a*a);
	System.out.println("LateralSurfaceArea is: " +LateralSurfaceArea);
	}

	public void printTotalSurfaceArea(){

	double TotalSurfaceArea = 6*(a*a);
	System.out.println("TotalSurfaceArea is: " +TotalSurfaceArea);
	}

}
