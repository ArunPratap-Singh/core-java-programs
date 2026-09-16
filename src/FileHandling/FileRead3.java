package FileHandling;

import java.io.FileReader;

public class FileRead3 {

	public static void main(String[] args) {
		int count =0;
		try(FileReader fr = new FileReader("C:\\java Programe\\oop\\initialization getters setters\\Animal.java");
				
				){
			int x = fr.read();
			while(x !=-1) {
				if(x>=48 && x<=57)
				count++;
				x= fr.read();
			}
			
			System.out.println(count);
			System.out.println("File Reading is successful");
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
			System.out.println("File Reading is UnSuccessful");
		}

	}

}
