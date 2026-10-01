package timeAndDateAPI;

import java.time.LocalDate;

public class SubtractDate {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2026, 5, 26);
		
		LocalDate newdate = date.minusDays(10);
		
		System.out.println("Original Date is: " +date);
		System.out.println("==========");
		System.out.println("Date After Subtracting Days is: " +newdate);

	}

}
