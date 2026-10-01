package timeAndDateAPI;

import java.time.LocalDate;

public class DayOfYear {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2026, 10, 01);
		
		System.out.println("Current date is: " +date);
		
		System.out.println("Day of Year is: " +date.getDayOfYear());
		System.out.println("=================");
		System.out.println("Day of Year is: " +date.getDayOfMonth());

	}

}
