package exceptionHandling;

import java.io.IOException;

public class ExceptionPrograme41 {

	public static void main(String[] args) throws IOException {
		test();
		System.out.println("abcd i am riding bicycle");
		System.out.println("i am eating at my relative");
		System.out.println("i am working");

	}
	public static void test() throws IOException{
	throw new IOException("/ by zero!!!!!!!!!!!");
	}

}
