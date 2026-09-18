package FileHandling;

import java.io.FileOutputStream;
import java.util.Scanner;

public class ScannerWriter {

	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("file5.txt");
			Scanner sc = new Scanner(System.in);	
				){
			
			System.out.println("======================================"); 
			System.out.println(" ENTER EMPLOYEE DETAILS"); 
			System.out.println("======================================"); 
			
			System.out.println("Enter Employee ID: "); 
			int employeeId = Integer.parseInt(sc.nextLine()); 
			
			System.out.println("Enter Employee Name: "); 
			String employeeName = sc.nextLine(); 
			
			System.out.println("Enter Age: "); 
			int age = Integer.parseInt(sc.nextLine()); 
			
			System.out.println("Enter Gender: "); 
			char gender = sc.nextLine().charAt(0); 
			
			System.out.println("Enter Department: "); 
			String department = sc.nextLine(); 
			
			System.out.println("Enter Designation: "); 
			String designation = sc.nextLine(); 
			
			System.out.println("Enter Salary: "); 
			double salary = Double.parseDouble(sc.nextLine()); 
			
			System.out.println("Enter Experience: "); 
			double experience = Double.parseDouble(sc.nextLine()); 
			
			System.out.println("Enter Phone Number: "); 
			long phoneNumber = Long.parseLong(sc.nextLine()); 
			
			System.out.println("Enter Email: "); 
			String email = sc.nextLine(); 
			
			System.out.println("Enter City: "); 
			String city = sc.nextLine(); 
			
			System.out.println("Enter Company Name: "); 
			String companyName = sc.nextLine(); 
			
			System.out.println("Enter Joining Year: "); 
			int joiningYear = Integer.parseInt(sc.nextLine()); 
			
			System.out.println("Enter Project Name: "); 
			String projectName = sc.nextLine(); 
			
			System.out.println("Enter Employment Type: "); 
			String employmentType = sc.nextLine(); 
			
			// Writing Employee Details into File 
			fos.write(("======================================\n").getBytes()); 
			fos.write((" EMPLOYEE DETAILS\n").getBytes()); 
			fos.write(("======================================\n").getBytes()); 
			
			fos.write(("Employee ID is : " + employeeId + "\n").getBytes()); 
			fos.write(("Employee Name is : " + employeeName + "\n").getBytes()); 
			fos.write(("Age is : " + age + "\n").getBytes()); 
			fos.write(("Gender is : " + gender + "\n").getBytes()); 
			fos.write(("Department is : " + department + "\n").getBytes()); 
			fos.write(("Designation is : " + designation + "\n").getBytes()); 
			fos.write(("Salary is : " + salary + "\n").getBytes()); 
			fos.write(("Experience is : " + experience + " years\n").getBytes()); 
			fos.write(("Phone Number is : " + phoneNumber + "\n").getBytes()); 
			fos.write(("Email is : " + email + "\n").getBytes()); 
			fos.write(("City is : " + city + "\n").getBytes()); 
			fos.write(("Company Name is : " + companyName + "\n").getBytes()); 
			fos.write(("Joining Year is : " + joiningYear + "\n").getBytes()); 
			fos.write(("Project Name is : " + projectName + "\n").getBytes()); 
			fos.write(("Employment Type : " + employmentType + "\n").getBytes()); 
			
			System.out.println("Employee details written successfully."); 
			System.out.println("File Writing is Successful");
			
			
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
			System.out.println("File Writing is Unsuccessful");
		}

	}

}
