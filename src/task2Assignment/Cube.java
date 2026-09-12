package task2Assignment;

public class Cube {
	
	double a;

	public String getDetails(){

		return "Side a: " +a;
	}

	public double getVolume(){

		return a*a*a;
	
	}

	public double getLateralSurfaceArea(){

		return 4*(a*a);
	
	}

	public double getTotalSurfaceArea(){

		return 6*(a*a);
	
	}


}
