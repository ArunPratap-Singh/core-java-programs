package FileHandling;

import java.io.FileInputStream;
import java.util.Scanner;

public class ScannerReader {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("C:\\java Programe\\oop\\initialization getters setters\\Animal.java");
				Scanner sc= new Scanner(fis);
				){
			
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
			}
			System.out.println("File Reading is Successful!");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("File Reading is Unsuccessful!");
		}

	}

}
