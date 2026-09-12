package projects.FastFood;

import java.util.Scanner;

public class Dominoz {
	
	    public FastFood selectAndGetFastFood() {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("====================================");
	        System.out.println("       WELCOME TO DOMINOS");
	        System.out.println("====================================");
	        
	        System.out.println("====================================");
	        System.out.println("     Buy Meals At Exciting offers    ");
	        System.out.println("====================================");

	        System.out.println("Press 1  ===> To Choose Pizza");
	        System.out.println("Press 2  ===> To Choose Burger");
	        System.out.println("Press 3  ===> To Choose Sandwich");
	        System.out.println("Press 4  ===> To Choose Pasta");
	        System.out.println("Press 5  ===> To Choose Garlic Bread");
	        System.out.println("Press 6  ===> To Choose French Fries");
	        System.out.println("Press 7  ===> To Choose Noodles");
	        System.out.println("Press 8  ===> To Choose Taco");
	        System.out.println("Press 9  ===> To Choose Wrap");
	        System.out.println("Press 10 ===> To Choose Hot Dog");

	        System.out.println("Enter Your Choice:");
	        int choice = Integer.parseInt(sc.nextLine());

	        // ================= PIZZA =================

	        switch(choice) {
	        
	        case 1:

	            System.out.println("You Have Chosen Pizza");

	            System.out.println("Enter Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Quantity:");
	            int quantity = Integer.parseInt(sc.nextLine());

	            System.out.println("Enter Brand Name:");
	            String brandname = sc.nextLine();

	            System.out.println("Enter Size:");
	            String size = sc.nextLine();

	            System.out.println("Enter Topping:");
	            String topping = sc.nextLine();

	            return new Pizza(name, price, quantity, brandname, size, topping);
	        

	        // ================= BURGER =================

	        case 2:

	            System.out.println("You Have Chosen Burger");

	            System.out.println("Enter Name:");
	            String name1 = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price1 = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Quantity:");
	            int quantity1 = Integer.parseInt(sc.nextLine());

	            System.out.println("Enter Brand Name:");
	            String brandname1 = sc.nextLine();

	            System.out.println("Enter Burger Type:");
	            String burgerType1 = sc.nextLine();

	            System.out.println("Is Veg (true/false):");
	            boolean isVeg1 = Boolean.parseBoolean(sc.nextLine());

	            return new Burger(name1, price1, quantity1, brandname1, burgerType1, isVeg1);
	        

	        // ================= SANDWICH =================

	        case 3:

	            System.out.println("You Have Chosen Sandwich");

	            System.out.println("Enter Name:");
	            String name2 = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price2 = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Quantity:");
	            int quantity2 = Integer.parseInt(sc.nextLine());

	            System.out.println("Enter Bread Type:");
	            String breadType2 = sc.nextLine();

	            System.out.println("Enter Filling:");
	            String filling2 = sc.nextLine();

	            System.out.println("Is Grilled (true/false):");
	            boolean isGrilled2 = Boolean.parseBoolean(sc.nextLine());

	            return new Sandwich(name2, price2, quantity2, breadType2, filling2, isGrilled2);
	        

	        // ================= PASTA =================

	        case 4:

	            System.out.println("You Have Chosen Pasta");

	            System.out.println("Enter Name:");
	            String name3 = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price3 = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Quantity:");
	            int quantity3 = Integer.parseInt(sc.nextLine());

	            System.out.println("Enter Pasta Type:");
	            String pastaType3 = sc.nextLine();

	            System.out.println("Enter Sauce Type:");
	            String sauceType3 = sc.nextLine();

	            System.out.println("Enter Cheese Type:");
	            String cheeseType3 = sc.nextLine();

	            return new Pasta(name3, price3, quantity3, pastaType3, sauceType3, cheeseType3);
	        

	        // ================= GARLIC BREAD =================

	        case 5: 

	            System.out.println("You Have Chosen Garlic Bread");

	            System.out.println("Enter Name:");
	            String name4 = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price4 = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Quantity:");
	            int quantity4 = Integer.parseInt(sc.nextLine());

	            System.out.println("Enter Bread Type:");
	            String breadType4 = sc.nextLine();

	            System.out.println("Enter Cheese Type:");
	            String cheeseType4 = sc.nextLine();

	            System.out.println("Enter Pieces:");
	            int pieces4 = Integer.parseInt(sc.nextLine());

	            return new GarlicBread(name4, price4, quantity4, breadType4, cheeseType4, pieces4);
	        

	        // ================= FRENCH FRIES =================

	        case 6: 

	            System.out.println("You Have Chosen French Fries");

	            System.out.println("Enter Name:");
	            String name5 = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price5 = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Quantity:");
	            int quantity5 = Integer.parseInt(sc.nextLine());

	            System.out.println("Enter Size:");
	            String size5 = sc.nextLine();

	            System.out.println("Enter Seasoning:");
	            String seasoning5 = sc.nextLine();

	            System.out.println("Is Cheesy (true/false):");
	            boolean isCheesy5 = Boolean.parseBoolean(sc.nextLine());

	            return new FrenchFries(name5, price5, quantity5, size5, seasoning5, isCheesy5);
	        

	        // ================= NOODLES =================

	        case 7: 

	            System.out.println("You Have Chosen Noodles");

	            System.out.println("Enter Name:");
	            String name6 = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price6 = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Quantity:");
	            int quantity6 = Integer.parseInt(sc.nextLine());

	            System.out.println("Enter Noodle Type:");
	            String noodleType6 = sc.nextLine();

	            System.out.println("Enter Spice Level:");
	            String spiceLevel6 = sc.nextLine();

	            System.out.println("Is Veg (true/false):");
	            boolean isVeg6 = Boolean.parseBoolean(sc.nextLine());

	            return new Noodles(name6, price6, quantity6, noodleType6, spiceLevel6, isVeg6);
	        

	        // ================= TACO =================

	        case 8:

	            System.out.println("You Have Chosen Taco");

	            System.out.println("Enter Name:");
	            String name7 = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price7 = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Quantity:");
	            int quantity7 = Integer.parseInt(sc.nextLine());

	            System.out.println("Enter Shell Type:");
	            String shellType7 = sc.nextLine();

	            System.out.println("Enter Filling:");
	            String filling7 = sc.nextLine();

	            System.out.println("Is Spicy (true/false):");
	            boolean isSpicy7 = Boolean.parseBoolean(sc.nextLine());

	            return new Taco(name7, price7, quantity7, shellType7, filling7, isSpicy7);
	        

	        // ================= WRAP =================

	        case 9:

	            System.out.println("You Have Chosen Wrap");

	            System.out.println("Enter Name:");
	            String name8 = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price8 = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Quantity:");
	            int quantity8 = Integer.parseInt(sc.nextLine());

	            System.out.println("Enter Wrap Type:");
	            String wrapType8 = sc.nextLine();

	            System.out.println("Enter Filling:");
	            String filling8 = sc.nextLine();

	            System.out.println("Enter Sauce:");
	            String sauce8 = sc.nextLine();

	            return new Wrap(name8, price8, quantity8, wrapType8, filling8, sauce8);
	       
	        // ================= HOT DOG =================

	        case 10:

	            System.out.println("You Have Chosen Hot Dog");

	            System.out.println("Enter Name:");
	            String name9 = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price9 = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Quantity:");
	            int quantity9 = Integer.parseInt(sc.nextLine());

	            System.out.println("Enter Bread Type:");
	            String breadType9 = sc.nextLine();

	            System.out.println("Enter Sausage Type:");
	            String sausageType9 = sc.nextLine();

	            System.out.println("Is Cheesy (true/false):");
	            boolean isCheesy9 = Boolean.parseBoolean(sc.nextLine());

	            return new HotDog(name9, price9, quantity9,
	                    breadType9, sausageType9, isCheesy9);
	        

	        default:

	            System.out.println("Invalid Choice");
	            return selectAndGetFastFood();
	        
	        }    
	    }

}
