package encapsulationsPrograming;

public class Person {
	
		private String name;
		private int age;
		private String gender;
		private String city;
		private String occupation;
		
		Person() {
			
		}	

		Person(String name, int age, String gender, String city, String occupation) {

			this.name = name;
			this.age = age;
			this.gender = gender;
			this.city = city;
			this.occupation = occupation;
		}

		public void setName(String name) {
			if(name.length() > 3 && name.length() <= 50 && !name.isBlank() && name.matches("[A-Z a-z \s]+"))
				this.name = name;
			else
				System.out.println("Wrong name entered");
		}

		public String getName() {
			return name;
		}

		public void setAge(int age) {
			if(age > 0 && age <= 100)
				this.age = age;
			else
				System.out.println("Wrong age entered");
		}

		public int getAge() {
			return age;
		}

		public void setGender(String gender) {
			if(gender.length() > 2 && gender.length() <= 20 && !gender.isBlank() && gender.matches("[A-Z a-z]+"))
				this.gender = gender;
			else
				System.out.println("Wrong gender entered");
		}

		public String getGender() {
			return gender;
		}

		public void setCity(String city) {
			if(city.length() > 2 && city.length() <= 50 && !city.isBlank() && city.matches("[A-Z a-z]+"))
				this.city = city;
			else
				System.out.println("Wrong city entered");
		}

		public String getCity() {
			return city;
		}

		public void setOccupation(String occupation) {
			if(occupation.length() > 2 && occupation.length() <= 50 && !occupation.isBlank() && occupation.matches("[A-Z a-z \s]+"))
				this.occupation = occupation;
			else
				System.out.println("Wrong occupation entered");
		}

		public String getOccupation() {
			return occupation;
		}
	

}
