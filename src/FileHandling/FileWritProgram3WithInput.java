package FileHandling;

import java.io.FileWriter;
import java.util.Scanner;

public class FileWritProgram3WithInput {

	public static void main(String[] args) {
		
		try(FileWriter fw = new FileWriter("file.text", true);
			Scanner sc = new Scanner(System.in);	
				){
			
			System.out.println("Enter the Name: ");
			String name = sc.nextLine();
			System.out.println("Enter the Age: ");
			int age = Integer.parseInt(sc.nextLine());
			System.out.println("Enter the Weight: ");
			double weight = Double.parseDouble(sc.nextLine());
			System.out.println("Enter Phone Number: ");
			long phoneNumber = Long.parseLong(sc.nextLine());
			System.out.println("Enter Address");
			String address = sc.nextLine();
			System.out.println("Enter Adhaar Number: ");
			long adhaarNumber = Long.parseLong(sc.nextLine());
			System.out.println("Enter Pan Number: "); 
			String panNumber = sc.nextLine();
			System.out.println("Enter the gender: ");
			char gender = sc.nextLine().charAt(0);
			System.out.println(gender);
			System.out.println("Enter the city: ");
			String city = sc.nextLine();
			System.out.println("Are you Graduate?: ");
			boolean isgraduate = Boolean.parseBoolean(sc.nextLine());
			System.out.println("Enter the Email: ");
			String email = sc.nextLine();
			
			fw.write("Name is: " +name+"\n");
			fw.write("Age is: " +age+"\n");
			fw.write("Weight is: " +weight+"\n");
			fw.write("Phone Number is: " +phoneNumber+"\n");
			fw.write("Address is: " +address+"\n");
			fw.write("Adhaar Number is: " +adhaarNumber+"\n");
			fw.write("Pan Number is: " +panNumber+"\n");
			fw.write("Gender is: " +gender+"\n");
			fw.write("City is: " +city+"\n");
			fw.write("Email is: " +email+"\n");
			fw.write("Is Graduate : " +isgraduate+"\n");
			fw.write("============================\n");
			System.out.println("File Writing Successful");
			}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("File Writing is UnSuccessful");
		}

	}

}
