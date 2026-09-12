package immutableClass;

public final class Employ {
	
	private final String name;
	private final int age;
	private final int salary;
	private final String address;
	private final int id;
	
	Employ(String name, int age, int salary, String address, int id){
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.address = address;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getSalary() {
		return salary;
	}
	public String getAddress() {
		return address;
	}
	public int getID() {
		return id;
	}

}
