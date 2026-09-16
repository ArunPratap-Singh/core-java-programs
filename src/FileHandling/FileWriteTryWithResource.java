package FileHandling;

import java.io.FileWriter;

public class FileWriteTryWithResource {

	public static void main(String[] args) {
		
		try(FileWriter fw = new FileWriter("File3.txt", true)
				
				
		){;
		
		fw.write("String name\n");
		fw.write("int age\n");
		fw.write("String address\n");
		fw.write("long mobilenumber\n");
		fw.write("long adhaarnumber\n");
		fw.write("double salary\n");
		fw.write("String company\n");
		fw.write("String post\n");
		
		System.out.println("File Writing is Successfull");
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
			System.out.println("File Writing is Unsuccessful");
			
		}

	}

}
