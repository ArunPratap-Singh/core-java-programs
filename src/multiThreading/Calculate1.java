package multiThreading;

public class Calculate1 {
	
	public static long add(long n) {
		long sum = 0;
		
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		return sum;
	}

}
