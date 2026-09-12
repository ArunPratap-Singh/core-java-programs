package inheritanceProgramingHierarchialInheritance.Vehicle;

public class Driver {
	
	public static void main(String[] args) {
		
		System.out.println("=======================Main Method Starts=========================");
		
	 	Car c1 = new Car("Toyota", "Fortuner", 2024, 5, "Diesel");
        Bike b1 = new Bike("Honda", "Shine", 2023, 125, "Commuter");
        Bus bu1 = new Bus("Volvo", "B9R", 2022, 50, "Lucknow-Delhi");
        Truck t1 = new Truck("Tata", "Prima", 2023, 25.5, 10);
        Train tr1 = new Train("Indian Railways", "Vande Bharat", 2024, 16, "Express");
        Aircraft a1 = new Aircraft("Boeing", "787", 2023, 296, "Commercial");
        
        System.out.println(c1);
        System.out.println(b1);
        System.out.println(bu1);
        System.out.println(t1);
        System.out.println(tr1);
        System.out.println(a1);
        
        System.out.println("=============================Main Method Ends========================");
        
	}

}
