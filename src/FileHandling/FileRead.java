package FileHandling;

import java.io.FileReader;

//reading all characters
public class FileRead {

	public static void main(String[] args) {
		
		try(FileReader fr = new FileReader("C:\\java Programe\\oop\\initialization getters setters\\Animal.java");
				
				){
			int x = fr.read();
			while(x !=-1) {
				System.out.println((char)x);
				x= fr.read();
			}
			
			
			System.out.println("File Reading is successful");
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
			System.out.println("File Reading is UnSuccessful");
		}

	}

}
