package timeAndDateAPI;

import java.time.LocalDate;
import java.time.Month;

public class NumberOfDaysInYear {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 31);
		
		System.out.println("Date is: " +date);
		System.out.println("Number of days in January Month is: " +date.lengthOfYear());

	}

}
