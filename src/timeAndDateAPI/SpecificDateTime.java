package timeAndDateAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneOffset;

public class SpecificDateTime {

	public static void main(String[] args) {
		
		LocalDateTime dt = LocalDateTime.of(LocalDate.now(), LocalTime.now()); 
		
		LocalDateTime dt1 = LocalDateTime.of(2025, 04, 20, 20, 40);
		
		LocalDateTime dt2 = LocalDateTime.of(2026, Month.OCTOBER, 14, 15, 25);
		
		LocalDateTime dt3 = LocalDateTime.of(2021, 05, 22, 12, 14, 55);
		
		LocalDateTime dt4 = LocalDateTime.of(2020, Month.FEBRUARY, 29, 00, 15, 22);
		
		LocalDateTime dt5 = LocalDateTime.of(2026, 01, 10, 13, 20, 30, 40);
		
		LocalDateTime dt6 = LocalDateTime.of(2026, Month.APRIL, 30, 9, 51, 56, 11);
		
		LocalDateTime dt7 = LocalDateTime.ofEpochSecond(0, 0, ZoneOffset.UTC);
		
		System.out.println("Specific Date Time In Hour Minute is: " +dt);
		System.out.println("===========");
		System.out.println("Specific Date Time In Year Month day hour min is: " +dt1);
		System.out.println("============");
		System.out.println("Specific Date Time In Year Month Day Hour Minute is: " +dt2);
		System.out.println("=============");
		System.out.println("Specific Date Time In Year Month Day Hour Minute Second is: " +dt3);
		System.out.println("============");
		System.out.println("Specific Date Time In Year Month Day Hour Minute Second is: " +dt4);
		System.out.println("=============");
		System.out.println("Specific Date Time In Year Month Day Hour Minute Second NanoSecond is: " +dt5);
		System.out.println("==============");
		System.out.println("Specific Date Time In Year Month Day Hour Minute Second NanoSecond is: " +dt6);
		System.out.println("===========");
		System.out.println("Specific Date Time in Epoch Second Nano Second ZoneOffset is: " +dt7);

	}

}
