package FileHandling;

import java.io.FileReader;

public class FileRead1 {

	public static void main(String[] args) {
		
		try(FileReader fr = new FileReader("C:\\java Programe\\oop\\initialization getters setters\\Animal.java");
				
				){
			
			String data = fr.readAllAsString();
			System.out.println(data);
			
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
			System.out.println("File Reading is Unsuccessful");
		}

	}

}
