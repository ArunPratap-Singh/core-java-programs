package project1;

import java.util.Scanner;
import java.util.Random;

public class RacingGameApp {

	private Scanner scanner;
	private ScoreBoard scoreBoard;
	private Random random;

	RacingGameApp() {

		scanner = new Scanner(System.in);
		scoreBoard = new ScoreBoard();
		random = new Random();
	}

	public void welcome() {

		System.out.println("\n");
		System.out.println("==============================================");
		System.out.println("         WELCOME TO JAVA RACING GAME        ");
		System.out.println("==============================================");
		System.out.println("          ENTER THE WORLD OF RACING!           ");
		System.out.println("==============================================");
	}

	public Vehicle selectAndGetVehicle(Person person) {

		System.out.println("\n========== SELECT VEHICLE ==========");

		System.out.println("Press 1 for Car");
		System.out.println("Press 2 for Sports Car");
		System.out.println("Press 3 for Cycle");
		System.out.println("Press 4 for Sports Cycle");
		System.out.println("Press 5 for Electric Cycle");
		System.out.println("Press 6 for Bus");
		System.out.println("Press 7 for Bike");
		System.out.println("Press 8 for Sports Bike");
		System.out.println("Press 9 for Train");

		System.out.print("\nEnter vehicle choice: ");

		int choice = scanner.nextInt();

		switch (choice) {

		case 1:
			return createCar(person);

		case 2:
			return createSportsCar(person);

		case 3:
			return createCycle(person);

		case 4:
			return createSportsCycle(person);

		case 5:
			return createElectricCycle(person);

		case 6:
			return createBus(person);

		case 7:
			return createBike(person);

		case 8:
			return createSportsBike(person);

		case 9:
			return createTrain(person);

		default:

			System.out.println("\nInvalid vehicle choice!");

			System.out.println("Please select a valid vehicle.");

			return selectAndGetVehicle(person);
		}
	}

	private Car createCar(Person person) {

		System.out.println("\n========== CREATE CAR ==========");

		System.out.print("Brand: ");
		String brand = scanner.next();

		System.out.print("Model: ");
		String model = scanner.next();

		System.out.print("Color: ");
		String color = scanner.next();

		System.out.print("Starting Speed: ");
		double speed = scanner.nextDouble();

		System.out.print("Maximum Speed: ");
		double maxSpeed = scanner.nextDouble();

		System.out.print("Fuel Capacity: ");
		double fuel = scanner.nextDouble();

		System.out.print("Price: ");
		double price = scanner.nextDouble();

		System.out.print("Number of Doors: ");
		int doors = scanner.nextInt();

		System.out.print("Automatic? true/false: ");
		boolean automatic = scanner.nextBoolean();

		Car car = new Car(101, brand, model, color, speed, maxSpeed, fuel, price, doors, automatic);

		car.setDriver(person);

		return car;
	}

	private SportsCar createSportsCar(Person person) {

		System.out.println("\n========== CREATE SPORTS CAR ==========");

		System.out.print("Brand: ");
		String brand = scanner.next();

		System.out.print("Model: ");
		String model = scanner.next();

		System.out.print("Color: ");
		String color = scanner.next();

		System.out.print("Starting Speed: ");
		double speed = scanner.nextDouble();

		System.out.print("Maximum Speed: ");
		double maxSpeed = scanner.nextDouble();

		System.out.print("Fuel Capacity: ");
		double fuel = scanner.nextDouble();

		System.out.print("Price: ");
		double price = scanner.nextDouble();

		System.out.print("Doors: ");
		int doors = scanner.nextInt();

		System.out.print("Automatic? true/false: ");
		boolean automatic = scanner.nextBoolean();

		System.out.print("Turbo? true/false: ");
		boolean turbo = scanner.nextBoolean();

		System.out.print("Horsepower: ");
		int horsepower = scanner.nextInt();

		SportsCar car = new SportsCar(102, brand, model, color, speed, maxSpeed, fuel, price, doors, automatic, turbo, horsepower);

		car.setDriver(person);

		return car;
	}

	private Cycle createCycle(Person person) {

		System.out.println("\n========== CREATE CYCLE ==========");

		System.out.print("Brand: ");
		String brand = scanner.next();

		System.out.print("Model: ");
		String model = scanner.next();

		System.out.print("Color: ");
		String color = scanner.next();

		System.out.print("Starting Speed: ");
		double speed = scanner.nextDouble();

		System.out.print("Maximum Speed: ");
		double maxSpeed = scanner.nextDouble();

		System.out.print("Gears: ");
		int gears = scanner.nextInt();

		System.out.print("Price: ");
		double price = scanner.nextDouble();

		System.out.print("Gear System? true/false: ");
		boolean gearSystem = scanner.nextBoolean();

		Cycle cycle = new Cycle(103, brand, model, color, speed, maxSpeed, 0, price, gears, gearSystem);

		cycle.setDriver(person);

		return cycle;
	}

	private SportsCycle createSportsCycle(Person person) {

		System.out.println("\n========== CREATE SPORTS CYCLE ==========");

		System.out.print("Brand: ");
		String brand = scanner.next();

		System.out.print("Model: ");
		String model = scanner.next();

		System.out.print("Color: ");
		String color = scanner.next();

		System.out.print("Starting Speed: ");
		double speed = scanner.nextDouble();

		System.out.print("Maximum Speed: ");
		double maxSpeed = scanner.nextDouble();

		System.out.print("Gears: ");
		int gears = scanner.nextInt();

		System.out.print("Price: ");
		double price = scanner.nextDouble();

		System.out.print("Gear System? true/false: ");
		boolean gearSystem = scanner.nextBoolean();

		System.out.print("Aerodynamic? true/false: ");
		boolean aerodynamic = scanner.nextBoolean();

		System.out.print("Lightweight Level: ");
		int lightweight = scanner.nextInt();

		SportsCycle cycle = new SportsCycle(104, brand, model, color, speed, maxSpeed, 0, price, gears, gearSystem, aerodynamic, lightweight);

		cycle.setDriver(person);

		return cycle;
	}

	private ElectricCycle createElectricCycle(Person person) {

		System.out.println("\n========== CREATE ELECTRIC CYCLE ==========");

		System.out.print("Brand: ");
		String brand = scanner.next();

		System.out.print("Model: ");
		String model = scanner.next();

		System.out.print("Color: ");
		String color = scanner.next();

		System.out.print("Starting Speed: ");
		double speed = scanner.nextDouble();

		System.out.print("Maximum Speed: ");
		double maxSpeed = scanner.nextDouble();

		System.out.print("Price: ");
		double price = scanner.nextDouble();

		System.out.print("Battery Capacity: ");
		int battery = scanner.nextInt();

		System.out.print("Pedal Assist? true/false: ");
		boolean pedalAssist = scanner.nextBoolean();

		ElectricCycle cycle = new ElectricCycle(105, brand, model, color, speed, maxSpeed, 0, price, battery, pedalAssist);
 
		cycle.setDriver(person);

		return cycle;
	}

	private Bus createBus(Person person) {

		System.out.println("\n========== CREATE BUS ==========");

		System.out.print("Brand: ");
		String brand = scanner.next();

		System.out.print("Model: ");
		String model = scanner.next();

		System.out.print("Color: ");
		String color = scanner.next();

		System.out.print("Starting Speed: ");
		double speed = scanner.nextDouble();

		System.out.print("Maximum Speed: ");
		double maxSpeed = scanner.nextDouble();

		System.out.print("Fuel Capacity: ");
		double fuel = scanner.nextDouble();

		System.out.print("Price: ");
		double price = scanner.nextDouble();

		System.out.print("Passenger Capacity: ");
		int passengers = scanner.nextInt();

		System.out.print("Air Conditioned? true/false: ");
		boolean ac = scanner.nextBoolean();

		Bus bus = new Bus(106, brand, model, color, speed, maxSpeed, fuel, price, passengers, ac);

		bus.setDriver(person);

		return bus;
	}

	private Bike createBike(Person person) {

		System.out.println("\n========== CREATE BIKE ==========");

		System.out.print("Brand: ");
		String brand = scanner.next();

		System.out.print("Model: ");
		String model = scanner.next();

		System.out.print("Color: ");
		String color = scanner.next();

		System.out.print("Starting Speed: ");
		double speed = scanner.nextDouble();

		System.out.print("Maximum Speed: ");
		double maxSpeed = scanner.nextDouble();

		System.out.print("Fuel Capacity: ");
		double fuel = scanner.nextDouble();

		System.out.print("Price: ");
		double price = scanner.nextDouble();

		System.out.print("Engine CC: ");
		int cc = scanner.nextInt();

		System.out.print("ABS? true/false: ");
		boolean abs = scanner.nextBoolean();

		Bike bike = new Bike(107, brand, model, color, speed, maxSpeed, fuel, price, cc, abs);

		bike.setDriver(person);

		return bike;
	}

	private SportsBike createSportsBike(Person person) {

		System.out.println("\n========== CREATE SPORTS BIKE ==========");

		System.out.print("Brand: ");
		String brand = scanner.next();

		System.out.print("Model: ");
		String model = scanner.next();

		System.out.print("Color: ");
		String color = scanner.next();

		System.out.print("Starting Speed: ");
		double speed = scanner.nextDouble();

		System.out.print("Maximum Speed: ");
		double maxSpeed = scanner.nextDouble();

		System.out.print("Fuel Capacity: ");
		double fuel = scanner.nextDouble();

		System.out.print("Price: ");
		double price = scanner.nextDouble();

		System.out.print("Engine CC: ");
		int cc = scanner.nextInt();

		System.out.print("ABS? true/false: ");
		boolean abs = scanner.nextBoolean();

		System.out.print("Turbo? true/false: ");
		boolean turbo = scanner.nextBoolean();

		System.out.print("Racing Mode: ");
		int racingMode = scanner.nextInt();

		SportsBike bike = new SportsBike(108, brand, model, color, speed, maxSpeed, fuel, price, cc, abs, turbo, racingMode);

		bike.setDriver(person);

		return bike;
	}

	private Train createTrain(Person person) {

		System.out.println("\n========== CREATE TRAIN ==========");

		System.out.print("Brand: ");
		String brand = scanner.next();

		System.out.print("Model: ");
		String model = scanner.next();

		System.out.print("Color: ");
		String color = scanner.next();

		System.out.print("Starting Speed: ");
		double speed = scanner.nextDouble();

		System.out.print("Maximum Speed: ");
		double maxSpeed = scanner.nextDouble();

		System.out.print("Fuel Capacity: ");
		double fuel = scanner.nextDouble();

		System.out.print("Price: ");
		double price = scanner.nextDouble();

		System.out.print("Number of Coaches: ");
		int coaches = scanner.nextInt();

		System.out.print("Electric Engine? true/false: ");
		boolean electric = scanner.nextBoolean();

		Train train = new Train(109, brand, model, color, speed, maxSpeed, fuel, price, coaches, electric);

		train.setDriver(person);

		return train;
	}

	public void customizeVehicle(Vehicle vehicle) {

		System.out.println("\n========== VEHICLE CUSTOMIZATION ==========");

		System.out.println("1. Change Color");
		System.out.println("2. Upgrade Vehicle");
		System.out.println("3. Use Nitro");
		System.out.println("4. Repair Vehicle");
		System.out.println("5. Refuel");
		System.out.println("6. Show Vehicle");
		System.out.println("7. Continue");

		System.out.print("Choose option: ");

		int choice = scanner.nextInt();

		switch (choice) {

		case 1:

			System.out.print("Enter new color: ");

			String color = scanner.next();

			vehicle.changeColor(color);

			break;

		case 2:

			vehicle.upgradeVehicle();

			break;

		case 3:

			vehicle.useNitro();

			break;

		case 4:

			vehicle.repair();

			break;

		case 5:

			vehicle.refuel();

			break;

		case 6:

			System.out.println(vehicle);

			break;

		case 7:

			return;

		default:

			System.out.println("Invalid option.");

			customizeVehicle(vehicle);
		}

		if (choice != 7) {
			customizeVehicle(vehicle);
		}
	}

	public void startRace(Person person, Vehicle vehicle) {

		System.out.println("\n==============================================");
		System.out.println("                  RACE STARTING                  ");
		System.out.println("==============================================");

		vehicle.startEngine();

		person.playRace();

		System.out.println("\n3...");
		System.out.println("2...");
		System.out.println("1...");
		System.out.println("GOOOOOOO!");

		vehicle.drive();

		int playerScore = vehicle.race();

		int opponentScore = random.nextInt(120) + 40;

		System.out.println("\n========== RACE RESULT ==========");

		System.out.println("Your Score : " + playerScore);
		System.out.println("Opponent Score : " + opponentScore);

		if (playerScore > opponentScore) {

			System.out.println("YOU WON THE RACE!");

			person.recordWin(playerScore);

			scoreBoard.addResult(new RaceResult(person.getName(), vehicle.getBrand() + " " + vehicle.getModel(), playerScore, "WIN"));

		} else if (playerScore < opponentScore) {

			System.out.println("YOU LOST THE RACE.");

			person.recordLoss(playerScore);

			scoreBoard.addResult(new RaceResult(person.getName(), vehicle.getBrand() + " " + vehicle.getModel(), playerScore, "LOSS"));

		} else {

			System.out.println("RACE DRAW!");

			scoreBoard.addResult(new RaceResult(person.getName(), vehicle.getBrand() + " " + vehicle.getModel(), playerScore, "DRAW"));
		}

		vehicle.stopEngine();

		System.out.println("\nRace completed!");
	}

	public ScoreBoard getScoreBoard() {

		return scoreBoard;
	}

	public Scanner getScanner() {

		return scanner;
	}
}
