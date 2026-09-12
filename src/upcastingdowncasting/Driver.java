package upcastingdowncasting;

public class Driver {

	public static void main(String[] args) {
		
		
		Vehicle v1 = new Car("Swift", 250000, 4, "Maruti Suzuki", 4, 89, 4);
		Vehicle v2 = new Car("Scorpio N", 350000, 4, "Mahindra & Mahindra", 5, 172, 4);
		Vehicle v3 = new Car("Creta", 450000, 4, "Hyundai", 5, 115, 4);
		Vehicle v4 = new Car("City", 550000, 4, "Honda", 4, 115, 4);
		Vehicle v5 = new Car("Fortuner", 650000, 4, "Toyoto", 5, 201, 4);
		Vehicle v6 = new Car("BMW X5", 1000000, 4, "BMW", 5, 335, 4);
		Vehicle v7 = new Car("AudiA6", 750000, 4, "Audi", 4, 261, 4);
		Vehicle v8 = new Car("Mustang GT", 25000000, 4, "Ford", 2, 450, 4);
		Vehicle v9 = new Car("Lamborghini Huracan", 650000, 4, "Honda", 4, 115, 4);
		Vehicle v10 = new Car("Tata Nexon", 890000, 4, "Tata Motors", 5, 118, 4);
		
		System.out.println("UPCASTING PROGRAME STARTS");
		
		System.out.println("===========================================================");
		
		System.out.println("===========v1 UPCASTING Details============");
		System.out.println("Name is: " +v1.name);
		System.out.println("Price is: " +v1.price);
		System.out.println("Number of wheels is: " +v1.numberofwheels);
		
		System.out.println("===========v2 UPCASTING Details============");
		System.out.println("Name is: " +v2.name);
		System.out.println("Price is: " +v2.price);
		System.out.println("Number of wheels is: " +v2.numberofwheels);
		
		System.out.println("===========v3 UPCASTING Details============");
		System.out.println("Name is: " +v3.name);
		System.out.println("Price is: " +v3.price);
		System.out.println("Number of wheels is: " +v3.numberofwheels);
		
		System.out.println("===========v4 UPCASTING Details============");
		System.out.println("Name is: " +v4.name);
		System.out.println("Price is: " +v4.price);
		System.out.println("Number of wheels is: " +v4.numberofwheels);
		
		System.out.println("===========v5 UPCASTING Details============");
		System.out.println("Name is: " +v5.name);
		System.out.println("Price is: " +v5.price);
		System.out.println("Number of wheels is: " +v5.numberofwheels);
		
		System.out.println("===========v6 UPCASTING Details============");
		System.out.println("Name is: " +v6.name);
		System.out.println("Price is: " +v6.price);
		System.out.println("Number of wheels is: " +v6.numberofwheels);
		
		System.out.println("===========v7 UPCASTING Details============");
		System.out.println("Name is: " +v7.name);
		System.out.println("Price is: " +v7.price);
		System.out.println("Number of wheels is: " +v7.numberofwheels);
		
		System.out.println("===========v8 UPCASTING Details============");
		System.out.println("Name is: " +v8.name);
		System.out.println("Price is: " +v8.price);
		System.out.println("Number of wheels is: " +v8.numberofwheels);
		
		System.out.println("===========v9 UPCASTING Details============");
		System.out.println("Name is: " +v9.name);
		System.out.println("Price is: " +v9.price);
		System.out.println("Number of wheels is: " +v9.numberofwheels);
		
		System.out.println("===========v10 UPCASTING Details============");
		System.out.println("Name is: " +v10.name);
		System.out.println("Price is: " +v10.price);
		System.out.println("Number of wheels is: " +v10.numberofwheels);
		
		
		System.out.println("UPCASTING PROGRAME ENDS");
		
		System.out.println("===========================================================");
		
		Car c1 = (Car) v1;
		Car c2 = (Car) v2;
		Car c3 = (Car) v3;
		Car c4 = (Car) v4;
		Car c5 = (Car) v5;
		Car c6 = (Car) v6;
		Car c7 = (Car) v7;
		Car c8 = (Car) v8;
		Car c9 = (Car) v9;
		Car c10 = (Car) v10;
		
		System.out.println("DOWNCASTING PROGRAME STARTS");
		
		System.out.println("=============================================================");
		
		System.out.println("=============c1 DOWNCASTING Details===============");
		System.out.println("Name is: " +c1.name);
		System.out.println("Price is: " +c1.price);
		System.out.println("Number Of Wheels is: " +c1.numberofwheels);
		System.out.println("Brands is: " +c1.brands);
		System.out.println("Number Of Doors is: " +c1.numberofdoors);
		System.out.println("HP is : " +c1.hp);
		System.out.println("Strokes is: " +c1.strokes);
		
		System.out.println("=============c2 DOWNCASTING Details===============");
		System.out.println("Name is: " +c2.name);
		System.out.println("Price is: " +c2.price);
		System.out.println("Number Of Wheels is: " +c2.numberofwheels);
		System.out.println("Brands is: " +c2.brands);
		System.out.println("Number Of Doors is: " +c2.numberofdoors);
		System.out.println("HP is : " +c2.hp);
		System.out.println("Strokes is: " +c2.strokes);
		
		System.out.println("=============c3 DOWNCASTING Details===============");
		System.out.println("Name is: " +c3.name);
		System.out.println("Price is: " +c3.price);
		System.out.println("Number Of Wheels is: " +c3.numberofwheels);
		System.out.println("Brands is: " +c3.brands);
		System.out.println("Number Of Doors is: " +c3.numberofdoors);
		System.out.println("HP is : " +c3.hp);
		System.out.println("Strokes is: " +c3.strokes);
		
		System.out.println("=============c4 DOWNCASTING Details===============");
		System.out.println("Name is: " +c4.name);
		System.out.println("Price is: " +c4.price);
		System.out.println("Number Of Wheels is: " +c4.numberofwheels);
		System.out.println("Brands is: " +c4.brands);
		System.out.println("Number Of Doors is: " +c4.numberofdoors);
		System.out.println("HP is : " +c4.hp);
		System.out.println("Strokes is: " +c4.strokes);
		
		System.out.println("=============c5 DOWNCASTING Details===============");
		System.out.println("Name is: " +c5.name);
		System.out.println("Price is: " +c5.price);
		System.out.println("Number Of Wheels is: " +c5.numberofwheels);
		System.out.println("Brands is: " +c5.brands);
		System.out.println("Number Of Doors is: " +c5.numberofdoors);
		System.out.println("HP is : " +c5.hp);
		System.out.println("Strokes is: " +c5.strokes);
		
		System.out.println("=============c6 DOWNCASTING Details===============");
		System.out.println("Name is: " +c6.name);
		System.out.println("Price is: " +c6.price);
		System.out.println("Number Of Wheels is: " +c6.numberofwheels);
		System.out.println("Brands is: " +c6.brands);
		System.out.println("Number Of Doors is: " +c6.numberofdoors);
		System.out.println("HP is : " +c6.hp);
		System.out.println("Strokes is: " +c6.strokes);
		
		System.out.println("=============c7 DOWNCASTING Details===============");
		System.out.println("Name is: " +c7.name);
		System.out.println("Price is: " +c7.price);
		System.out.println("Number Of Wheels is: " +c7.numberofwheels);
		System.out.println("Brands is: " +c7.brands);
		System.out.println("Number Of Doors is: " +c7.numberofdoors);
		System.out.println("HP is : " +c7.hp);
		System.out.println("Strokes is: " +c7.strokes);
		
		System.out.println("=============c8 DOWNCASTING Details===============");
		System.out.println("Name is: " +c8.name);
		System.out.println("Price is: " +c8.price);
		System.out.println("Number Of Wheels is: " +c8.numberofwheels);
		System.out.println("Brands is: " +c8.brands);
		System.out.println("Number Of Doors is: " +c8.numberofdoors);
		System.out.println("HP is : " +c8.hp);
		System.out.println("Strokes is: " +c8.strokes);
		
		System.out.println("=============c9 DOWNCASTING Details===============");
		System.out.println("Name is: " +c9.name);
		System.out.println("Price is: " +c9.price);
		System.out.println("Number Of Wheels is: " +c9.numberofwheels);
		System.out.println("Brands is: " +c9.brands);
		System.out.println("Number Of Doors is: " +c9.numberofdoors);
		System.out.println("HP is : " +c9.hp);
		System.out.println("Strokes is: " +c9.strokes);
		
		System.out.println("=============c10 DOWNCASTING Details===============");
		System.out.println("Name is: " +c10.name);
		System.out.println("Price is: " +c10.price);
		System.out.println("Number Of Wheels is: " +c10.numberofwheels);
		System.out.println("Brands is: " +c10.brands);
		System.out.println("Number Of Doors is: " +c10.numberofdoors);
		System.out.println("HP is : " +c10.hp);
		System.out.println("Strokes is: " +c10.strokes);
		
		System.out.println("UP CASTING PROGRAME ENDS");
		
		
	}
	
}	