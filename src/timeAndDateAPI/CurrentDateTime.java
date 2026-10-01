package timeAndDateAPI;

import java.time.LocalDateTime;

public class CurrentDateTime {

	public static void main(String[] args) {
		
		LocalDateTime dt = LocalDateTime.now();
		
		System.out.println("Current Date And Time is: " +dt);

	}

}
