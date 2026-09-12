package objCount.WithSetterMethod;

public class Employ1 {
	
	String name;
	int age;
	double salary;
	
	
	
	public void setDetails(String name, int age, double salary){
		
		this.name = name;
		this.age = age;
		this.salary = salary;
		
	}
	
	public String getDetails() {
		
		return "Name is: " +name+"\tAge is: " +age+"\tSalary is: " +salary;
	}
	
	static int count = 0;
	
	{
		count++;
		System.out.println("Employ Object " +count+ " is Created");
	}

}
