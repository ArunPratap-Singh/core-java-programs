package builderPattern;

public class Employ {
	
	private String name;
	private int age;
	private double salary;
	private String address;
	private int id;
	private int experience;
	
	private Employ(){
		
	}
	
	private Employ(String name, int age, double salary, String address, int id, int experience){
		
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.address = address;
		this.id = id;
		this.experience = experience;
	}
	
	private Employ(Builder b){
		
		this(b.name, b.age, b.salary, b.address, b.id, b.experience);
	}
	
	@Override
	public String toString() {
		
		return "Employ [Name is: " +name+ ", Age is: " +age+ ", Salary is: " +salary+ ", Address is: " +address+ ", Id is: " +id+ ", Experience is: " +experience+ "]";
	}
	
	static class Builder{
		
		private String name;
		private int age;
		private double salary;
		private String address;
		private int id;
		private int experience;
		
		public Builder setName(String name) {
			
			this.name = name;
			return this;
		}
		
		public Builder setAge(int age) {
			
			this.age = age;
			return this;
		}
		
		public Builder setSalary(double salary) {
			
			this.salary = salary;
			return this;
		}
		
		public Builder setAddress(String address) {
			
			this.address = address;
			return this;
		}
		
		public Builder setId(int id) {
			
			this.id = id;
			return this;
		}
		
		public Builder setExperience(int experience) {
			
			this.experience = experience;
			return this;
		}
		
		public Employ build() {
			
			return new Employ(this);
		}
	}
	
	
	

}
