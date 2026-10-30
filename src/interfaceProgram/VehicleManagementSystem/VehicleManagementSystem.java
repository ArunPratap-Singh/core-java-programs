package interfaceProgram.VehicleManagementSystem;

import java.util.Scanner;

public class VehicleManagementSystem {
	
	Scanner sc = new Scanner(System.in);
	
	public void start() {
		
		System.out.println("=============Vehicle Management System Started================");
		
		System.out.println("==============================================================");
		System.out.println("              Welcome to Vehicle Management System            ");
		System.out.println("==============================================================");
		
		System.out.println("Please Select Correct Option To Choose Types Of Vehicle!.......");
		 
		System.out.println("Press 1 ====> For Two Wheeler");
		System.out.println("Press 2 ====> For Three Wheeler");
		System.out.println("Press 3 ====> For Four Wheeler");
		System.out.println("Press 0 ====> For Exit");
		int choice = Integer.parseInt(sc.nextLine());
		
		if(choice == 1) {
			
			System.out.println("======================================================");
			System.out.println("             YOU HAVE SELECTED TWO WHEELER            ");
			System.out.println("======================================================");
			
			try {
			TwoWheeler t = selectAndGetTwoWheeler();
			
			System.out.println(t);
			
			t.honk();
			t.kickStart();
			t.start();
			t.wearHelmet();
			t.balance();
			t.brake();
			t.stop();
			t.accelerate();
			System.out.println("Fuel Used is: " +t.fuelUsed(100));
			System.out.println("Mileage is: " +t.mileage());
			t.displayDetails();
			
			}catch(Exception e) {		
				System.out.println(e.getMessage());
			}
			
		}else if(choice == 2) {
			
			System.out.println("======================================================");
			System.out.println("              YOU HAVE SELECTED THREE WHEELER         ");
			System.out.println("======================================================");
			
			try {
			ThreeWheeler t = selectAndGetThreeWheeler();
			
			System.out.println(t);
			
			t.honk();
			t.start();
			t.brake();
			t.stop();
			t.accelerate();
			System.out.println("Fuel Used is: " +t.fuelUsed(100));
			System.out.println("Mileage is: " +t.mileage());
			t.displayDetails();
			t.carryPassengers();
			t.displayPassengerCapacity();
			t.carryGoods();
			t.goodsCarryCapacity();
			
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}else if(choice == 3) {
			
			System.out.println("===========================================================");
			System.out.println("                 YOU HAVE SELECTED FOUR WHEELER            ");
			System.out.println("===========================================================");
			
			FourWheeler f = selectAndGetFourWheeler();
			
			System.out.println(f);
			
			f.honk();
			f.start();
			f.wearSeatBelt();
			f.openBoot();
			f.displaySeatingCapacity();
			f.brake();
			f.stop();
			f.accelerate();
			System.out.println("Fuel Used is: " +f.fuelUsed(100));
			System.out.println("Mileage is: " +f.mileage());
			f.displayDetails();
			
		}else {
			System.out.println("Invalid choice, Please enter valid choice....");
			start();
		}
		
	}
	
	private TwoWheeler selectAndGetTwoWheeler() {
		
		System.out.println("Press 1 ====> For Bike");
		System.out.println("Press 2 ====> For Scooter");
		System.out.println("Press 3 ====> For Electric Scooter");
		System.out.println("Press 4 ====> For Moped");
		System.out.println("Press 5 ====> For SportsBike");
		System.out.println("Press 6 ====> For AdventureBike");
		System.out.println("Press 7 ====> For CafeRacerBike");
		System.out.println("Press 8 ====> For CommuterBike");
		System.out.println("Press 9 ====> For CruiserBike");
		System.out.println("Press 10 ====> For DirtBike");
		System.out.println("Press 11 ====> For Electric Moped");
		System.out.println("Press 12 ====> For Electric Motorcycle");
		System.out.println("Press 13 ====> For Electric Scooter");
		System.out.println("Press 14 ====> For Touring Bike");
		
		int choice = Integer.parseInt(sc.nextLine());
		
		if(choice == 1) {
			
			System.out.println("===========================================");
			System.out.println("          You Have Selected Bike!!!        ");
			System.out.println("===========================================");
			
			System.out.println("Enter Bike Brand....");
			String brand = sc.nextLine();
			
			System.out.println("Enter Bike Model....");
			String model = sc.nextLine();
			
			System.out.println("Enter Bike Color....");
			String color = sc.nextLine();
			
			System.out.println("Enter Bike EngineCC....");
			int engineCC = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Bike Fuel Capacity....");
			double fuel = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Bike Distance....");
			double distance = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Bike Price....");
			double price = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Bike Speed....");
			double speed = Double.parseDouble(sc.nextLine());
			
			Bike bike = new Bike(brand, model, color, engineCC, fuel, distance, price, speed); 
			return bike;
		
		}else if (choice == 2) {
			
			System.out.println("================================================");
			System.out.println("            You Have Selected Scooter           ");
			System.out.println("================================================");
			
			System.out.println("Enter Scooter Brand....");
			String brand = sc.nextLine();
			
			System.out.println("Enter Scooter Model....");
			String model = sc.nextLine();
			
			System.out.println("Enter Scooter Color....");
			String color = sc.nextLine();
			
			System.out.println("Enter Scooter Fuel Capacity....");
			double fuel = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Scooter Distance....");
			double distance = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Scooter Price....");
			double price = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Scooter Speed....");
			double speed = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Storage Capacity....");
			double storageCapacity = Double.parseDouble(sc.nextLine());
			
			Scooter scooter = new Scooter(brand, model, color, fuel, distance, price, speed, storageCapacity);
			return scooter;
			
		}else if(choice == 3) {
			
			System.out.println("====================================================");
			System.out.println("         You Have Selected Electric Scooter         ");
			System.out.println("====================================================");
			
			System.out.println("Enter Electric Scooter Brand....");
			String brand = sc.nextLine();
			
			System.out.println("Enter Electric Scooter Model....");
			String model = sc.nextLine();
			
			System.out.println("Enter Electric Scooter Registration Number....");
			String registrationNumber = sc.nextLine();
			
			System.out.println("Enter Electric Scooter Color....");
			String color = sc.nextLine();
			
			System.out.println("Enter Electric Scooter Manufacturing Year....");
			int manufacturingYear = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Electric Scooter price....");
			double price = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Electric Scooter Distance....");
			double distance = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Electric Scooter Battery Capacity....");
			double batteryCapacity = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Electric Scooter Speed....");
			double speed = Double.parseDouble(sc.nextLine());
			
			ElectricScooter electricscooter = new ElectricScooter(brand, model, registrationNumber, color, manufacturingYear, price, distance, batteryCapacity, speed);
			return electricscooter;
			
		}else if(choice == 4) {
			
			System.out.println("=======================================================");
			System.out.println("              You Have Selected Moped                  ");
			System.out.println("=======================================================");
			
			System.out.println("Enter Moped Brand....");
			String brand = sc.nextLine();
			
			System.out.println("Enter Moped Model....");
			String model = sc.nextLine();
			
			System.out.println("Enter Moped Registration Number....");
			String registrationNumber = sc.nextLine();
			
			System.out.println("Enter Moped Color....");
			String color = sc.nextLine();
			
			System.out.println("Enter Moped Manufacturing Year....");
			int manufacturingYear = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Moped price....");
			double price = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Moped fuel Capacity....");
			double fuel = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Moped Speed....");
			double speed = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Distance Covered....");
			double distance = Double.parseDouble(sc.nextLine());
			
			Moped moped = new Moped(brand, model, registrationNumber, color, manufacturingYear, price, fuel, speed, distance);
			return moped;
			
		}else if(choice == 5) {
			
			System.out.println("=======================================================");
			System.out.println("              You Have Selected SportsBike             ");
			System.out.println("=======================================================");
			
			System.out.println("Enter SportsBike Brand....");
			String brand = sc.nextLine();
			
			System.out.println("Enter SportsBike Model....");
			String model = sc.nextLine();
			
			System.out.println("Enter SportsBike Registration Number....");
			String registrationNumber = sc.nextLine();
			
			System.out.println("Enter SportsBike Color....");
			String color = sc.nextLine();
			
			System.out.println("Enter SportsBike Manufacturing Year....");
			int manufacturingYear = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter SportsBike price....");
			double price = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter SportsBike fuel Capacity....");
			double fuel = Double.parseDouble(sc.nextLine());
					
			System.out.println("Enter SportsBike Distance Covered....");
			double distance = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter SportsBike Speed....");
			double speed = Double.parseDouble(sc.nextLine());
			
			SportsBike sportsbike = new SportsBike(brand, model, registrationNumber, color, manufacturingYear, price, fuel, distance, speed);
			return sportsbike;
			
		}else if(choice == 6) {
			
			System.out.println("==========================================================");
			System.out.println("               You Have Selected Adventure Bike           ");
			System.out.println("==========================================================");
			
			System.out.println("Enter AdventureBike Brand....");
			String brand = sc.nextLine();
			
			System.out.println("Enter AdventureBike Model....");
			String model = sc.nextLine();
			
			System.out.println("Enter AdventureBike Registration Number....");
			String registrationNumber = sc.nextLine();
			
			System.out.println("Enter AdventureBike Color....");
			String color = sc.nextLine();
			
			System.out.println("Enter AdventureBike Manufacturing Year....");
			int manufacturingYear = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter AdventureBike price....");
			double price = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter AdventureBike fuel Capacity....");
			double fuel = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter AdventureBike Speed....");
			double speed = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter AdventureBike EngineCapacity....");
			double engineCapacity = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter AdventureBike SuspensionType....");
			String suspensionType = sc.nextLine();
			
			AdventureBike adventurebike = new AdventureBike(brand, model, registrationNumber, color, manufacturingYear, price, fuel, speed, engineCapacity, suspensionType);
			return adventurebike;
			
		}else if(choice == 7) {
			
			System.out.println("==========================================================");
			System.out.println("              You Have Selected Cafe Racer Bike           ");
			System.out.println("==========================================================");
			
			System.out.println("Enter CafeRacerBike Brand....");
			String brand = sc.nextLine();
			
			System.out.println("Enter CafeRacerBike Model....");
			String model = sc.nextLine();
			
			System.out.println("Enter CafeRacerBike Registration Number....");
			String registrationNumber = sc.nextLine();
			
			System.out.println("Enter CafeRacerBike Color....");
			String color = sc.nextLine();
			
			System.out.println("Enter CafeRacerBike Manufacturing Year....");
			int manufacturingYear = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter CafeRacerBike price....");
			double price = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter CafeRacerBike fuel Capacity....");
			double fuel = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter CafeRacerBike Speed....");
			double speed = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter CafeRacerBike EngineCapacity....");
			double engineCapacity = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter CafeRacerBike HandleBar Type....");
			String handlebarType = sc.nextLine();
			
			CafeRacerBike caferacerbike = new CafeRacerBike(brand, model, registrationNumber, color, manufacturingYear, price, fuel, speed, engineCapacity, handlebarType);
			return caferacerbike;
			
		}else if(choice == 8) {
			
			System.out.println("==========================================================");
			System.out.println("               You Have Selected CommuterBike             ");
			System.out.println("==========================================================");
			
			System.out.println("Enter CommuterBike Brand....");
			String brand = sc.nextLine();
			
			System.out.println("Enter CommuterBike Model....");
			String model = sc.nextLine();
			
			System.out.println("Enter CommuterBike Registration Number....");
			String registrationNumber = sc.nextLine();
			
			System.out.println("Enter CommuterBike Color....");
			String color = sc.nextLine();
			
			System.out.println("Enter CommuterBike Manufacturing Year....");
			int manufacturingYear = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter CommuterBike price....");
			double price = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter CommuterBike fuel Capacity....");
			double fuel = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter CommuterBike Speed....");
			double speed = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter CommuterBike EngineCapacity....");
			double engineCapacity = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter CommuterBike HandleBar Type....");
			boolean hasElectricStart = Boolean.parseBoolean(sc.nextLine());
			
			CommuterBike commuterbike = new CommuterBike(brand, model, registrationNumber, color, manufacturingYear, price, fuel, speed, engineCapacity, hasElectricStart);
			return commuterbike;
			
		}else if(choice == 9) {
			
			System.out.println("===========================================================");
			System.out.println("                You Have Selected Cruiser Bike             ");
			System.out.println("===========================================================");
			
			System.out.println("Enter CruiserBike Brand....");
			String brand = sc.nextLine();
			
			System.out.println("Enter CruiserBike Model....");
			String model = sc.nextLine();
			
			System.out.println("Enter CruiserBike Registration Number....");
			String registrationNumber = sc.nextLine();
			
			System.out.println("Enter CruiserBike Color....");
			String color = sc.nextLine();
			
			System.out.println("Enter CruiserBike Manufacturing Year....");
			int manufacturingYear = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter CruiserBike price....");
			double price = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter CruiserBike fuel Capacity....");
			double fuel = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter CruiserBike Speed....");
			double speed = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter CruiserBike EngineCapacity....");
			double engineCapacity = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter CruiserBike Transmission Type....");
			String transmissionType = sc.nextLine();
			
			CruiserBike cruiserbike = new CruiserBike(brand, model, registrationNumber, color, manufacturingYear, price, fuel, speed, engineCapacity, transmissionType);
			return cruiserbike;
			
		}else if(choice == 10) {
			
			System.out.println("=============================================================");
			System.out.println("                  You Have Selected Dirt Bike                ");
			System.out.println("=============================================================");
			
			System.out.println("Enter DirtBike Brand....");
			String brand = sc.nextLine();
			
			System.out.println("Enter DirtBike Model....");
			String model = sc.nextLine();
			
			System.out.println("Enter DirtBike Registration Number....");
			String registrationNumber = sc.nextLine();
			
			System.out.println("Enter DirtBike Color....");
			String color = sc.nextLine();
			
			System.out.println("Enter DirtBike Manufacturing Year....");
			int manufacturingYear = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter DirtBike price....");
			double price = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter DirtBike fuel Capacity....");
			double fuel = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter DirtBike Speed....");
			double speed = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter DirtBike EngineCapacity....");
			double engineCapacity = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter DirtBike Tyre Type....");
			String tyreType = sc.nextLine();
			
			DirtBike dirttype = new DirtBike(brand, model, registrationNumber, color, manufacturingYear, price, fuel, speed, engineCapacity, tyreType);
			return dirttype;
			
		}else if(choice == 11) {
			
			System.out.println("===============================================================");
			System.out.println("                You Have Selected Electric Moped               ");
			System.out.println("===============================================================");
			
			System.out.println("Enter ElectricMoped Brand....");
			String brand = sc.nextLine();
			
			System.out.println("Enter ElectricMoped Model....");
			String model = sc.nextLine();
			
			System.out.println("Enter ElectricMoped Registration Number....");
			String registrationNumber = sc.nextLine();
			
			System.out.println("Enter ElectricMoped Color....");
			String color = sc.nextLine();
			
			System.out.println("Enter ElectricMoped Manufacturing Year....");
			int manufacturingYear = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter ElectricMoped price....");
			double price = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter ElectricMoped Battery Capacity....");
			double batteryCapacity = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter ElectricMoped Speed....");
			double speed = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter ElectricMoped Range Per Charge....");
			double rangePerCharge = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter ElectricMoped Charging Type....");
			String chargingType = sc.nextLine();
			
			ElectricMoped electricmoped = new ElectricMoped(brand, model, registrationNumber, color, manufacturingYear, price, batteryCapacity, speed, rangePerCharge, chargingType);
			return electricmoped;
			
		}else if(choice == 12) {
			
			System.out.println("================================================================");
			System.out.println("               You Have Selected Electric MotorCycle            ");
			System.out.println("================================================================");
			
			System.out.println("Enter ElectricMotorcycle Brand....");
			String brand = sc.nextLine();
			
			System.out.println("Enter ElectricMotorcycle Model....");
			String model = sc.nextLine();
			
			System.out.println("Enter ElectricMotorcycle Registration Number....");
			String registrationNumber = sc.nextLine();
			
			System.out.println("Enter ElectricMotorcycle Color....");
			String color = sc.nextLine();
			
			System.out.println("Enter ElectricMotorcycle Manufacturing Year....");
			int manufacturingYear = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter ElectricMotorcycle price....");
			double price = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter ElectricMotorcycle Battery Capacity....");
			double batteryCapacity = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter ElectricMotorcycle Speed....");
			double speed = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter ElectricMotorcycle Range Per Charge....");
			double rangePerCharge = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter ElectricMotorcycle Charging Type....");
			String chargingType = sc.nextLine();
			
			ElectricMotorcycle electricMotorcycle = new ElectricMotorcycle(brand, model, registrationNumber, color, manufacturingYear, price, batteryCapacity, speed, rangePerCharge, chargingType);
			return electricMotorcycle;
			
		}else if(choice == 13) {
			
			System.out.println("================================================================");
			System.out.println("                You Have Selected Electric Scooter              ");
			System.out.println("================================================================");
			
			System.out.println("Enter ElectricMotorcycle Brand....");
			String brand = sc.nextLine();
			
			System.out.println("Enter ElectricMotorcycle Model....");
			String model = sc.nextLine();
			
			System.out.println("Enter ElectricMotorcycle Registration Number....");
			String registrationNumber = sc.nextLine();
			
			System.out.println("Enter ElectricMotorcycle Color....");
			String color = sc.nextLine();
			
			System.out.println("Enter ElectricMotorcycle Manufacturing Year....");
			int manufacturingYear = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter ElectricMotorcycle price....");
			double price = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Electric Scooter Distance....");
			double distance = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter ElectricMotorcycle Battery Capacity....");
			double batteryCapacity = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter ElectricMotorcycle Speed....");
			double speed = Double.parseDouble(sc.nextLine());
			
			ElectricScooter electricscooter = new ElectricScooter(brand, model, registrationNumber, color, manufacturingYear, price, distance, batteryCapacity, speed);
			return electricscooter;
			
		}else if(choice == 14) {
			
			System.out.println("================================================================");
			System.out.println("                   You Have Selected Touring Bike               ");
			System.out.println("================================================================");
			
			System.out.println("Enter Touring Bike Brand....");
			String brand = sc.nextLine();
			
			System.out.println("Enter Touring Bike Model....");
			String model = sc.nextLine();
			
			System.out.println("Enter Touring Bike Registration Number....");
			String registrationNumber = sc.nextLine();
			
			System.out.println("Enter Touring Bike Color....");
			String color = sc.nextLine();
			
			System.out.println("Enter Touring Bike Manufacturing Year....");
			int manufacturingYear = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Touring Bike price....");
			double price = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Touring Bike Fuel Capacity....");
			double fuel = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Touring Bike Speed....");
			double speed = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Touring Bike Engine Capacity....");
			double engineCapacity = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Touring Bike Has WingShield....");
			boolean hasWindShield = Boolean.parseBoolean(sc.nextLine());
			
			TouringBike touringbike = new TouringBike(brand, model, registrationNumber, color, manufacturingYear, price, fuel, speed, engineCapacity, hasWindShield);
			return touringbike;
			
		}else {
			
			System.out.println("Invalid Choice! Please Enter Valid Choice....");
			return selectAndGetTwoWheeler();
		}
		
	}
	
	private ThreeWheeler selectAndGetThreeWheeler() {
		
		System.out.println("Press 1 ====> For AutoRickshaw");
		System.out.println("Press 2 ====> For CargoThreeWheeler");
		System.out.println("Press 3 ====> For ElectricRickshaw");
		System.out.println("Press 4 ====> For Motorized TriCycle");
		System.out.println("Press 5 ====> For Passenger TriCycle");
		
		int choice = Integer.parseInt(sc.nextLine());
		
		if(choice == 1) {
			
			System.out.println("====================================================");
			System.out.println("            You Have Selected AutoRickshaw          ");
			System.out.println("====================================================");
			
			System.out.println("Enter AutoRickshaw Brand....");
			String brand = sc.nextLine();
			
			System.out.println("Enter AutoRickshaw Model....");
			String model = sc.nextLine();
			
			System.out.println("Enter AutoRickshaw Registration Number....");
			String registrationNumber = sc.nextLine();
			
			System.out.println("Enter AutoRickshaw Color....");
			String color = sc.nextLine();
			
			System.out.println("Enter AutoRickshaw Manufacturing Year....");
			int manufacturingYear = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter AutoRickshaw price....");
			double price = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter AutoRickshaw fuel Capacity....");
			double fuel = Double.parseDouble(sc.nextLine());
					
			System.out.println("Enter AutoRickshaw Distance Covered....");
			double distance = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter AutoRickshaw Speed....");
			double speed = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter AutoRickshaw Passenger Capacity....");
			int passengercapacity = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter AutoRickshaw Cargo Capacity In Kg....");
			double cargocapacityKg = Double.parseDouble(sc.nextLine());
			
			AutoRickshaw autorickshaw = new AutoRickshaw(brand, model, registrationNumber, color, manufacturingYear, price, fuel, distance, speed, passengercapacity, cargocapacityKg);
			return autorickshaw;
			
		}else if(choice == 2) {
			
			System.out.println("============================================================");
			System.out.println("            You Have Selected Cargo Three Wheeler           ");
			System.out.println("============================================================");
			
			System.out.println("Enter CargoThreeWheeler Brand....");
			String brand = sc.nextLine();
			
			System.out.println("Enter CargoThreeWheeler Model....");
			String model = sc.nextLine();
			
			System.out.println("Enter CargoThreeWheeler Registration Number....");
			String registrationNumber = sc.nextLine();
			
			System.out.println("Enter CargoThreeWheeler Color....");
			String color = sc.nextLine();
			
			System.out.println("Enter CargoThreeWheeler Manufacturing Year....");
			int manufacturingYear = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter CargoThreeWheeler price....");
			double price = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter CargoThreeWheeler fuel Capacity....");
			double fuel = Double.parseDouble(sc.nextLine());
							
			System.out.println("Enter CargoThreeWheeler Speed....");
			double speed = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter CargoThreeWheeler Passenger Capacity....");
			int passengercapacity = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter CargoThreeWheeler Cargo Capacity In Kg....");
			double cargocapacityKg = Double.parseDouble(sc.nextLine());
			
			CargoThreeWheeler cargothreewheeler = new CargoThreeWheeler(brand, model, registrationNumber, color, manufacturingYear, price, fuel, speed, passengercapacity, cargocapacityKg);
			
			return cargothreewheeler;
			
		}else if(choice == 3) {
			
			System.out.println("==========================================================");
			System.out.println("             You Have Chosen Electric Rickshaw            ");
			System.out.println("==========================================================");
			
			System.out.println("Enter ElectricRickshaw Brand....");
			String brand = sc.nextLine();
			
			System.out.println("Enter ElectricRickshaw Model....");
			String model = sc.nextLine();
			
			System.out.println("Enter ElectricRickshaw Registration Number....");
			String registrationNumber = sc.nextLine();
			
			System.out.println("Enter ElectricRickshaw Color....");
			String color = sc.nextLine();
			
			System.out.println("Enter ElectricRickshaw Manufacturing Year....");
			int manufacturingYear = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter ElectricRickshaw price....");
			double price = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter ElectricRickshaw batteryCapacity....");
			double fuel = Double.parseDouble(sc.nextLine());
							
			System.out.println("Enter ElectricRickshaw Speed....");
			double speed = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter ElectricRickshaw Passenger Capacity....");
			int passengercapacity = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter ElectricRickshaw Cargo Capacity In Kg....");
			double cargocapacityKg = Double.parseDouble(sc.nextLine());
			
			ElectricRickshaw electricrickshaw = new ElectricRickshaw(brand, model, registrationNumber, color, manufacturingYear, price, fuel, speed, passengercapacity, cargocapacityKg);
			return electricrickshaw;

		}else if(choice == 4) {
			
			System.out.println("================================================================");
			System.out.println("              You Have Chosen Motorized TriCycle                ");
			System.out.println("================================================================");
			
			System.out.println("Enter Motorized TriCycle Brand....");
			String brand = sc.nextLine();
			
			System.out.println("Enter Motorized TriCycle Model....");
			String model = sc.nextLine();
			
			System.out.println("Enter Motorized TriCycle Registration Number....");
			String registrationNumber = sc.nextLine();
			
			System.out.println("Enter Motorized TriCycle Color....");
			String color = sc.nextLine();
			
			System.out.println("Enter Motorized TriCycle Manufacturing Year....");
			int manufacturingYear = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Motorized TriCycle price....");
			double price = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Motorized TriCycle fuel Capacity....");
			double fuel = Double.parseDouble(sc.nextLine());
							
			System.out.println("Enter Motorized TriCycle Speed....");
			double speed = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Motorized TriCycle Distance Covered....");
			double distance = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Motorized TriCycle Passenger Capacity....");
			int passengercapacity = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter MotorRized Cargo Capacity In Kg....");
			double cargocapacityKg = Double.parseDouble(sc.nextLine());
			
			MotorizedTricycle motorizedtricycle = new MotorizedTricycle(brand, model, registrationNumber, color, manufacturingYear, price, fuel, speed, distance, passengercapacity, cargocapacityKg);
			return motorizedtricycle;
			
		}else if(choice == 5) {
			
			System.out.println("==============================================================");
			System.out.println("              You Have Selected Passenger TriCycle            ");
			System.out.println("==============================================================");
			
			System.out.println("Enter Passenger TriCycle Brand....");
			String brand = sc.nextLine();
			
			System.out.println("Enter Passenger TriCycle Model....");
			String model = sc.nextLine();
			
			System.out.println("Enter Passenger TriCycle Registration Number....");
			String registrationNumber = sc.nextLine();
			
			System.out.println("Enter Passenger TriCycle Color....");
			String color = sc.nextLine();
			
			System.out.println("Enter Passenger TriCycle Manufacturing Year....");
			int manufacturingYear = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Passenger TriCycle price....");
			double price = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Passenger TriCycle fuel Capacity....");
			double fuel = Double.parseDouble(sc.nextLine());
							
			System.out.println("Enter Passenger TriCycle Speed....");
			double speed = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Pssenger TriCycle Passenger Capacity....");
			int passengercapacity = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Passenger Cargo Capacity In Kg....");
			double cargocapacityKg = Double.parseDouble(sc.nextLine());
			
			PassengerTricycle passengertricycle = new PassengerTricycle(brand, model, registrationNumber, color, manufacturingYear, price, fuel, speed, passengercapacity, cargocapacityKg);
			return passengertricycle;
			
		}else {
			
			System.out.println("Invalid Choice!Please Enter Valid Choice.... ");
			return selectAndGetThreeWheeler();
		}
	}
	
	private FourWheeler selectAndGetFourWheeler() {
		
		System.out.println("Press 1 ====> For Ambulance Van");
		System.out.println("Press 2 ====> For CNG Car");
		System.out.println("Press 3 ====> For Delivery Van");
		System.out.println("Press 4 ====> For Diesel Car");
		System.out.println("Press 5 ====> For Electric Car");
		System.out.println("Press 6 ====> For Hatchback Car");
		System.out.println("Press 7 ====> For Hybrid Car");
		System.out.println("Press 8 ====> For Jeep Vehicle");
		System.out.println("Press 9 ====> For Luxury Car");
		System.out.println("Press 10 ====> For Mini Van");
		System.out.println("Press 11 ==== For Pickup Truck");
		System.out.println("Press 12 ====> For Police Car");
		System.out.println("Press 13 ====> For Sedan Car");
		System.out.println("Press 14 ====> For Sports Car");
		System.out.println("Press 15 ====> For SUV Car");
		
		int choice = Integer.parseInt(sc.nextLine());
		
		if(choice == 1) {
			
			System.out.println("===========================================================");
			System.out.println("                 You Have Selected Ambulance Van           ");
			System.out.println("===========================================================");
			
			System.out.println("Enter Ambulane Van Brand....");
			String brand = sc.nextLine();
			
			System.out.println("Enter Ambulance Van Model....");
			String model = sc.nextLine();
			
			System.out.println("Enter Ambulance Van Registration Number....");
			String registrationNumber = sc.nextLine();
			
			System.out.println("Enter Ambulance Van Color....");
			String color = sc.nextLine();
			
			System.out.println("Enter Ambulance Van Manufacturing Year....");
			int manufacturingYear = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Ambulance Van price....");
			double price = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Ambulance Van fuel Capacity....");
			double fuelCapacity = Double.parseDouble(sc.nextLine());
							
			System.out.println("Enter Ambulance Van Speed....");
			double speed = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Ambulance Van Seating Capacity....");
			int seatingCapacity = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Ambulane Van Has First Aid Kit....");
			boolean hasFirstAidKit = Boolean.parseBoolean(sc.nextLine());
			
			System.out.println("Enter Ambulance Van Has Emergence Siren....");
			boolean hasEmergencySiren = Boolean.parseBoolean(sc.nextLine());
			
			System.out.println("Enter Ambulance Van Has Stretcher....");
			boolean hasStretcher = Boolean.parseBoolean(sc.nextLine());
			
			AmbulanceVan ambulancevan = new AmbulanceVan(brand, model, registrationNumber, color, manufacturingYear, price, fuelCapacity, speed, seatingCapacity, hasFirstAidKit, hasEmergencySiren, hasStretcher);
			return ambulancevan;
			
		}else if(choice == 2) {
			
			System.out.println("================================================================");
			System.out.println("                     You Have Selected CNG Car                  ");
			System.out.println("================================================================");
			
			System.out.println("Enter Ambulane Van Brand....");
			String brand = sc.nextLine();
			
			System.out.println("Enter Ambulance Van Model....");
			String model = sc.nextLine();
			
			System.out.println("Enter Ambulance Van Registration Number....");
			String registrationNumber = sc.nextLine();
			
			System.out.println("Enter Ambulance Van Color....");
			String color = sc.nextLine();
			
			System.out.println("Enter Ambulance Van Manufacturing Year....");
			int manufacturingYear = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Ambulance Van price....");
			double price = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Ambulance Van fuel Capacity....");
			double fuelCapacity = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Ambulance Van Petrol Tank Capacity....");
			double petrolTankCapacity = Double.parseDouble(sc.nextLine());
							
			System.out.println("Enter Ambulance Van Speed....");
			double speed = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Ambulance Van Seating Capacity....");
			int seatingCapacity = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Ambulane Van Fuel Type....");
			String fueltype = sc.nextLine();
			
			CNGCar cngCar = new CNGCar(brand, model, registrationNumber, color, manufacturingYear, price, fuelCapacity, petrolTankCapacity, speed, seatingCapacity, fueltype);
			return cngCar;
			
		}else if(choice == 3) {
			
			System.out.println("============================================================");
			System.out.println("                 You Have Selected Delivery Van             ");
			System.out.println("============================================================");
			
			System.out.println("Enter Delivery Van Brand....");
			String brand = sc.nextLine();
			
			System.out.println("Enter Delivery Van Model....");
			String model = sc.nextLine();
			
			System.out.println("Enter Delivery Van Registration Number....");
			String registrationNumber = sc.nextLine();
			
			System.out.println("Enter Delivery Van Color....");
			String color = sc.nextLine();
			
			System.out.println("Enter Delivery Van Manufacturing Year....");
			int manufacturingYear = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Delivery Van price....");
			double price = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Delivery Van fuel Capacity....");
			double fuelCapacity = Double.parseDouble(sc.nextLine());
									
			System.out.println("Enter Delivery Van Speed....");
			double speed = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Delivery Van Seating Capacity....");
			int seatingCapacity = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Delivery Van Cargo CapacityKg....");
			double cargoCapacityKg = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Delivery Van Cargo Volume Cubic Metres....");
			double cargoVolumeCubicMetres = Double.parseDouble(sc.nextLine());
			
			DeliveryVan deliveryvan = new DeliveryVan(brand, model, registrationNumber, color, manufacturingYear, price, fuelCapacity, speed, seatingCapacity, cargoCapacityKg, cargoVolumeCubicMetres);
			return deliveryvan;
			
		}else if(choice == 4) {
			
			System.out.println("============================================================");
			System.out.println("                 You Have Selected Diesel Car");
			System.out.println("============================================================");
			
			System.out.println("Enter Diesel Car Brand....");
			String brand = sc.nextLine();
			
			System.out.println("Enter Diesel Car Model....");
			String model = sc.nextLine();
			
			System.out.println("Enter Diesel Car Registration Number....");
			String registrationNumber = sc.nextLine();
			
			System.out.println("Enter Diesel Car Color....");
			String color = sc.nextLine();
			
			System.out.println("Enter Diesel Car Manufacturing Year....");
			int manufacturingYear = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Diesel car price....");
			double price = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Diesel Car fuel Capacity....");
			double fuelCapacity = Double.parseDouble(sc.nextLine());
									
			System.out.println("Enter Diesel Car Speed....");
			double speed = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Diesel Car Seating Capacity....");
			int seatingCapacity = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Diesel Car Engine Capacity....");
			double engineCapacity = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Diesel Car Fuel Type....");
			String fuelType = sc.nextLine();
			
			DieselCar dieselCar = new DieselCar(brand, model, registrationNumber, color, manufacturingYear, price, fuelCapacity, speed, seatingCapacity, engineCapacity, fuelType);
			return dieselCar;
			
		}else if(choice == 5) {
			
			System.out.println("============================================================");
			System.out.println("                 You Have Selected Electric Car");
			System.out.println("============================================================");
			
			System.out.println("Enter Electric Car Brand....");
			String brand = sc.nextLine();
			
			System.out.println("Enter Electric Car Model....");
			String model = sc.nextLine();
			
			System.out.println("Enter Electric Car Registration Number....");
			String registrationNumber = sc.nextLine();
			
			System.out.println("Enter Electric Car Color....");
			String color = sc.nextLine();
			
			System.out.println("Enter Electric Car Manufacturing Year....");
			int manufacturingYear = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Electric car price....");
			double price = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Electric Car Battery Capacity....");
			double batteryCapacity = Double.parseDouble(sc.nextLine());
									
			System.out.println("Enter Electric Car Speed....");
			double speed = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Electric Car Seating Capacity....");
			int seatingCapacity = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Electric Car Range Per Charge....");
			double rangePerCharge = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Electric Car Charging Type....");
			String chargingType = sc.nextLine();
			
			ElectricCar electriccar = new ElectricCar(brand, model, registrationNumber, color, manufacturingYear, price, batteryCapacity, speed, seatingCapacity, rangePerCharge, chargingType);
			return electriccar;
			
		}else if(choice == 6) {
			
			System.out.println("============================================================");
			System.out.println("                 You Have Selected Hatchback Car            ");
			System.out.println("============================================================");
			
			System.out.println("Enter Hatchback Car Brand....");
			String brand = sc.nextLine();
			
			System.out.println("Enter Hatchback Car Model....");
			String model = sc.nextLine();
			
			System.out.println("Enter Hatchback Car Registration Number....");
			String registrationNumber = sc.nextLine();
			
			System.out.println("Enter Hatchback Car Color....");
			String color = sc.nextLine();
			
			System.out.println("Enter Hatchback Car Manufacturing Year....");
			int manufacturingYear = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Hatchback car price....");
			double price = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Hatchback Car fuel Capacity....");
			double fuelCapacity = Double.parseDouble(sc.nextLine());
									
			System.out.println("Enter Hatchback Car Speed....");
			double speed = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Hatchback Car Seating Capacity....");
			int seatingCapacity = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Hatchback Car Boot Space....");
			double bootSpace = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Hatchback Car Transmission Type....");
			String transmissionType = sc.nextLine();
			
			HatchbackCar hatchbackCar = new HatchbackCar(brand, model, registrationNumber, color, manufacturingYear, price, fuelCapacity, speed, seatingCapacity, bootSpace, transmissionType);
			return hatchbackCar;
			
		}else if(choice == 7) {
			
			System.out.println("============================================================");
			System.out.println("                 You Have Selected Hybrid Car               ");
			System.out.println("============================================================");
			
			System.out.println("Enter Hybrid Car Brand....");
			String brand = sc.nextLine();
			
			System.out.println("Enter Hybrid Car Model....");
			String model = sc.nextLine();
			
			System.out.println("Enter Hybrid Car Registration Number....");
			String registrationNumber = sc.nextLine();
			
			System.out.println("Enter Hybrid Car Color....");
			String color = sc.nextLine();
			
			System.out.println("Enter Hybrid Car Manufacturing Year....");
			int manufacturingYear = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Hybrid car price....");
			double price = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Hybrid Car Fuel Capacity....");
			double fuelCapacity = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Hybrid Car Battery Capacity....");
			double batteryCapacity = Double.parseDouble(sc.nextLine());
									
			System.out.println("Enter Hybrid Car Speed....");
			double speed = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Hybrid Car Seating Capacity....");
			int seatingCapacity = Integer.parseInt(sc.nextLine());
					
			System.out.println("Enter Hybrid Car  Power Mode....");
			String powerMode = sc.nextLine();
			
			HybridCar hybridcar = new HybridCar(brand, model, registrationNumber, color, manufacturingYear, price, fuelCapacity, batteryCapacity, speed, seatingCapacity, powerMode);
			return hybridcar;
			
		}else if(choice == 8) {
			
			System.out.println("============================================================");
			System.out.println("                 You Have Selected Jeep Vehicle             ");
			System.out.println("============================================================");
			
			System.out.println("Enter Jeep Vehicle Brand....");
			String brand = sc.nextLine();
			
			System.out.println("Enter Jeep Vehicle Model....");
			String model = sc.nextLine();
			
			System.out.println("Enter Jeep Vehicle Registration Number....");
			String registrationNumber = sc.nextLine();
			
			System.out.println("Enter Jeep Vehicle Color....");
			String color = sc.nextLine();
			
			System.out.println("Enter Jeep Vehicle Manufacturing Year....");
			int manufacturingYear = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Jeep Vehicle price....");
			double price = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Jeep Vehicle fuel Capacity....");
			double fuelCapacity = Double.parseDouble(sc.nextLine());
									
			System.out.println("Enter Jeep Vehicle Speed....");
			double speed = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Jeep Vehicle Seating Capacity....");
			int seatingCapacity = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Jeep Vehicle Ground Clearence....");
			double groundClearence = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Jeep Vehicle Drive Type....");
			String driveType = sc.nextLine();
			
			JeepVehicle jeepvehicle = new JeepVehicle(brand, model, registrationNumber, color, manufacturingYear, price, fuelCapacity, speed, seatingCapacity, groundClearence, driveType);
			return jeepvehicle;
			
		}else if(choice == 9) {
			
			System.out.println("============================================================");
			System.out.println("                 You Have Selected Luxury Car               ");
			System.out.println("============================================================");
			
			System.out.println("Enter Luxury Car Brand....");
			String brand = sc.nextLine();
			
			System.out.println("Enter Luxury Car Model....");
			String model = sc.nextLine();
			
			System.out.println("Enter Luxury Car Registration Number....");
			String registrationNumber = sc.nextLine();
			
			System.out.println("Enter Luxury Car Color....");
			String color = sc.nextLine();
			
			System.out.println("Enter Luxury Car Manufacturing Year....");
			int manufacturingYear = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Luxury car price....");
			double price = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Luxury Car fuel Capacity....");
			double fuelCapacity = Double.parseDouble(sc.nextLine());
									
			System.out.println("Enter Luxury Car Speed....");
			double speed = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Luxury Car Seating Capacity....");
			int seatingCapacity = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Luxury Car Has Sun Roof....");
			boolean hasSunRoof = Boolean.parseBoolean(sc.nextLine());
			
			System.out.println("Enter Luxury Car Has Leather Seats....");
			boolean hasLeatherSeats = Boolean.parseBoolean(sc.nextLine());
			
			System.out.println("Enter Luxury Car Transmission Type....");
			String transmissionType = sc.nextLine();
			
			LuxuryCar luxurycar = new LuxuryCar(brand, model, registrationNumber, color, manufacturingYear, price, fuelCapacity, speed, seatingCapacity, hasSunRoof, hasLeatherSeats, transmissionType);
			return luxurycar;
			
		}else if(choice == 10) {
			
			System.out.println("============================================================");
			System.out.println("                 You Have Selected MiniVan                  ");
			System.out.println("============================================================");
			
			System.out.println("Enter Mini Van Brand....");
			String brand = sc.nextLine();
			
			System.out.println("Enter Mini Van Model....");
			String model = sc.nextLine();
			
			System.out.println("Enter Mini Van Registration Number....");
			String registrationNumber = sc.nextLine();
			
			System.out.println("Enter Mini Van Color....");
			String color = sc.nextLine();
			
			System.out.println("Enter Mini Van Manufacturing Year....");
			int manufacturingYear = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Mini Van price....");
			double price = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Mini Van fuel Capacity....");
			double fuelCapacity = Double.parseDouble(sc.nextLine());
									
			System.out.println("Enter Mini Van Speed....");
			double speed = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Mini Van Seating Capacity....");
			int seatingCapacity = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Mini Van Boot Space....");
			double bootSpace = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Mini Van Has Sliding Doors....");
			boolean hasSlidingDoors = Boolean.parseBoolean(sc.nextLine());
			
			MiniVan minivan = new MiniVan(brand, model, registrationNumber, color, manufacturingYear, price, fuelCapacity, speed, seatingCapacity, bootSpace, hasSlidingDoors);
			return minivan;
			
		}else if(choice == 11) {
			
			System.out.println("============================================================");
			System.out.println("                 You Have Selected Pich Up Truck            ");
			System.out.println("============================================================");
			
			System.out.println("Enter Pick Up Truck Brand....");
			String brand = sc.nextLine();
			
			System.out.println("Enter Pick Up Truck Model....");
			String model = sc.nextLine();
			
			System.out.println("Enter Pick Up Truck Registration Number....");
			String registrationNumber = sc.nextLine();
			
			System.out.println("Enter Pick Up Truck Color....");
			String color = sc.nextLine();
			
			System.out.println("Enter Pick Up Truck Manufacturing Year....");
			int manufacturingYear = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Pick Up Truck price....");
			double price = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Pick Up Truck fuel Capacity....");
			double fuelCapacity = Double.parseDouble(sc.nextLine());
									
			System.out.println("Enter Pick Up Truck Speed....");
			double speed = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Pick Up Truck Seating Capacity....");
			int seatingCapacity = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Pick Up Truck Payload CapacityKg....");
			double payloadCapacityKg = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Pick Up Truck Cargo Bed Length....");
			double cargoBedLength = Double.parseDouble(sc.nextLine());
			
			PickupTruck pickUpTruck = new PickupTruck(brand, model, registrationNumber, color, manufacturingYear, price, fuelCapacity, speed, seatingCapacity, payloadCapacityKg, cargoBedLength);
			return pickUpTruck;
			
		}else if(choice == 12) {
			
			System.out.println("============================================================");
			System.out.println("                 You Have Selected Police Car               ");
			System.out.println("============================================================");
			
			System.out.println("Enter Police Car Brand....");
			String brand = sc.nextLine();
			
			System.out.println("Enter Police Car Model....");
			String model = sc.nextLine();
			
			System.out.println("Enter Police Car Registration Number....");
			String registrationNumber = sc.nextLine();
			
			System.out.println("Enter Police Car Color....");
			String color = sc.nextLine();
			
			System.out.println("Enter Police Car Manufacturing Year....");
			int manufacturingYear = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Police car price....");
			double price = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Police Car fuel Capacity....");
			double fuelCapacity = Double.parseDouble(sc.nextLine());
									
			System.out.println("Enter Police Car Speed....");
			double speed = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Police Car Seating Capacity....");
			int seatingCapacity = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Police Car Has Siren....");
			boolean hasSiren = Boolean.parseBoolean(sc.nextLine());
			
			System.out.println("Enter Police Car Has Beacon Light....");
			boolean hasBeaconLight = Boolean.parseBoolean(sc.nextLine());
			
			System.out.println("Enter Police Car Department....");
			String department = sc.nextLine();
			
			PoliceCar policecar = new PoliceCar(brand, model, registrationNumber, color, manufacturingYear, price, fuelCapacity, speed, seatingCapacity, hasSiren, hasBeaconLight, department);
			return policecar;
			
		}else if(choice == 13) {
			
			System.out.println("============================================================");
			System.out.println("                 You Have Selected Sedan Car               ");
			System.out.println("============================================================");
			
			System.out.println("Enter Sedan Car Brand....");
			String brand = sc.nextLine();
			
			System.out.println("Enter Sedan Car Model....");
			String model = sc.nextLine();
			
			System.out.println("Enter Sedan Car Registration Number....");
			String registrationNumber = sc.nextLine();
			
			System.out.println("Enter Sedan Car Color....");
			String color = sc.nextLine();
			
			System.out.println("Enter Sedan Car Manufacturing Year....");
			int manufacturingYear = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Sedan car price....");
			double price = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Sedan Car fuel Capacity....");
			double fuelCapacity = Double.parseDouble(sc.nextLine());
									
			System.out.println("Enter Sedan Car Speed....");
			double speed = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Sedan Car Seating Capacity....");
			int seatingCapacity = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Sedan Car Boot Space....");
			double bootSspace = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Sedan Car Transmission Type....");
			String transmissionType = sc.nextLine();
			
			SedanCar sedancar = new SedanCar(brand, model, registrationNumber, color, manufacturingYear, price, fuelCapacity, speed, seatingCapacity, bootSspace, transmissionType);
			return sedancar;
			
		}else if(choice == 14) {
			
			System.out.println("============================================================");
			System.out.println("                 You Have Selected Sports Car               ");
			System.out.println("============================================================");
			
			System.out.println("Enter Sports Car Brand....");
			String brand = sc.nextLine();
			
			System.out.println("Enter Sports Car Model....");
			String model = sc.nextLine();
			
			System.out.println("Enter Sports Car Registration Number....");
			String registrationNumber = sc.nextLine();
			
			System.out.println("Enter Sports Car Color....");
			String color = sc.nextLine();
			
			System.out.println("Enter Sports Car Manufacturing Year....");
			int manufacturingYear = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Sports car price....");
			double price = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Sports Car fuel Capacity....");
			double fuelCapacity = Double.parseDouble(sc.nextLine());
									
			System.out.println("Enter Sports Car Speed....");
			double speed = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Sports Car Seating Capacity....");
			int seatingCapacity = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Sports Car Engine Capacity....");
			double engineCapacity = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Sports Car Drive Type....");
			String driveType = sc.nextLine();
			
			SportsCar sportsCar = new SportsCar(brand, model, registrationNumber, color, manufacturingYear, price, fuelCapacity, speed, seatingCapacity, engineCapacity, driveType);
			return sportsCar;
			
		}else if(choice == 15) {
			
			System.out.println("============================================================");
			System.out.println("                 You Have Selected SUV Car                  ");
			System.out.println("============================================================");
			
			System.out.println("Enter SUV Car Brand....");
			String brand = sc.nextLine();
			
			System.out.println("Enter SUV Car Model....");
			String model = sc.nextLine();
			
			System.out.println("Enter SUV Car Registration Number....");
			String registrationNumber = sc.nextLine();
			
			System.out.println("Enter SUV Car Color....");
			String color = sc.nextLine();
			
			System.out.println("Enter SUV Car Manufacturing Year....");
			int manufacturingYear = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter SUV car price....");
			double price = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter SUV Car fuel Capacity....");
			double fuelCapacity = Double.parseDouble(sc.nextLine());
									
			System.out.println("Enter SUV Car Speed....");
			double speed = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter SUV Car Seating Capacity....");
			int seatingCapacity = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter SUV Car Ground Clearence....");
			double groundClearence = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter SUV Car Drive Type....");
			String driveType = sc.nextLine();
			
			SUVCar suvCar = new SUVCar(brand, model, registrationNumber, color, manufacturingYear, price, fuelCapacity, speed, seatingCapacity, groundClearence, driveType);
			return suvCar;
			
		}else {
			
			System.out.println("Invalid Choice! Please Select Valid Choice....");
			return selectAndGetFourWheeler(); 
		}
	}
	
	public boolean doYouWantToContinue() {
		
		System.out.println("Press YES to Continue and NO to Exit");
		String choice = sc.nextLine();
		
		return choice.equalsIgnoreCase("yes");
	}

}
