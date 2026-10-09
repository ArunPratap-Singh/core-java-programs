package interfaceProgram;

public class Driver {
	
	public static void main(String[] args) {
		
		Game game = new Game();
		
		do {
			game.start();
		}while(game.doYouWantToContinue());
		
		System.out.println("Thank you for playing the game! Game Ends");
	}

}
