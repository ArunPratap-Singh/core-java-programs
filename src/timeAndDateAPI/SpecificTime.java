package timeAndDateAPI;

import java.time.LocalTime;

public class SpecificTime {

	public static void main(String[] args) {
	
		LocalTime time = LocalTime.of(4, 52);
		
		LocalTime time1 = LocalTime.of(14, 22, 52);
		
		LocalTime time2 = LocalTime.of(20, 21, 38, 45);
		
		System.out.println("Current Hour Minute is: " +time);
		System.out.println("===========");
		System.out.println("Current Hour Minute Seconds is: " +time1);
		System.out.println("=============");
		System.out.println("Current Hour Minute Seconds NanoSeconds is: " +time2);

	}

}
