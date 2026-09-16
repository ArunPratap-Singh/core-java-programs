package FileHandling;

import java.io.FileWriter;

public class FileWritProgram1 {

	public static void main(String[] args) {
		
		try {
		FileWriter fw = new FileWriter("file1.text", true);
	
		fw.write("Hello World\n");
		fw.write("I Am a QA Engineer\n");
		fw.close();
		System.out.println("File Writing  is Successful!");
		
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
			System.out.println("File Writing is Unsuccessful!");
		}
		
		
		
	}

}
