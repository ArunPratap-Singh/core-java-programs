package timeAndDateAPI;

import java.time.LocalDate;

public class SubtractYear {

	public static void main(String[] args) {
		
		LocalDate year = LocalDate.of(2026, 5, 21);
		
		LocalDate newyear = year.minusYears(5);
		
		System.out.println("OriginalYear is: " +year);
		System.out.println("=============");
		System.out.println("Year After Adding Year is: " +newyear);

	}

}
