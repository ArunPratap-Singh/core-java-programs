package anonymousClass.StudentDetails;

public class AnonymousClass {

	public static void main(String[] args) {
		
		Details student = new Details() {
			
			@Override
			public void displayDetails() {
				
				System.out.println("Student Name is:  Arunendra Pratap Singh" );
				System.out.println("Student ID is: ABC123");
				System.out.println("Student Age is: 33");
				System.out.println("Student Address is: Noida Sector 16");
				System.out.println("Student Phone Number is: 8975642312l");
				System.out.println("Student Adhaar Number is: 111122223333L");
				System.out.println("Student Course is: Software Testing");
				System.out.println("Student Specialization is: Automation Testing");
				
			}
		};
		
		Details employ = new Details() {
			
		   @Override
		   public void displayDetails() {

		    System.out.println("Employee Name     : Rahul Sharma");
		    System.out.println("Employee ID       : EMP101");
		    System.out.println("Age               : 28");
		    System.out.println("Gender            : Male");
		    System.out.println("Department        : Software Testing");
		    System.out.println("Designation       : Automation Test Engineer");
		    System.out.println("Company           : ABC Technologies");
		    System.out.println("Experience        : 3 Years");
		    System.out.println("Salary            : 65000");
		    System.out.println("Location          : Bangalore");
		}

	   };
	   
	   Details product = new Details() {
		
		@Override
		public void displayDetails() {
			
			System.out.println("Product Name      : Laptop");
		    System.out.println("Product ID        : P101");
		    System.out.println("Brand             : Dell");
		    System.out.println("Category          : Electronics");
		    System.out.println("Model             : Inspiron 15");
		    System.out.println("Price             : 55000");
		    System.out.println("Color             : Silver");
		    System.out.println("RAM               : 16 GB");
		    System.out.println("Storage           : 512 GB SSD");
		    System.out.println("Warranty          : 2 Years");
			
		}
	};
	
	Details car = new Details() {
		
		@Override
		public void displayDetails() {
			
			System.out.println("Car Name          : Creta");
		    System.out.println("Car Number        : UP32AB1234");
		    System.out.println("Brand             : Hyundai");
		    System.out.println("Model             : Creta");
		    System.out.println("Color             : White");
		    System.out.println("Fuel Type         : Petrol");
		    System.out.println("Engine             : 1497 cc");
		    System.out.println("Mileage           : 17 km/l");
		    System.out.println("Transmission      : Automatic");
		    System.out.println("Price             : 1800000");
			
		}
	};
	
	Details Bank = new Details() {
		
		@Override
		public void displayDetails() {
			
			System.out.println("Account Holder    : Rajesh Kumar");
		    System.out.println("Account Number    : 1234567890");
		    System.out.println("Account Type      : Savings");
		    System.out.println("Bank Name         : State Bank");
		    System.out.println("Branch            : Lucknow");
		    System.out.println("IFSC Code         : SBIN0001234");
		    System.out.println("Balance           : 85000");
		    System.out.println("Mobile Number     : 9876543210");
		    System.out.println("Account Status    : Active");
		    System.out.println("City              : Lucknow");
			
		}
	  };
	  
	  Details mobilePhone = new Details() {
		
		@Override
		public void displayDetails() {
			
			System.out.println("Mobile Name       : Galaxy S25");
		    System.out.println("Brand             : Samsung");
		    System.out.println("Model             : S25");
		    System.out.println("Price             : 75000");
		    System.out.println("Color             : Black");
		    System.out.println("RAM               : 12 GB");
		    System.out.println("Storage           : 256 GB");
		    System.out.println("Battery           : 5000 mAh");
		    System.out.println("Camera            : 50 MP");
		    System.out.println("Operating System  : Android");
			
		}
	};
	
	Details patient = new Details() {
		
		@Override
		public void displayDetails() {
			
			System.out.println("Patient Name      : Suresh Kumar");
		    System.out.println("Patient ID        : PT101");
		    System.out.println("Age               : 45");
		    System.out.println("Gender            : Male");
		    System.out.println("Blood Group       : B+");
		    System.out.println("Doctor Name       : Dr. Sharma");
		    System.out.println("Department        : Cardiology");
		    System.out.println("Room Number       : 205");
		    System.out.println("Admission Date    : 20-09-2026");
		    System.out.println("Patient Status    : Under Treatment");
		}
	};
	
	Details hotel = new Details() {
		
		@Override
		public void displayDetails() {
			
			 	System.out.println("Hotel Name        : Grand Palace");
			    System.out.println("Hotel ID          : H101");
			    System.out.println("Location          : Mumbai");
			    System.out.println("Room Number       : 305");
			    System.out.println("Room Type         : Deluxe");
			    System.out.println("Guest Name        : Rohan Singh");
			    System.out.println("Check-in Date     : 20-09-2026");
			    System.out.println("Check-out Date    : 23-09-2026");
			    System.out.println("Room Price        : 5000");
			    System.out.println("Booking Status    : Confirmed");
			
		}
	};
	
	Details course = new Details() {
		
		@Override
		public void displayDetails() {
			
			System.out.println("Course Name       : Automation Testing");
		    System.out.println("Course ID         : C101");
		    System.out.println("Instructor        : Amit Sharma");
		    System.out.println("Platform          : Online");
		    System.out.println("Duration          : 6 Months");
		    System.out.println("Level             : Intermediate");
		    System.out.println("Language          : English");
		    System.out.println("Fees              : 25000");
		    System.out.println("Mode              : Online");
		    System.out.println("Certificate       : Available");
			
		}
	};
	
	student.displayDetails();
	System.out.println("=================");
	product.displayDetails();
	System.out.println("=================");
	employ.displayDetails();
	System.out.println("=================");
	course.displayDetails();
	System.out.println("=================");
	hotel.displayDetails();
	System.out.println("=================");
	patient.displayDetails();
	System.out.println("=================");
	mobilePhone.displayDetails();
	System.out.println("=================");
	Bank.displayDetails();
	System.out.println("=================");
	car.displayDetails();
	   
	} 

}
