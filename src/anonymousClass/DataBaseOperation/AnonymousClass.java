package anonymousClass.DataBaseOperation;

public class AnonymousClass {

	public static void main(String[] args) {
		
		DataBaseOperation data = new DataBaseOperation() {
			
			@Override
			public void updateData() {
				
				System.out.println("Student data updated in database");
				
			}
			
			@Override
			public void insertData() {
				
				System.out.println("Student data inserted in database");
				
			}
			
			@Override
			public void fetchData() {
				
				System.out.println("Student data fetched from database");
				
			}
			
			@Override
			public void deleteData() {
				
				System.out.println("StudentData deleted from database");
				
			}
		};
		
		data.updateData();
		System.out.println("============");
		data.insertData();
		System.out.println("============");
		data.fetchData();
		System.out.println("============");
		data.deleteData();

	}

}
