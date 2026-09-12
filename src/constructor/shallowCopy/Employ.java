package constructor.shallowCopy;

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
		
		//shallow copy
		Employ(Employ e){
			this.name = e.name;
			this.id = e.id;
			this.a = e.a;
		}
		public String toString() {
			return "Name is: " +name+"\tId is: " +id+"\tA is: " +a+"\t================";
		}

	

}
