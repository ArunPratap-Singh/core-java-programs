package project1;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("==============================================");
		System.out.println("             PLAYER REGISTRATION              ");
		System.out.println("==============================================");

		System.out.print("Enter Player ID: ");
		int id = scanner.nextInt();

		System.out.print("Enter Name: ");
		String name = scanner.next();

		System.out.print("Enter Age: ");
		int age = scanner.nextInt();

		System.out.print("Enter Country: ");
		String country = scanner.next();

		Person player = new Person(id, name, age, country);

		RacingGameApp game = new RacingGameApp();

		game.welcome();

		System.out.println(player);

		boolean playing = true;

		while (playing) {

			System.out.println("\n===============================================");
			System.out.println("                   MAIN GAME MENU                ");
			System.out.println("==================================================");

			System.out.println("Press 1 to Select Vehicle");
			System.out.println("Press 2 to View Player Profile");
			System.out.println("Press 3 to View Scoreboard");
			System.out.println("Press 4 to Exit Game");

			System.out.print("Enter choice: ");

			int choice = scanner.nextInt();

			switch (choice) {

			case 1:

				Vehicle vehicle = game.selectAndGetVehicle(player);

				System.out.println("\nVehicle successfully selected!");

				System.out.println(vehicle);

				vehicle.drive();

				if (vehicle instanceof SportsBike) {

					SportsBike sportsBike = (SportsBike) vehicle;

					System.out.println("\n🏁 SportsBike specific features available.");

					sportsBike.useNitro();
				}

				if (vehicle instanceof ElectricCycle) {

					ElectricCycle electricCycle = (ElectricCycle) vehicle;

					electricCycle.chargeBattery();
				}

				boolean vehicleMenu = true;

				while (vehicleMenu) {

					System.out.println("\n========== VEHICLE MENU ==========");

					System.out.println("1. Customize Vehicle");
					System.out.println("2. Start Race");
					System.out.println("3. Show Vehicle Details");
					System.out.println("4. Back to Main Menu");

					System.out.print("Enter choice: ");

					int vehicleChoice = scanner.nextInt();

					switch (vehicleChoice) {

					case 1:

						game.customizeVehicle(vehicle);

						break;

					case 2:

						game.startRace(player, vehicle);

						break;

					case 3:

						System.out.println(vehicle);

						break;

					case 4:

						vehicleMenu = false;

						break;

					default:

						System.out.println("Invalid option.");
					}
				}

				break;

			case 2:

				System.out.println(player);

				break;

			case 3:

				game.getScoreBoard().displayScoreBoard();

				System.out.println("Total Score: " + game.getScoreBoard().getTotalScore());

				break;

			case 4:

				System.out.println("\n==============================================");
				System.out.println("                THANK YOU FOR PLAYING!             ");
				System.out.println("==============================================");

				System.out.println("Player: " + player.getName());
				System.out.println("Total Races: " + player.getTotalRaces());
				System.out.println("Wins: " + player.getWins());
				System.out.println("Losses: " + player.getLosses());
				System.out.println("Total Score: " + player.getTotalScore());
				System.out.println("=========GAME OVER==========");

				playing = false;
				break;

			default:

				System.out.println("Invalid option. Try again.");
			}
		}

		scanner.close();
	}
}
