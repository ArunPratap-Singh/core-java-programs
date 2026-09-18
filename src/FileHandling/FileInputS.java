package FileHandling;

import java.io.FileInputStream;

public class FileInputS {
	
	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("C:\\java Programe\\oop\\initialization getters setters\\Animal.java");
				
				
				){
			
			int x = fis.read();
			while(x != -1) {
				System.out.print((char)x);
				x=fis.read();
			}
			
			System.out.println("File Reading Was Successful");
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
			System.out.println("File Reading Was UnSuccessful");
		}
	}

}
