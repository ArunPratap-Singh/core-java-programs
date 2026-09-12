package callByReference;

public class EmployService {
	
	//This Class Is Also Called Utility class
	public static void setDetails(Employ x, int age, double salary) {
		
		x.age = age;
		x.salary = salary;
	}
	
	public static String getDetails(Employ x) {
		
		return "Age is: " +x.age+"\tSalary is: " +x.salary; 
	}

}
