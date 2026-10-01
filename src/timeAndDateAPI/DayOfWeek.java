package timeAndDateAPI;

import java.time.LocalDate;

public class DayOfWeek {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2026, 10, 01);
		
		System.out.println("Current date is: " +date);
		
		System.out.println("Day of Week is: " +date.getDayOfWeek());
		System.out.println("=============");
		System.out.println("Day of Week is: " +date.getDayOfWeek().getValue());

	}

}
