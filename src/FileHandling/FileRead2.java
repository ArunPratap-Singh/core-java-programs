package FileHandling;

import java.io.FileReader;
import java.util.List;

public class FileRead2 {

	public static void main(String[] args) {
		
		try(FileReader fr = new FileReader("C:\\java Programe\\oop\\initialization getters setters\\Animal.java");
				
				){
			
			List<String> lines = fr.readAllLines();
			for(String line : lines )
				System.out.println(line);
			
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
			System.out.println("File Reading is Unsuccessful");
		}

	}

}
