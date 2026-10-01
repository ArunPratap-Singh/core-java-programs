package timeAndDateAPI;

import java.time.LocalDate;

public class YearMonthDay {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		
		System.out.println("Current Day is: " +date.getDayOfMonth());
		System.out.println("==================");
		System.out.println("Current Month is: " +date.getMonth());
		System.out.println("Current Month is: " +date.getMonthValue());
		System.out.println("===================");
		System.out.println("Current Year is: " +date.getYear());

	}

}
