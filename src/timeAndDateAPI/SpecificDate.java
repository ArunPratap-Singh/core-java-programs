package timeAndDateAPI;

import java.time.LocalDate;
import java.time.Month;

public class SpecificDate {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2026, 10, 19);
		
		LocalDate date1 = LocalDate.of(2026, Month.OCTOBER, 21);
		
		System.out.println("Specific Date is: " +date);
		System.out.println("============");
		System.out.println("Specific Date is: " +date1);

	}

}
