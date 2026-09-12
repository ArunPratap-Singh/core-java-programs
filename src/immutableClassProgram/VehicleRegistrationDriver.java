package immutableClassProgram;

public class VehicleRegistrationDriver {

	public static void main(String[] args) {

		VehicleRegistration v1 = new VehicleRegistration(101, "Rahul Sharma", "UP32AB1234", "Car", "Toyota Fortuner", "09-09-2026", "Active");
		VehicleRegistration v2 = new VehicleRegistration(102, "Priya Verma", "UP32CD5678", "Car", "Honda City", "08-09-2026", "Active");
		VehicleRegistration v3 = new VehicleRegistration(103, "Amit Singh", "UP32EF9012", "Bike", "Royal Enfield Classic 350", "07-09-2026", "Active");
		VehicleRegistration v4 = new VehicleRegistration(104, "Neha Gupta", "UP32GH3456", "Car", "Hyundai Creta", "06-09-2026", "Active");
		VehicleRegistration v5 = new VehicleRegistration(105, "Rohit Kumar", "UP32IJ7890", "Bike", "Honda Activa 6G", "05-09-2026", "Active");
		VehicleRegistration v6 = new VehicleRegistration(106, "Anjali Mishra", "UP32KL2345", "Car", "Maruti Suzuki Swift", "04-09-2026", "Expired");
		VehicleRegistration v7 = new VehicleRegistration(107, "Vikas Yadav", "UP32MN6789", "SUV", "Mahindra Scorpio", "03-09-2026", "Active");
		VehicleRegistration v8 = new VehicleRegistration(108, "Sneha Kapoor", "UP32OP0123", "Car", "Kia Seltos", "02-09-2026", "Active");
		VehicleRegistration v9 = new VehicleRegistration(109, "Karan Malhotra", "UP32QR4567", "Bike", "Yamaha MT-15", "01-09-2026", "Active");
		VehicleRegistration v10 = new VehicleRegistration(110, "Pooja Agarwal", "UP32ST8901", "Car", "Tata Nexon", "31-08-2026", "Active");
		VehicleRegistration v11 = new VehicleRegistration(111, "Aditya Srivastava", "UP32UV2345", "SUV", "Tata Harrier", "30-08-2026", "Pending");
		VehicleRegistration v12 = new VehicleRegistration(112, "Simran Kaur", "UP32WX6789", "Bike", "TVS Apache RTR 160", "29-08-2026", "Active");
		VehicleRegistration v13 = new VehicleRegistration(113, "Nikhil Jain", "UP32YZ0123", "Car", "Volkswagen Virtus", "28-08-2026", "Active");
		VehicleRegistration v14 = new VehicleRegistration(114, "Kavita Joshi", "UP32AA4567", "Bike", "Bajaj Pulsar 150", "27-08-2026", "Expired");
		VehicleRegistration v15 = new VehicleRegistration(115, "Saurabh Tiwari", "UP32BB8901", "Car", "Hyundai Verna", "26-08-2026", "Active");
		VehicleRegistration v16 = new VehicleRegistration(116, "Riya Mehta", "UP32CC2345", "SUV", "MG Hector", "25-08-2026", "Active");
		VehicleRegistration v17 = new VehicleRegistration(117, "Manish Pandey", "UP32DD6789", "Bike", "KTM Duke 250", "24-08-2026", "Pending");
		VehicleRegistration v18 = new VehicleRegistration(118, "Swati Saxena", "UP32EE0123", "Car", "Skoda Slavia", "23-08-2026", "Active");
		VehicleRegistration v19 = new VehicleRegistration(119, "Akash Tripathi", "UP32FF4567", "SUV", "Toyota Innova Crysta", "22-08-2026", "Active");
		VehicleRegistration v20 = new VehicleRegistration(120, "Divya Singh", "UP32GG8901", "Bike", "Suzuki Gixxer", "21-08-2026", "Active");

		
		System.out.println("===========================Vehicle Registration Details 1===================================");

		System.out.println("RegistrationID is: " + v1.getRegistrationId());
		System.out.println("Owner Name is: " + v1.getOwnerName());
		System.out.println("Vehicle Type is: " + v1.getVehicleType());
		System.out.println("Vehicle Number is: " + v1.getVehicleNumber());
		System.out.println("Vehicle Model is: " + v1.getVehicleModel());
		System.out.println("Registration Date is: " + v1.getRegistrationDate());
		System.out.println("Registration Status is: " + v1.getRegistrationStatus());


		System.out.println("===========================Vehicle Registration Details 2===================================");

		System.out.println("RegistrationID is: " + v2.getRegistrationId());
		System.out.println("Owner Name is: " + v2.getOwnerName());
		System.out.println("Vehicle Type is: " + v2.getVehicleType());
		System.out.println("Vehicle Number is: " + v2.getVehicleNumber());
		System.out.println("Vehicle Model is: " + v2.getVehicleModel());
		System.out.println("Registration Date is: " + v2.getRegistrationDate());
		System.out.println("Registration Status is: " + v2.getRegistrationStatus());


		System.out.println("===========================Vehicle Registration Details 3===================================");

		System.out.println("RegistrationID is: " + v3.getRegistrationId());
		System.out.println("Owner Name is: " + v3.getOwnerName());
		System.out.println("Vehicle Type is: " + v3.getVehicleType());
		System.out.println("Vehicle Number is: " + v3.getVehicleNumber());
		System.out.println("Vehicle Model is: " + v3.getVehicleModel());
		System.out.println("Registration Date is: " + v3.getRegistrationDate());
		System.out.println("Registration Status is: " + v3.getRegistrationStatus());


		System.out.println("===========================Vehicle Registration Details 4===================================");

		System.out.println("RegistrationID is: " + v4.getRegistrationId());
		System.out.println("Owner Name is: " + v4.getOwnerName());
		System.out.println("Vehicle Type is: " + v4.getVehicleType());
		System.out.println("Vehicle Number is: " + v4.getVehicleNumber());
		System.out.println("Vehicle Model is: " + v4.getVehicleModel());
		System.out.println("Registration Date is: " + v4.getRegistrationDate());
		System.out.println("Registration Status is: " + v4.getRegistrationStatus());


		System.out.println("===========================Vehicle Registration Details 5===================================");

		System.out.println("RegistrationID is: " + v5.getRegistrationId());
		System.out.println("Owner Name is: " + v5.getOwnerName());
		System.out.println("Vehicle Type is: " + v5.getVehicleType());
		System.out.println("Vehicle Number is: " + v5.getVehicleNumber());
		System.out.println("Vehicle Model is: " + v5.getVehicleModel());
		System.out.println("Registration Date is: " + v5.getRegistrationDate());
		System.out.println("Registration Status is: " + v5.getRegistrationStatus());


		System.out.println("===========================Vehicle Registration Details 6===================================");

		System.out.println("RegistrationID is: " + v6.getRegistrationId());
		System.out.println("Owner Name is: " + v6.getOwnerName());
		System.out.println("Vehicle Type is: " + v6.getVehicleType());
		System.out.println("Vehicle Number is: " + v6.getVehicleNumber());
		System.out.println("Vehicle Model is: " + v6.getVehicleModel());
		System.out.println("Registration Date is: " + v6.getRegistrationDate());
		System.out.println("Registration Status is: " + v6.getRegistrationStatus());


		System.out.println("===========================Vehicle Registration Details 7===================================");

		System.out.println("RegistrationID is: " + v7.getRegistrationId());
		System.out.println("Owner Name is: " + v7.getOwnerName());
		System.out.println("Vehicle Type is: " + v7.getVehicleType());
		System.out.println("Vehicle Number is: " + v7.getVehicleNumber());
		System.out.println("Vehicle Model is: " + v7.getVehicleModel());
		System.out.println("Registration Date is: " + v7.getRegistrationDate());
		System.out.println("Registration Status is: " + v7.getRegistrationStatus());


		System.out.println("===========================Vehicle Registration Details 8===================================");

		System.out.println("RegistrationID is: " + v8.getRegistrationId());
		System.out.println("Owner Name is: " + v8.getOwnerName());
		System.out.println("Vehicle Type is: " + v8.getVehicleType());
		System.out.println("Vehicle Number is: " + v8.getVehicleNumber());
		System.out.println("Vehicle Model is: " + v8.getVehicleModel());
		System.out.println("Registration Date is: " + v8.getRegistrationDate());
		System.out.println("Registration Status is: " + v8.getRegistrationStatus());


		System.out.println("===========================Vehicle Registration Details 9===================================");

		System.out.println("RegistrationID is: " + v9.getRegistrationId());
		System.out.println("Owner Name is: " + v9.getOwnerName());
		System.out.println("Vehicle Type is: " + v9.getVehicleType());
		System.out.println("Vehicle Number is: " + v9.getVehicleNumber());
		System.out.println("Vehicle Model is: " + v9.getVehicleModel());
		System.out.println("Registration Date is: " + v9.getRegistrationDate());
		System.out.println("Registration Status is: " + v9.getRegistrationStatus());


		System.out.println("===========================Vehicle Registration Details 10===================================");

		System.out.println("RegistrationID is: " + v10.getRegistrationId());
		System.out.println("Owner Name is: " + v10.getOwnerName());
		System.out.println("Vehicle Type is: " + v10.getVehicleType());
		System.out.println("Vehicle Number is: " + v10.getVehicleNumber());
		System.out.println("Vehicle Model is: " + v10.getVehicleModel());
		System.out.println("Registration Date is: " + v10.getRegistrationDate());
		System.out.println("Registration Status is: " + v10.getRegistrationStatus());


		System.out.println("===========================Vehicle Registration Details 11===================================");

		System.out.println("RegistrationID is: " + v11.getRegistrationId());
		System.out.println("Owner Name is: " + v11.getOwnerName());
		System.out.println("Vehicle Type is: " + v11.getVehicleType());
		System.out.println("Vehicle Number is: " + v11.getVehicleNumber());
		System.out.println("Vehicle Model is: " + v11.getVehicleModel());
		System.out.println("Registration Date is: " + v11.getRegistrationDate());
		System.out.println("Registration Status is: " + v11.getRegistrationStatus());


		System.out.println("===========================Vehicle Registration Details 12===================================");

		System.out.println("RegistrationID is: " + v12.getRegistrationId());
		System.out.println("Owner Name is: " + v12.getOwnerName());
		System.out.println("Vehicle Type is: " + v12.getVehicleType());
		System.out.println("Vehicle Number is: " + v12.getVehicleNumber());
		System.out.println("Vehicle Model is: " + v12.getVehicleModel());
		System.out.println("Registration Date is: " + v12.getRegistrationDate());
		System.out.println("Registration Status is: " + v12.getRegistrationStatus());


		System.out.println("===========================Vehicle Registration Details 13===================================");

		System.out.println("RegistrationID is: " + v13.getRegistrationId());
		System.out.println("Owner Name is: " + v13.getOwnerName());
		System.out.println("Vehicle Type is: " + v13.getVehicleType());
		System.out.println("Vehicle Number is: " + v13.getVehicleNumber());
		System.out.println("Vehicle Model is: " + v13.getVehicleModel());
		System.out.println("Registration Date is: " + v13.getRegistrationDate());
		System.out.println("Registration Status is: " + v13.getRegistrationStatus());


		System.out.println("===========================Vehicle Registration Details 14===================================");

		System.out.println("RegistrationID is: " + v14.getRegistrationId());
		System.out.println("Owner Name is: " + v14.getOwnerName());
		System.out.println("Vehicle Type is: " + v14.getVehicleType());
		System.out.println("Vehicle Number is: " + v14.getVehicleNumber());
		System.out.println("Vehicle Model is: " + v14.getVehicleModel());
		System.out.println("Registration Date is: " + v14.getRegistrationDate());
		System.out.println("Registration Status is: " + v14.getRegistrationStatus());


		System.out.println("===========================Vehicle Registration Details 15===================================");

		System.out.println("RegistrationID is: " + v15.getRegistrationId());
		System.out.println("Owner Name is: " + v15.getOwnerName());
		System.out.println("Vehicle Type is: " + v15.getVehicleType());
		System.out.println("Vehicle Number is: " + v15.getVehicleNumber());
		System.out.println("Vehicle Model is: " + v15.getVehicleModel());
		System.out.println("Registration Date is: " + v15.getRegistrationDate());
		System.out.println("Registration Status is: " + v15.getRegistrationStatus());


		System.out.println("===========================Vehicle Registration Details 16===================================");

		System.out.println("RegistrationID is: " + v16.getRegistrationId());
		System.out.println("Owner Name is: " + v16.getOwnerName());
		System.out.println("Vehicle Type is: " + v16.getVehicleType());
		System.out.println("Vehicle Number is: " + v16.getVehicleNumber());
		System.out.println("Vehicle Model is: " + v16.getVehicleModel());
		System.out.println("Registration Date is: " + v16.getRegistrationDate());
		System.out.println("Registration Status is: " + v16.getRegistrationStatus());


		System.out.println("===========================Vehicle Registration Details 17===================================");

		System.out.println("RegistrationID is: " + v17.getRegistrationId());
		System.out.println("Owner Name is: " + v17.getOwnerName());
		System.out.println("Vehicle Type is: " + v17.getVehicleType());
		System.out.println("Vehicle Number is: " + v17.getVehicleNumber());
		System.out.println("Vehicle Model is: " + v17.getVehicleModel());
		System.out.println("Registration Date is: " + v17.getRegistrationDate());
		System.out.println("Registration Status is: " + v17.getRegistrationStatus());


		System.out.println("===========================Vehicle Registration Details 18===================================");

		System.out.println("RegistrationID is: " + v18.getRegistrationId());
		System.out.println("Owner Name is: " + v18.getOwnerName());
		System.out.println("Vehicle Type is: " + v18.getVehicleType());
		System.out.println("Vehicle Number is: " + v18.getVehicleNumber());
		System.out.println("Vehicle Model is: " + v18.getVehicleModel());
		System.out.println("Registration Date is: " + v18.getRegistrationDate());
		System.out.println("Registration Status is: " + v18.getRegistrationStatus());


		System.out.println("===========================Vehicle Registration Details 19===================================");

		System.out.println("RegistrationID is: " + v19.getRegistrationId());
		System.out.println("Owner Name is: " + v19.getOwnerName());
		System.out.println("Vehicle Type is: " + v19.getVehicleType());
		System.out.println("Vehicle Number is: " + v19.getVehicleNumber());
		System.out.println("Vehicle Model is: " + v19.getVehicleModel());
		System.out.println("Registration Date is: " + v19.getRegistrationDate());
		System.out.println("Registration Status is: " + v19.getRegistrationStatus());


		System.out.println("===========================Vehicle Registration Details 20===================================");

		System.out.println("RegistrationID is: " + v20.getRegistrationId());
		System.out.println("Owner Name is: " + v20.getOwnerName());
		System.out.println("Vehicle Type is: " + v20.getVehicleType());
		System.out.println("Vehicle Number is: " + v20.getVehicleNumber());
		System.out.println("Vehicle Model is: " + v20.getVehicleModel());
		System.out.println("Registration Date is: " + v20.getRegistrationDate());
		System.out.println("Registration Status is: " + v20.getRegistrationStatus());
	}

}
