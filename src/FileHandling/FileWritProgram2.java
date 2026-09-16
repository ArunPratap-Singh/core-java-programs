package FileHandling;

import java.io.FileWriter;

public class FileWritProgram2 {

	public static void main(String[] args) {
		
		try {
		FileWriter fw = new FileWriter("file2.text", true);
		
		fw.write("Hello World\n");
		fw.write("String name\n");
		fw.write("int age\n");
		fw.write("int id\n");
		fw.close();
		System.out.println("File Writing is Successful");
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
			System.out.println("File Writing is Unsuccessful");
		}

	}

}
