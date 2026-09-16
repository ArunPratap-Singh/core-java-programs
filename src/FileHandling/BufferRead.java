package FileHandling;


import java.io.BufferedReader;
import java.io.FileReader;

public class BufferRead {

	public static void main(String[] args) {
		
		try(FileReader fr = new FileReader("C:\\java Programe\\oop\\initialization getters setters\\Animal.java");
			BufferedReader br = new BufferedReader(fr);	
				){
			
			int x = br.read();
			while(x != -1) {
				System.out.println((char)x);
				x = br.read();
			}
			System.out.println("File Reading is Successful");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("File Reading is Successful");
		}

	}

}
