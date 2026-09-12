package constructor.deepCopy;

public class Students {

		String name;
		int id;
		Address a;
		
		Students(){
			
		}
		Students(String name, int id, Address a){
			this.name = name;
			this.id = id;
			this.a = a;
		}
		//Deep Copy
		Students(Students s){
			this.name = s.name;
			this.id = s.id;
			this.a = new Address();
			this.a.city = s.a.city;
			this.a.pin = s.a.pin;
			this.a.state = s.a.state;
		}
		public String toString() {
			return "Name is: " +name+"\tId is: " +id+"\tA is: " +a+"\n===================";
		}

	

}
