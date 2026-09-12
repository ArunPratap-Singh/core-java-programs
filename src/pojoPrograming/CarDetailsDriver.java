package pojoPrograming;

public class CarDetailsDriver {

	public static void main(String[] args) {
		
		System.out.println("=================================Main method Starts====================================");

		CarDetails c1 = new CarDetails("CAR101", "Toyota", "Fortuner", 4200000.00, "Black", 2024, "Diesel", "Automatic", 14.20, 2755.00, 7, "UP32AB1234", "Mohan Singh", "Active", "Available");
		CarDetails c2 = new CarDetails("CAR102", "Mahindra", "Scorpio N", 2800000.00, "White", 2023, "Diesel", "Manual", 15.40, 2184.00, 7, "UP32CD2345", "Rohan Kumar", "Active", "Available");
		CarDetails c3 = new CarDetails("CAR103", "Hyundai", "Creta", 1850000.00, "Silver", 2024, "Petrol", "Automatic", 17.40, 1497.00, 5, "DL01EF3456", "Sohan Sharma", "Active", "Available");
		CarDetails c4 = new CarDetails("CAR104", "Tata", "Safari", 2500000.00, "Blue", 2023, "Diesel", "Automatic", 16.30, 1956.00, 7, "MH12GH4567", "Rahul Verma", "Active", "Available");
		CarDetails c5 = new CarDetails("CAR105", "Kia", "Seltos", 1900000.00, "Red", 2024, "Petrol", "Automatic", 16.80, 1497.00, 5, "KA05IJ5678", "Shyam Gupta", "Active", "Sold");
		CarDetails c6 = new CarDetails("CAR106", "Maruti Suzuki", "Grand Vitara", 1750000.00, "Green", 2023, "Hybrid", "Automatic", 27.97, 1462.00, 5, "UP16KL6789", "Manoj Singh", "Active", "Available");
		CarDetails c7 = new CarDetails("CAR107", "Honda", "City", 1650000.00, "Grey", 2024, "Petrol", "Manual", 17.80, 1498.00, 5, "DL08MN7890", "Akash Kumar", "Active", "Available");
		CarDetails c8 = new CarDetails("CAR108", "Volkswagen", "Virtus", 1800000.00, "Black", 2023, "Petrol", "Automatic", 18.45, 1498.00, 5, "RJ14OP8901", "Samarth Singh", "Active", "Available");
		CarDetails c9 = new CarDetails("CAR109", "Toyota", "Innova Crysta", 2600000.00, "White", 2022, "Diesel", "Manual", 15.60, 2393.00, 7, "UP32QR9012", "Abhishek Kumar", "Active", "Sold");
		CarDetails c10 = new CarDetails("CAR110", "MG", "Hector", 2200000.00, "Red", 2024, "Petrol", "Automatic", 15.58, 1451.00, 5, "HR26ST0123", "Karan Singh", "Active", "Available");
		
		System.out.println("Object Reference is: " + c1);
		System.out.println("Car ID is: " + c1.getCarID());
		System.out.println("Brand is: " + c1.getBrand());
		System.out.println("Model is: " + c1.getModel());
		System.out.println("Price is: " + c1.getPrice());
		System.out.println("Color is: " + c1.getColor());
		System.out.println("Manufacturing Year is: " + c1.getManufacturingYear());
		System.out.println("Fuel Type is: " + c1.getFuelType());
		System.out.println("Transmission is: " + c1.getTransmission());
		System.out.println("Mileage is: " + c1.getMileage() + " km/l");
		System.out.println("Engine Capacity is: " + c1.getEngineCapacity() + " cc");
		System.out.println("Seating Capacity is: " + c1.getSeatingCapacity());
		System.out.println("Registration Number is: " + c1.getRegistrationNumber());
		System.out.println("Owner Name is: " + c1.getOwnerName());
		System.out.println("Insurance Status is: " + c1.getInsuranceStatus());
		System.out.println("Car Status is: " + c1.getCarStatus());

		System.out.println("=========================Car Details 1=========================");

		System.out.println("Object Reference is: " + c1);
		System.out.println("Car ID is: " + c1.getCarID());
		System.out.println("Brand is: " + c1.getBrand());
		System.out.println("Model is: " + c1.getModel());
		System.out.println("Price is: " + c1.getPrice());
		System.out.println("Color is: " + c1.getColor());
		System.out.println("Manufacturing Year is: " + c1.getManufacturingYear());
		System.out.println("Fuel Type is: " + c1.getFuelType());
		System.out.println("Transmission is: " + c1.getTransmission());
		System.out.println("Mileage is: " + c1.getMileage() + " km/l");
		System.out.println("Engine Capacity is: " + c1.getEngineCapacity() + " cc");
		System.out.println("Seating Capacity is: " + c1.getSeatingCapacity());
		System.out.println("Registration Number is: " + c1.getRegistrationNumber());
		System.out.println("Owner Name is: " + c1.getOwnerName());
		System.out.println("Insurance Status is: " + c1.getInsuranceStatus());
		System.out.println("Car Status is: " + c1.getCarStatus());


		System.out.println("=========================Car Details 2=========================");

		System.out.println("Object Reference is: " + c2);
		System.out.println("Car ID is: " + c2.getCarID());
		System.out.println("Brand is: " + c2.getBrand());
		System.out.println("Model is: " + c2.getModel());
		System.out.println("Price is: " + c2.getPrice());
		System.out.println("Color is: " + c2.getColor());
		System.out.println("Manufacturing Year is: " + c2.getManufacturingYear());
		System.out.println("Fuel Type is: " + c2.getFuelType());
		System.out.println("Transmission is: " + c2.getTransmission());
		System.out.println("Mileage is: " + c2.getMileage() + " km/l");
		System.out.println("Engine Capacity is: " + c2.getEngineCapacity() + " cc");
		System.out.println("Seating Capacity is: " + c2.getSeatingCapacity());
		System.out.println("Registration Number is: " + c2.getRegistrationNumber());
		System.out.println("Owner Name is: " + c2.getOwnerName());
		System.out.println("Insurance Status is: " + c2.getInsuranceStatus());
		System.out.println("Car Status is: " + c2.getCarStatus());


		System.out.println("=========================Car Details 3=========================");

		System.out.println("Object Reference is: " + c3);
		System.out.println("Car ID is: " + c3.getCarID());
		System.out.println("Brand is: " + c3.getBrand());
		System.out.println("Model is: " + c3.getModel());
		System.out.println("Price is: " + c3.getPrice());
		System.out.println("Color is: " + c3.getColor());
		System.out.println("Manufacturing Year is: " + c3.getManufacturingYear());
		System.out.println("Fuel Type is: " + c3.getFuelType());
		System.out.println("Transmission is: " + c3.getTransmission());
		System.out.println("Mileage is: " + c3.getMileage() + " km/l");
		System.out.println("Engine Capacity is: " + c3.getEngineCapacity() + " cc");
		System.out.println("Seating Capacity is: " + c3.getSeatingCapacity());
		System.out.println("Registration Number is: " + c3.getRegistrationNumber());
		System.out.println("Owner Name is: " + c3.getOwnerName());
		System.out.println("Insurance Status is: " + c3.getInsuranceStatus());
		System.out.println("Car Status is: " + c3.getCarStatus());


		System.out.println("=========================Car Details 4=========================");

		System.out.println("Object Reference is: " + c4);
		System.out.println("Car ID is: " + c4.getCarID());
		System.out.println("Brand is: " + c4.getBrand());
		System.out.println("Model is: " + c4.getModel());
		System.out.println("Price is: " + c4.getPrice());
		System.out.println("Color is: " + c4.getColor());
		System.out.println("Manufacturing Year is: " + c4.getManufacturingYear());
		System.out.println("Fuel Type is: " + c4.getFuelType());
		System.out.println("Transmission is: " + c4.getTransmission());
		System.out.println("Mileage is: " + c4.getMileage() + " km/l");
		System.out.println("Engine Capacity is: " + c4.getEngineCapacity() + " cc");
		System.out.println("Seating Capacity is: " + c4.getSeatingCapacity());
		System.out.println("Registration Number is: " + c4.getRegistrationNumber());
		System.out.println("Owner Name is: " + c4.getOwnerName());
		System.out.println("Insurance Status is: " + c4.getInsuranceStatus());
		System.out.println("Car Status is: " + c4.getCarStatus());


		System.out.println("=========================Car Details 5=========================");

		System.out.println("Object Reference is: " + c5);
		System.out.println("Car ID is: " + c5.getCarID());
		System.out.println("Brand is: " + c5.getBrand());
		System.out.println("Model is: " + c5.getModel());
		System.out.println("Price is: " + c5.getPrice());
		System.out.println("Color is: " + c5.getColor());
		System.out.println("Manufacturing Year is: " + c5.getManufacturingYear());
		System.out.println("Fuel Type is: " + c5.getFuelType());
		System.out.println("Transmission is: " + c5.getTransmission());
		System.out.println("Mileage is: " + c5.getMileage() + " km/l");
		System.out.println("Engine Capacity is: " + c5.getEngineCapacity() + " cc");
		System.out.println("Seating Capacity is: " + c5.getSeatingCapacity());
		System.out.println("Registration Number is: " + c5.getRegistrationNumber());
		System.out.println("Owner Name is: " + c5.getOwnerName());
		System.out.println("Insurance Status is: " + c5.getInsuranceStatus());
		System.out.println("Car Status is: " + c5.getCarStatus());


		System.out.println("=========================Car Details 6=========================");

		System.out.println("Object Reference is: " + c6);
		System.out.println("Car ID is: " + c6.getCarID());
		System.out.println("Brand is: " + c6.getBrand());
		System.out.println("Model is: " + c6.getModel());
		System.out.println("Price is: " + c6.getPrice());
		System.out.println("Color is: " + c6.getColor());
		System.out.println("Manufacturing Year is: " + c6.getManufacturingYear());
		System.out.println("Fuel Type is: " + c6.getFuelType());
		System.out.println("Transmission is: " + c6.getTransmission());
		System.out.println("Mileage is: " + c6.getMileage() + " km/l");
		System.out.println("Engine Capacity is: " + c6.getEngineCapacity() + " cc");
		System.out.println("Seating Capacity is: " + c6.getSeatingCapacity());
		System.out.println("Registration Number is: " + c6.getRegistrationNumber());
		System.out.println("Owner Name is: " + c6.getOwnerName());
		System.out.println("Insurance Status is: " + c6.getInsuranceStatus());
		System.out.println("Car Status is: " + c6.getCarStatus());


		System.out.println("=========================Car Details 7=========================");

		System.out.println("Object Reference is: " + c7);
		System.out.println("Car ID is: " + c7.getCarID());
		System.out.println("Brand is: " + c7.getBrand());
		System.out.println("Model is: " + c7.getModel());
		System.out.println("Price is: " + c7.getPrice());
		System.out.println("Color is: " + c7.getColor());
		System.out.println("Manufacturing Year is: " + c7.getManufacturingYear());
		System.out.println("Fuel Type is: " + c7.getFuelType());
		System.out.println("Transmission is: " + c7.getTransmission());
		System.out.println("Mileage is: " + c7.getMileage() + " km/l");
		System.out.println("Engine Capacity is: " + c7.getEngineCapacity() + " cc");
		System.out.println("Seating Capacity is: " + c7.getSeatingCapacity());
		System.out.println("Registration Number is: " + c7.getRegistrationNumber());
		System.out.println("Owner Name is: " + c7.getOwnerName());
		System.out.println("Insurance Status is: " + c7.getInsuranceStatus());
		System.out.println("Car Status is: " + c7.getCarStatus());


		System.out.println("=========================Car Details 8=========================");

		System.out.println("Object Reference is: " + c8);
		System.out.println("Car ID is: " + c8.getCarID());
		System.out.println("Brand is: " + c8.getBrand());
		System.out.println("Model is: " + c8.getModel());
		System.out.println("Price is: " + c8.getPrice());
		System.out.println("Color is: " + c8.getColor());
		System.out.println("Manufacturing Year is: " + c8.getManufacturingYear());
		System.out.println("Fuel Type is: " + c8.getFuelType());
		System.out.println("Transmission is: " + c8.getTransmission());
		System.out.println("Mileage is: " + c8.getMileage() + " km/l");
		System.out.println("Engine Capacity is: " + c8.getEngineCapacity() + " cc");
		System.out.println("Seating Capacity is: " + c8.getSeatingCapacity());
		System.out.println("Registration Number is: " + c8.getRegistrationNumber());
		System.out.println("Owner Name is: " + c8.getOwnerName());
		System.out.println("Insurance Status is: " + c8.getInsuranceStatus());
		System.out.println("Car Status is: " + c8.getCarStatus());


		System.out.println("=========================Car Details 9=========================");

		System.out.println("Object Reference is: " + c9);
		System.out.println("Car ID is: " + c9.getCarID());
		System.out.println("Brand is: " + c9.getBrand());
		System.out.println("Model is: " + c9.getModel());
		System.out.println("Price is: " + c9.getPrice());
		System.out.println("Color is: " + c9.getColor());
		System.out.println("Manufacturing Year is: " + c9.getManufacturingYear());
		System.out.println("Fuel Type is: " + c9.getFuelType());
		System.out.println("Transmission is: " + c9.getTransmission());
		System.out.println("Mileage is: " + c9.getMileage() + " km/l");
		System.out.println("Engine Capacity is: " + c9.getEngineCapacity() + " cc");
		System.out.println("Seating Capacity is: " + c9.getSeatingCapacity());
		System.out.println("Registration Number is: " + c9.getRegistrationNumber());
		System.out.println("Owner Name is: " + c9.getOwnerName());
		System.out.println("Insurance Status is: " + c9.getInsuranceStatus());
		System.out.println("Car Status is: " + c9.getCarStatus());


		System.out.println("=========================Car Details 10=========================");

		System.out.println("Object Reference is: " + c10);
		System.out.println("Car ID is: " + c10.getCarID());
		System.out.println("Brand is: " + c10.getBrand());
		System.out.println("Model is: " + c10.getModel());
		System.out.println("Price is: " + c10.getPrice());
		System.out.println("Color is: " + c10.getColor());
		System.out.println("Manufacturing Year is: " + c10.getManufacturingYear());
		System.out.println("Fuel Type is: " + c10.getFuelType());
		System.out.println("Transmission is: " + c10.getTransmission());
		System.out.println("Mileage is: " + c10.getMileage() + " km/l");
		System.out.println("Engine Capacity is: " + c10.getEngineCapacity() + " cc");
		System.out.println("Seating Capacity is: " + c10.getSeatingCapacity());
		System.out.println("Registration Number is: " + c10.getRegistrationNumber());
		System.out.println("Owner Name is: " + c10.getOwnerName());
		System.out.println("Insurance Status is: " + c10.getInsuranceStatus());
		System.out.println("Car Status is: " + c10.getCarStatus());
		
		System.out.println("====================================Main Methgod Ends======================================");
	}

}
