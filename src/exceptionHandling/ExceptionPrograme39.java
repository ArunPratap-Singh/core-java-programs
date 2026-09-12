package exceptionHandling;

import java.io.IOException;

public class ExceptionPrograme39 {

	public static void main(String[] args) {
		test();
		System.out.println("abcd i am riding bicycle");
		System.out.println("i am eating at my relative");
		System.out.println("i am working");


	}
	
	public static void test() {
		
		try {
			throw new IOException("/ by zero!!!!!!!!!!!!!");
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}

	}

}
