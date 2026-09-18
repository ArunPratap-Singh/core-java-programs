package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriter12 {

	public static void main(String[] args) {
		
		try(FileWriter fw = new FileWriter("EmployDetails.txt", true);
			Scanner sc = new Scanner(System.in);
			BufferedWriter bw = new BufferedWriter(fw);
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
			
			// Writing data into file 
			bw.write("======================================"); 
			bw.newLine();
			
			bw.write(" EMPLOYEE DETAILS");
			bw.newLine();
			
			bw.write("======================================");
			bw.newLine();
			
			bw.write("Employee ID is : " + employeeId);
			bw.newLine();
			
			bw.write("Employee Name is : " + employeeName);
			bw.newLine();
			
			bw.write("Age is : " + age);
			bw.newLine();
			
			bw.write("Gender is : " + gender);
			bw.newLine();
			
			bw.write("Department is : " + department);
			bw.newLine();
			
			bw.write("Designation is : " + designation);
			bw.newLine();
			
			bw.write("Salary is : " + salary);
			bw.newLine();
			
			bw.write("Experience : " + experience + " years");
			bw.newLine(); 
			
			bw.write("Phone Number : " + phoneNumber);
			bw.newLine(); 
			
			bw.write("Email : " + email); 
			bw.newLine();
			
			bw.write("City : " + city);
			bw.newLine();
			
			bw.write("Company Name : " + companyName); 
			bw.newLine();
			
			bw.write("Joining Year : " + joiningYear);
			bw.newLine();
			
			bw.write("Project Name : " + projectName);
			bw.newLine(); 
			
			bw.write("Employment Type : " + employmentType);
			bw.newLine();
			
			bw.write("======================================");
			bw.newLine();
			
			System.out.println();
			System.out.println("File Writing is Successful");
		
			
			} catch (Exception e) { 
				System.out.println(e.getMessage()); 
				System.out.println("File Writing is UnSuccessful");
		}		

	}

}
