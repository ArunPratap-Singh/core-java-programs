package timeAndDateAPI;

import java.time.LocalDate;
import java.time.Month;

public class AddDayToDate {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2026, Month.OCTOBER, 01);
		
		LocalDate newdate = date.plusDays(15);
		
		System.out.println("Original Date is: " +date);
		System.out.println("============");
		System.out.println("Date After Adding is: " +newdate);

	}

}
