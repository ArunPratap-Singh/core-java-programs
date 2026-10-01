package timeAndDateAPI;

import java.time.LocalDate;
import java.time.Period;

public class FindAge {

	public static void main(String[] args) {
		
		LocalDate DOB = LocalDate.of(1993, 7, 26);
		LocalDate date = LocalDate.now();
		
		Period age = Period.between(DOB, date);
		
		System.out.println("Date of Birth is: " +DOB);
		System.out.println("============");
		System.out.println("Current Date is: " +date);
		
		System.out.println("============");
		System.out.println("Age is: " +age.getYears()+" Years " +age.getMonths()+" Months " +age.getDays()+" Days");

	}

}
