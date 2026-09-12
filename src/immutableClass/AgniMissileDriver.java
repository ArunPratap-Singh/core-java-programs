package immutableClass;

public class AgniMissileDriver {

	public static void main(String[] args) {
		
		AgniMissile a1 = new AgniMissile("Agni I", "3500km", 500000, 3);
		AgniMissile a2 = new AgniMissile("Agni II", "4500km", 600000, 3);
		AgniMissile a3 = new AgniMissile("Agni III", "2500km", 600000, 4);
		AgniMissile a4 = new AgniMissile("Agni IV", "4500km", 600000, 4);
		AgniMissile a5= new AgniMissile("Agni V", "5500km", 500000, 4);
		AgniMissile a6 = new AgniMissile("Agni VI", "8500km", 900000, 4);
		
		System.out.println("==========AgniMissile a1 Details============");
		System.out.println("ObjectReference is: " +a1);
		System.out.println("Name is: " +a1.getName());
		System.out.println("Range is: " +a1.getRange());
		System.out.println("Price is: " +a1.getPrice());
		System.out.println("Stages is: " +a1.getStages());
		
		System.out.println("=================================================");
		
		System.out.println("==========AgniMissile a2 Details============");
		System.out.println("ObjectReference is: " +a2);
		System.out.println("Name is: " +a2.getName());
		System.out.println("Range is: " +a2.getRange());
		System.out.println("Price is: " +a2.getPrice());
		System.out.println("Stages is: " +a2.getStages());
		
		System.out.println("=================================================");
		
		System.out.println("==========AgniMissile a3 Details============");
		System.out.println("ObjectReference is: " +a3);
		System.out.println("Name is: " +a3.getName());
		System.out.println("Range is: " +a3.getRange());
		System.out.println("Price is: " +a3.getPrice());
		System.out.println("Stages is: " +a3.getStages());
		
		System.out.println("==========AgniMissile a4 Details============");
		System.out.println("ObjectReference is: " +a4);
		System.out.println("Name is: " +a4.getName());
		System.out.println("Range is: " +a4.getRange());
		System.out.println("Price is: " +a4.getPrice());
		System.out.println("Stages is: " +a4.getStages());
		
		System.out.println("=================================================");
		
		System.out.println("==========AgniMissile a5 Details============");
		System.out.println("ObjectReference is: " +a5);
		System.out.println("Name is: " +a5.getName());
		System.out.println("Range is: " +a5.getRange());
		System.out.println("Price is: " +a5.getPrice());
		System.out.println("Stages is: " +a5.getStages());
		
		System.out.println("=================================================");
		
		System.out.println("==========AgniMissile a6 Details============");
		System.out.println("ObjectReference is: " +a6);
		System.out.println("Name is: " +a6.getName());
		System.out.println("Range is: " +a6.getRange());
		System.out.println("Price is: " +a6.getPrice());
		System.out.println("Stages is: " +a6.getStages());

	}

}
