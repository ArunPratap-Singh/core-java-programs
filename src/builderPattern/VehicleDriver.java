package builderPattern;

public class VehicleDriver {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle.Builder().setVehicleId(101).setBrand("Maruti Suzuki").setModel("Swift").setVehicleType("Hatchback").setPrice(750000).setColor("Red").setManufacturingYear(2025).setFuelType("Petrol").build();

        Vehicle v2 = new Vehicle.Builder().setVehicleId(102).setBrand("Hyundai").setModel("Creta").setVehicleType("SUV").setPrice(1200000).setColor("White").setManufacturingYear(2025).setFuelType("Diesel").build();

        Vehicle v3 = new Vehicle.Builder().setVehicleId(103).setBrand("Tata").setModel("Nexon").setVehicleType("SUV").setPrice(900000).setColor("Blue").setManufacturingYear(2024).setFuelType("Petrol").build();

        Vehicle v4 = new Vehicle.Builder().setVehicleId(104).setBrand("Mahindra").setModel("Scorpio N").setVehicleType("SUV").setPrice(1500000).setColor("Black").setManufacturingYear(2025).setFuelType("Diesel").build();

        Vehicle v5 = new Vehicle.Builder().setVehicleId(105).setBrand("Toyota").setModel("Innova Crysta").setVehicleType("MUV").setPrice(1900000).setColor("Silver").setManufacturingYear(2024).setFuelType("Diesel").build();

        Vehicle v6 = new Vehicle.Builder().setVehicleId(106).setBrand("Honda").setModel("City").setVehicleType("Sedan").setPrice(1200000).setColor("Grey").setManufacturingYear(2025).setFuelType("Petrol").build();

        Vehicle v7 = new Vehicle.Builder().setVehicleId(107).setBrand("Kia").setModel("Seltos").setVehicleType("SUV").setPrice(1300000).setColor("Green").setManufacturingYear(2025).setFuelType("Petrol").build();

        Vehicle v8 = new Vehicle.Builder().setVehicleId(108).setBrand("Volkswagen").setModel("Virtus").setVehicleType("Sedan").setPrice(1400000).setColor("White").setManufacturingYear(2024).setFuelType("Petrol").build();

        Vehicle v9 = new Vehicle.Builder().setVehicleId(109).setBrand("Skoda").setModel("Slavia").setVehicleType("Sedan").setPrice(1350000).setColor("Red").setManufacturingYear(2025).setFuelType("Petrol").build();

        Vehicle v10 = new Vehicle.Builder().setVehicleId(110).setBrand("Tata").setModel("Punch").setVehicleType("SUV").setPrice(650000).setColor("Orange").setManufacturingYear(2024).setFuelType("Petrol").build();

        Vehicle v11 = new Vehicle.Builder().setVehicleId(111).setBrand("Royal Enfield").setModel("Classic 350").setVehicleType("Bike").setPrice(190000).setColor("Black").setManufacturingYear(2025).setFuelType("Petrol").build();

        Vehicle v12 = new Vehicle.Builder().setVehicleId(112).setBrand("Bajaj").setModel("Pulsar N160").setVehicleType("Bike").setPrice(130000).setColor("Blue").setManufacturingYear(2024).setFuelType("Petrol").build();

        Vehicle v13 = new Vehicle.Builder().setVehicleId(113).setBrand("TVS").setModel("Apache RTR 160").setVehicleType("Bike").setPrice(120000).setColor("Red").setManufacturingYear(2025).setFuelType("Petrol").build();

        Vehicle v14 = new Vehicle.Builder().setVehicleId(114).setBrand("Hero").setModel("Splendor Plus").setVehicleType("Bike").setPrice(80000).setColor("Black").setManufacturingYear(2024).setFuelType("Petrol").build();

        Vehicle v15 = new Vehicle.Builder().setVehicleId(115).setBrand("Honda").setModel("Activa 6G").setVehicleType("Scooter").setPrice(85000).setColor("Grey").setManufacturingYear(2025).setFuelType("Petrol").build();

        Vehicle v16 = new Vehicle.Builder().setVehicleId(116).setBrand("Ather").setModel("450X").setVehicleType("Electric Scooter").setPrice(160000).setColor("White").setManufacturingYear(2025).setFuelType("Electric").build();

        Vehicle v17 = new Vehicle.Builder().setVehicleId(117).setBrand("Ola").setModel("S1 Pro").setVehicleType("Electric Scooter").setPrice(140000).setColor("Blue").setManufacturingYear(2025).setFuelType("Electric").build();

        Vehicle v18 = new Vehicle.Builder().setVehicleId(118).setBrand("Bajaj").setModel("Chetak").setVehicleType("Electric Scooter").setPrice(120000).setColor("Green").setManufacturingYear(2024).setFuelType("Electric").build();

        Vehicle v19 = new Vehicle.Builder().setVehicleId(119).setBrand("Tata").setModel("Nexon EV").setVehicleType("Electric SUV").setPrice(1500000).setColor("White").setManufacturingYear(2025).setFuelType("Electric").build();

        Vehicle v20 = new Vehicle.Builder().setVehicleId(120).setBrand("Mahindra").setModel("XUV700").setVehicleType("SUV").setPrice(1800000).setColor("Black").setManufacturingYear(2025).setFuelType("Diesel").build();

        System.out.println(v1);
        System.out.println("====================");

        System.out.println(v2);
        System.out.println("====================");

        System.out.println(v3);
        System.out.println("====================");

        System.out.println(v4);
        System.out.println("====================");

        System.out.println(v5);
        System.out.println("====================");

        System.out.println(v6);
        System.out.println("====================");

        System.out.println(v7);
        System.out.println("====================");

        System.out.println(v8);
        System.out.println("====================");

        System.out.println(v9);
        System.out.println("====================");

        System.out.println(v10);
        System.out.println("====================");

        System.out.println(v11);
        System.out.println("====================");

        System.out.println(v12);
        System.out.println("====================");

        System.out.println(v13);
        System.out.println("====================");

        System.out.println(v14);
        System.out.println("====================");

        System.out.println(v15);
        System.out.println("====================");

        System.out.println(v16);
        System.out.println("====================");

        System.out.println(v17);
        System.out.println("====================");

        System.out.println(v18);
        System.out.println("====================");

        System.out.println(v19);
        System.out.println("====================");

        System.out.println(v20);
	   }
	}


