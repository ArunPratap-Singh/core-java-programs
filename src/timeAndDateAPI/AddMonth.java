package timeAndDateAPI;

import java.time.LocalDate;

public class AddMonth {

	public static void main(String[] args) {
		
		LocalDate month = LocalDate.of(2026, 5, 21);
		
		LocalDate newmonth = month.plusMonths(5);
		
		System.out.println("OriginalMonth is: " +month);
		System.out.println("=============");
		System.out.println("Month After Adding Month is: " +newmonth);

	}

}
