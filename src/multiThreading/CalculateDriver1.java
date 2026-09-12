package multiThreading;

public class CalculateDriver1 {

	public static void main(String[] args) {
		
		long num1 = 789456123l;
		long num2 = 789456123l;
		long num3 = 789456123l;
		long num4 = 789456123l;
		long num5 = 789456123l;
		
		long starttime = System.currentTimeMillis();
		System.out.println(starttime);
		
		long sum1 = Calculate.add(num1);
		long sum2 = Calculate.add(num2);
		long sum3 = Calculate.add(num3);
		long sum4 = Calculate.add(num4);
		long sum5 = Calculate.add(num5);
		long TotalSum = sum1+sum2+sum3+sum4+sum5;
		System.out.println("Total sum of a number is: " +TotalSum);
		
		long endtime = System.currentTimeMillis();
		System.out.println(endtime);
		
		long actualtime = (endtime-starttime);
		System.out.println("Total time used is: " +actualtime+"milliseconds");


	}

}
