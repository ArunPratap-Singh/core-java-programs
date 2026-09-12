package callByValue;

public class Employ {
	
	int age;
	double salary;
	
	
	public void setDetails(int age, double salary) {
		
		this.age = age;
		this.salary = salary;
		
	}
	
	public String getDetails() {
		
		return "Age is: " +age+"\tSalary is: " +salary;
	}

}
