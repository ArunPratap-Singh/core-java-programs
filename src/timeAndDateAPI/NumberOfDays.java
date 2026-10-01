package timeAndDateAPI;

import java.time.LocalDate;
import java.time.Month;

public class NumberOfDays {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2026, Month.NOVEMBER, 18);
		
		System.out.println("Date is: " +date);
		System.out.println("Number of days in November Month is: " +date.lengthOfMonth());

	}

}
