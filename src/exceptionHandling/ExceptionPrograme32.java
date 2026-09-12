package exceptionHandling;

public class ExceptionPrograme32 {

	public static void main(String[] args) {
		System.out.println("Programe starts");
		
		int[] a = {12, 34};
		
		System.out.println(a[2]);
		
		//System.out.println(10/0);
		
		//throw new ArithmeticException("/ by Zero!!!!!!!!");
		throw new ArrayIndexOutOfBoundsException("Index 2 not found");


	}

}
