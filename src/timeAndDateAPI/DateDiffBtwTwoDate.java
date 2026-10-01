package timeAndDateAPI;

import java.time.LocalDate;
import java.time.Period;

public class DateDiffBtwTwoDate {

	public static void main(String[] args) {
		
		LocalDate startdate = LocalDate.of(2026, 10, 26);
		
		LocalDate enddate = LocalDate.of(2029, 12, 28);
		
		Period period = Period.between(startdate, enddate);
		
		System.out.println("Start Date is: " +startdate);
		System.out.println("=========");
		System.out.println("End Date is: " +enddate);
		
		System.out.println("==========");
		
		System.out.println("Year is : " +period.getYears());
		System.out.println("=========");
		System.out.println("Month is: " +period.getMonths());
		System.out.println("============");
		System.out.println("Day is: " +period.getDays());

	}

}
