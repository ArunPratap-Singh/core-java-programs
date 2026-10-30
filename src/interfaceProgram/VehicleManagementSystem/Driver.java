package interfaceProgram.VehicleManagementSystem;

public class Driver {
	
	public static void main(String[] args) {
		
		VehicleManagementSystem v = new VehicleManagementSystem();
		
		do {
			v.start();
		}while(v.doYouWantToContinue());
		
		System.out.println("Thank you for playing the game! Game Ends....");
			
		
	}

}
