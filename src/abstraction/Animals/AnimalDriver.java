package abstraction.Animals;

public class AnimalDriver {

	public static void main(String[] args) {

		Animal a1 = new Dog(101, "Max", "Domestic Animal", 5, "Male", 25.0, "Brown", "House", "German Shepherd", "Rahul", "Dog Food", "Advanced", true);
		Animal a2 = new Dog(102, "Bruno", "Domestic Animal", 4, "Male", 22.5, "Black", "House", "Labrador", "Amit", "Dog Food", "Intermediate", true);
		Animal a3 = new Dog(103, "Bella", "Domestic Animal", 3, "Female", 20.0, "Golden", "House", "Golden Retriever", "Riya", "Dog Food", "Beginner", true);
		Animal a4 = new Dog(104, "Rocky", "Domestic Animal", 6, "Male", 28.5, "Brown", "House", "Rottweiler", "Vikas", "Dog Food", "Advanced", true);
		Animal a5 = new Dog(105, "Daisy", "Domestic Animal", 2, "Female", 18.0, "White", "House", "Poodle", "Sonia", "Dog Food", "Beginner", true);	
		Animal a6 = new Dog(106, "Charlie", "Domestic Animal", 4, "Male", 24.0, "Black", "House", "Bulldog", "Karan", "Dog Food", "Intermediate", true);
		Animal a7 = new Dog(107, "Lucy", "Domestic Animal", 3, "Female", 21.5, "Golden", "House", "Beagle", "Anjali", "Dog Food", "Beginner", true);
		Animal a8 = new Dog(108, "Buddy", "Domestic Animal", 5, "Male", 26.0, "Brown", "House", "Boxer", "Rohit", "Dog Food", "Advanced", true);
		Animal a9 = new Dog(109, "Molly", "Domestic Animal", 2, "Female", 19.0, "White", "House", "Shih Tzu", "Pooja", "Dog Food", "Beginner", true);
		Animal a10 = new Dog(110, "Toby", "Domestic Animal", 4, "Male", 23.0, "Black", "House", "Dalmatian", "Siddharth", "Dog Food", "Intermediate", true);
		
		System.out.println(a1);
		System.out.println("=====================");
		System.out.println(a2);
		System.out.println("=====================");
		System.out.println(a3);
		System.out.println("=====================");
		System.out.println(a4);
		System.out.println("=====================");
		System.out.println(a5);
		System.out.println("=====================");
		System.out.println(a6);
		System.out.println("=====================");
		System.out.println(a7);
		System.out.println("=====================");
		System.out.println(a8);
		System.out.println("=====================");
		System.out.println(a9);
		System.out.println("=====================");
		System.out.println(a10);
		
		System.out.println("==================a1 Details====================");
		a1.eat();
		a1.sound();
		((Dog)a1).run();
		
		System.out.println("==================a2 Details====================");
		a2.eat();
		a2.sound();
		((Dog)a2).run();
		
		System.out.println("==================a3 Details====================");
		a3.eat();
		a3.sound();
		((Dog)a3).run();
		
		System.out.println("==================a4 Details====================");
		a4.eat();
		a4.sound();
		((Dog)a4).run();
		
		System.out.println("==================a5 Details====================");
		a5.eat();
		a5.sound();
		((Dog)a5).run();
		
		System.out.println("==================a6 Details====================");
		a6.eat();
		a6.sound();
		((Dog)a6).run();
		
		System.out.println("==================a7 Details====================");
		a7.eat();
		a7.sound();
		((Dog)a7).run();
		
		System.out.println("==================a8 Details====================");
		a8.eat();
		a8.sound();
		((Dog)a8).run();
		
		System.out.println("==================a9 Details====================");
		a9.eat();
		a9.sound();
		((Dog)a9).run();
		
		System.out.println("==================a10 Details====================");
		a10.eat();
		a10.sound();
		((Dog)a10).run();
		
		System.out.println("===================================================================================");
		
		Animal a11 = new Cat(201, "Whiskers", "Domestic Animal", 3, "Male", 10.0, "Gray", "House", "Siamese", "Rahul", "Cat Food", "Blue", true);
		Animal a12 = new Cat(202, "Mittens", "Domestic Animal", 2, "Female", 8.5, "White", "House", "Persian", "Amit", "Cat Food", "Green", true);
		Animal a13 = new Cat(203, "Shadow", "Domestic Animal", 4, "Male", 12.0, "Black", "House", "Maine Coon", "Riya", "Cat Food", "Yellow", true);
		Animal a14 = new Cat(204, "Luna", "Domestic Animal", 1, "Female", 6.5, "Cream", "House", "Ragdoll", "Priya", "Cat Food", "Blue", true);
		Animal a15 = new Cat(205, "Simba", "Domestic Animal", 5, "Male", 13.5, "Golden", "House", "Bengal", "Vikas", "Cat Food", "Green", true);
		Animal a16 = new Cat(206, "Bella", "Domestic Animal", 3, "Female", 9.0, "Brown", "House", "British Shorthair", "Neha", "Cat Food", "Copper", true);
		Animal a17 = new Cat(207, "Oliver", "Domestic Animal", 2, "Male", 8.0, "Orange", "House", "American Shorthair", "Aman", "Cat Food", "Green", true);
		Animal a18 = new Cat(208, "Cleo", "Domestic Animal", 4, "Female", 11.0, "Silver", "House", "Russian Blue", "Pooja", "Cat Food", "Green", true);
		Animal a19 = new Cat(209, "Tiger", "Domestic Animal", 6, "Male", 14.5, "Striped", "House", "Bengal", "Suresh", "Cat Food", "Golden", true);
		Animal a20 = new Cat(210, "Misty", "Domestic Animal", 3, "Female", 7.5, "Gray", "House", "Scottish Fold", "Anjali", "Cat Food", "Blue", true);
		
		System.out.println(a11);
		System.out.println("=====================");
		System.out.println(a12);
		System.out.println("=====================");
		System.out.println(a13);
		System.out.println("=====================");
		System.out.println(a14);
		System.out.println("=====================");
		System.out.println(a15);
		System.out.println("=====================");
		System.out.println(a16);
		System.out.println("=====================");
		System.out.println(a17);
		System.out.println("=====================");
		System.out.println(a18);
		System.out.println("=====================");
		System.out.println(a19);
		System.out.println("=====================");
		System.out.println(a20);
		
		
		System.out.println("==================a11 Details====================");
		a11.eat();
		a11.sound();
		((Cat)a11).climb();
		
		System.out.println("==================a12 Details====================");
		a12.eat();
		a12.sound();
		((Cat)a12).climb();
		
		System.out.println("==================a13 Details====================");
		a13.eat();
		a13.sound();
		((Cat)a13).climb();
		
		System.out.println("==================a14 Details====================");
		a14.eat();
		a14.sound();
		((Cat)a14).climb();
		
		System.out.println("==================a15 Details====================");
		a15.eat();
		a15.sound();
		((Cat)a15).climb();
		
		System.out.println("==================a16 Details====================");
		a16.eat();
		a16.sound();
		((Cat)a16).climb();
		
		System.out.println("==================a17 Details====================");
		a17.eat();
		a17.sound();
		((Cat)a17).climb();
		
		System.out.println("==================a18 Details====================");
		a18.eat();
		a18.sound();
		((Cat)a18).climb();
		
		System.out.println("==================a19 Details====================");
		a19.eat();
		a19.sound();
		((Cat)a19).climb();
		
		System.out.println("==================a20 Details====================");
		a20.eat();
		a20.sound();
		((Cat)a20).climb();
		
		System.out.println("==============================================================================================");
		
		Animal a21 = new Lion(301, "Simba", "Wild Animal", 5, "Male", 190.0, "Golden", "Savannah", "Pride Rock", "Savannah", "Meat", "Stalk and Pounce", true);
		Animal a22 = new Lion(302, "Mufasa", "Wild Animal", 8, "Male", 210.0, "Golden Brown", "Savannah", "Royal Pride", "Western Savannah", "Meat", "Group Hunting", true);
		Animal a23 = new Lion(303, "Scar", "Wild Animal", 7, "Male", 185.0, "Dark Golden", "Savannah", "Black Pride", "Eastern Savannah", "Meat", "Ambush Hunting", false);
		Animal a24 = new Lion(304, "Nala", "Wild Animal", 6, "Female", 130.0, "Light Golden", "Savannah", "Pride Rock", "Southern Savannah", "Meat", "Stalk and Chase", true);
		Animal a25 = new Lion(305, "Kovu", "Wild Animal", 4, "Male", 175.0, "Golden", "Grassland", "Outlander Pride", "Northern Grassland", "Meat", "Stalk and Pounce", true);
		Animal a26 = new Lion(306, "Kiara", "Wild Animal", 3, "Female", 115.0, "Golden Brown", "Grassland", "Royal Pride", "Eastern Grassland", "Meat", "Team Hunting", true);
		Animal a27 = new Lion(307, "Leo", "Wild Animal", 9, "Male", 220.0, "Golden Brown", "Savannah", "Alpha Pride", "Central Savannah", "Meat", "Group Hunting", true);
		Animal a28 = new Lion(308, "Zara", "Wild Animal", 5, "Female", 125.0, "Golden", "Savannah", "Desert Pride", "Southern Savannah", "Meat", "Stalk and Pounce", true);
		Animal a29 = new Lion(309, "Rafiki", "Wild Animal", 10, "Male", 215.0, "Dark Golden", "Grassland", "Mountain Pride", "Mountain Savannah", "Meat", "Ambush Hunting", false);
		Animal a30 = new Lion(310, "Asha", "Wild Animal", 4, "Female", 120.0, "Light Golden", "Savannah", "Sunset Pride", "Western Savannah", "Meat", "Stalk and Chase", true);
		
		System.out.println(a21);
		System.out.println("=====================");
		System.out.println(a22);
		System.out.println("=====================");
		System.out.println(a23);
		System.out.println("=====================");
		System.out.println(a24);
		System.out.println("=====================");
		System.out.println(a25);
		System.out.println("=====================");
		System.out.println(a26);
		System.out.println("=====================");
		System.out.println(a27);
		System.out.println("=====================");
		System.out.println(a28);
		System.out.println("=====================");
		System.out.println(a29);
		System.out.println("=====================");
		System.out.println(a30);
		
		System.out.println("==================a21 Details====================");
		a21.eat();
		a21.sound();
		((Lion)a21).hunt();
		
		System.out.println("==================a22 Details====================");
		a22.eat();
		a22.sound();
		((Lion)a22).hunt();
		
		System.out.println("==================a23 Details====================");
		a23.eat();
		a23.sound();
		((Lion)a23).hunt();
		
		System.out.println("==================a24 Details====================");
		a24.eat();
		a24.sound();
		((Lion)a24).hunt();
		
		System.out.println("==================a25 Details====================");
		a25.eat();
		a25.sound();
		((Lion)a25).hunt();
		
		System.out.println("==================a26 Details====================");
		a26.eat();
		a26.sound();
		((Lion)a26).hunt();
		
		System.out.println("==================a27 Details====================");
		a27.eat();
		a27.sound();
		((Lion)a27).hunt();
		
		System.out.println("==================a28 Details====================");
		a28.eat();
		a28.sound();
		((Lion)a28).hunt();
		
		System.out.println("==================a29 Details====================");
		a29.eat();
		a29.sound();
		((Lion)a29).hunt();
		
		System.out.println("==================a30 Details====================");
		a30.eat();
		a30.sound();
		((Lion)a30).hunt();
		
		
	}
}
