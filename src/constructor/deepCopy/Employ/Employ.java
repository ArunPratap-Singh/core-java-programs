package constructor.deepCopy.Employ;

public class Employ {


		String name;
		int id;
		Address a;
		
		Employ(){
			
		}
		Employ(String name, int id, Address a){
			this.name = name;
			this.id = id;
			this.a = a;
		}
		
		//deep copy
		Employ(Employ e){
			this.name = e.name;
			this.id = e.id;
			this.a = new Address();
			this.a.city = e.a.city;
			this.a.state = e.a.state;
			this.a.pin = e.a.pin;
		}
		
		public String toString() {
			return "Name is: " +name+"\tId is: " +id+"\tA is: " +a+"\t================";
		}

	

}
