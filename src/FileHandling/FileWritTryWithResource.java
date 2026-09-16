package FileHandling;

import java.io.FileOutputStream;
import java.util.Scanner;

public class FileWritTryWithResource {

	public static void main(String[] args) {
		
		try(FileOutputStream fw = new FileOutputStream("file4.txt");
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
			
			fw.write(("Name is: " +name+"\n").getBytes());
			fw.write(("Age is: " +age+"\n").getBytes());
			fw.write(("Weight is: " +weight+"\n").getBytes());
			fw.write(("Phone Number is: " +phoneNumber+"\n").getBytes());
			fw.write(("Address is: " +address+"\n").getBytes());
			fw.write(("Adhaar Number is: " +adhaarNumber+"\n").getBytes());
			fw.write(("Pan Number is: " +panNumber+"\n").getBytes());
			fw.write(("Gender is: " +gender+"\n").getBytes());
			fw.write(("City is: " +city+"\n").getBytes());
			fw.write(("Email is: " +email+"\n").getBytes());
			fw.write(("Is Graduate : " +isgraduate+"\n").getBytes());
			fw.write(("==========================\n").getBytes());
			System.out.println("File Writing Successful");
			}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("File Writing is UnSuccessful");	
			
		}

	}

}
