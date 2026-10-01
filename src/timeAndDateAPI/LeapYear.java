package timeAndDateAPI;

import java.time.LocalDate;
import java.time.Year;

public class LeapYear {

	public static void main(String[] args) {
		
		int year = 2026;
		
		boolean result = Year.isLeap(year);
		
		System.out.println("Is Leap Year: " +result);
		
		LocalDate date = LocalDate.of(2020, 10, 01);
		
		boolean result1 = date.isLeapYear();
		
		System.out.println("Is Leap year : " +result1);

	}

}
