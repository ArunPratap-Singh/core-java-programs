package pojo;

public class EmployPojoDriver {

	public static void main(String[] args) {
		EmployPojo e1 = new EmployPojo("Mohan", 23, 101, "Noida", 123455556666L, 1234567891L, "TestYantra");
		EmployPojo e2 = new EmployPojo("Sohan", 25, 102, "Noida", 111122223333L, 7894561231L, "HCL Tech");
		EmployPojo e3 = new EmployPojo("Ram", 32, 103, "New Delhi", 222211115555l, 4561237897l, "Infosys");
		EmployPojo e4 = new EmployPojo("Shyam", 28, 104, "Lucknow", 888877779999L, 8456123789l, "TCS");
		EmployPojo e5 = new EmployPojo("Jayant", 45, 105, "Gaziabad", 963212547854L, 5896471235l,"ohky");
		
		System.out.println("======================================================");
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		System.out.println(e5);

	}

}
