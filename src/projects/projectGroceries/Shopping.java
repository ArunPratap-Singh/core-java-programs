package projects.projectGroceries;

import java.util.Scanner;

public class Shopping {
	
	    public Grocery selectAndGetGroceries() {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("======================================");
	        System.out.println("      WELCOME TO GROCERY SHOP        ");
	        System.out.println("======================================");
	        
	        System.out.println("========================================");
	        System.out.println("  Today Heavy Discount On Grocery Items  ");
	        System.out.println("========================================");
	        
	        System.out.println("=======================================");
	        System.out.println("      Shop And Get Exciting Offers"     );
	        System.out.println("=======================================");
	        
	        System.out.println("Press 1 ===> To Choose Rice");
	        System.out.println("Press 2 ===> To Choose Wheat");
	        System.out.println("Press 3 ===> To Choose Sugar");
	        System.out.println("Press 4 ===> To Choose Salt");
	        System.out.println("Press 5 ===> To Choose Oil");
	        System.out.println("Press 6 ===> To Choose Milk");
	        System.out.println("Press 7 ===> To Choose Bread");
	        System.out.println("Press 8 ===> To Choose Eggs");
	        System.out.println("Press 9 ===> To Choose Apple");
	        System.out.println("Press 10 ==> To Choose Potato");

	        System.out.println("Enter Your Choice:");
	        int choice = Integer.parseInt(sc.nextLine());

	        switch(choice) {
	        
	        case 1:

	            System.out.println("You Have Chosen Rice");

	            System.out.println("Enter Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Quantity:");
	            int quantity = Integer.parseInt(sc.nextLine());

	            System.out.println("Enter Brand Name:");
	            String brandname = sc.nextLine();

	            System.out.println("Enter Rice Type:");
	            String type = sc.nextLine();

	            System.out.println("Enter Weight:");
	            double weight = Double.parseDouble(sc.nextLine());

	            return new Rice(name, price, quantity, brandname, type, weight);
	        
	        case 2:

	            System.out.println("You Have Chosen Wheat");

	            System.out.println("Enter Name:");
	            String name1 = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price1 = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Quantity:");
	            int quantity1 = Integer.parseInt(sc.nextLine());

	            System.out.println("Enter Brand Name:");
	            String brandname1 = sc.nextLine();

	            System.out.println("Enter Quality:");
	            String quality1 = sc.nextLine();

	            System.out.println("Enter Weight:");
	            double weight1 = Double.parseDouble(sc.nextLine());

	            return new Wheat(name1, price1, quantity1, brandname1, quality1, weight1);
	        
	        case 3:

	            System.out.println("You Have Chosen Sugar");

	            System.out.println("Enter Name:");
	            String name2 = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price2 = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Quantity:");
	            int quantity2 = Integer.parseInt(sc.nextLine());

	            System.out.println("Enter Brand Name:");
	            String brandname2 = sc.nextLine();

	            System.out.println("Enter Sugar Type:");
	            String type2 = sc.nextLine();

	            System.out.println("Is Refined (true/false):");
	            boolean isRefined2 = Boolean.parseBoolean(sc.nextLine());

	            return new Sugar(name2, price2, quantity2, brandname2, type2, isRefined2);
	        

	        case 4:

	            System.out.println("You Have Chosen Salt");

	            System.out.println("Enter Name:");
	            String name3 = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price3 = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Quantity:");
	            int quantity3 = Integer.parseInt(sc.nextLine());

	            System.out.println("Enter Brand Name:");
	            String brandname3 = sc.nextLine();

	            System.out.println("Enter Salt Type:");
	            String type3 = sc.nextLine();

	            System.out.println("Is Iodized (true/false):");
	            boolean isIodized3 = Boolean.parseBoolean(sc.nextLine());

	            return new Salt(name3, price3, quantity3, brandname3, type3, isIodized3);
	        

	        case 5:

	            System.out.println("You Have Chosen Oil");

	            System.out.println("Enter Name:");
	            String name4 = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price4 = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Quantity:");
	            int quantity4 = Integer.parseInt(sc.nextLine());

	            System.out.println("Enter Brand Name:");
	            String brandname4 = sc.nextLine();

	            System.out.println("Enter Oil Type:");
	            String oiltype4 = sc.nextLine();

	            System.out.println("Enter Liters:");
	            double liters4 = Double.parseDouble(sc.nextLine());

	            return new Oil(name4, price4, quantity4, brandname4, oiltype4, liters4);
	        

	        case 6:

	            System.out.println("You Have Chosen Milk");

	            System.out.println("Enter Name:");
	            String name5 = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price5 = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Quantity:");
	            int quantity5 = Integer.parseInt(sc.nextLine());

	            System.out.println("Enter Brand Name:");
	            String brandname5 = sc.nextLine();

	            System.out.println("Enter Milk Type:");
	            String milktype5 = sc.nextLine();

	            System.out.println("Enter Liters:");
	            double liters5 = Double.parseDouble(sc.nextLine());

	            return new Milk(name5, price5, quantity5, brandname5, milktype5, liters5);
	        

	        case 7:

	            System.out.println("You Have Chosen Bread");

	            System.out.println("Enter Name:");
	            String name6 = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price6 = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Quantity:");
	            int quantity6 = Integer.parseInt(sc.nextLine());

	            System.out.println("Enter Brand Name:");
	            String brandname6 = sc.nextLine();

	            System.out.println("Enter Bread Type:");
	            String breadtype6 = sc.nextLine();

	            System.out.println("Enter Number Of Slices:");
	            int slices6 = Integer.parseInt(sc.nextLine());

	            return new Bread(name6, price6, quantity6, brandname6, breadtype6, slices6);
	        

	        case 8:

	            System.out.println("You Have Chosen Eggs");

	            System.out.println("Enter Name:");
	            String name7 = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price7 = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Quantity:");
	            int quantity7 = Integer.parseInt(sc.nextLine());

	            System.out.println("Enter Brand Name:");
	            String brandname7 = sc.nextLine();

	            System.out.println("Enter Egg Type:");
	            String eggtype7 = sc.nextLine();

	            System.out.println("Enter Total Eggs:");
	            int totalEggs7 = Integer.parseInt(sc.nextLine());

	            return new Eggs(name7, price7, quantity7, brandname7, eggtype7, totalEggs7);
	        

	        case 9:

	            System.out.println("You Have Chosen Apple");

	            System.out.println("Enter Name:");
	            String name8 = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price8 = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Quantity:");
	            int quantity8 = Integer.parseInt(sc.nextLine());

	            System.out.println("Enter Variety:");
	            String variety8 = sc.nextLine();

	            System.out.println("Enter Color:");
	            String color8 = sc.nextLine();

	            System.out.println("Enter Origin:");
	            String origin8 = sc.nextLine();

	            return new Apple(name8, price8, quantity8, variety8, color8, origin8);
	        

	        case 10: 

	            System.out.println("You Have Chosen Potato");

	            System.out.println("Enter Name:");
	            String name9 = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price9 = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Quantity:");
	            int quantity9 = Integer.parseInt(sc.nextLine());

	            System.out.println("Enter Variety:");
	            String variety9 = sc.nextLine();

	            System.out.println("Enter Quality:");
	            String quality9 = sc.nextLine();

	            System.out.println("Is Fresh (true/false):");
	            boolean isFresh9 = Boolean.parseBoolean(sc.nextLine());

	            return new Potato(name9, price9, quantity9, variety9, quality9, isFresh9);
	        

	        default:

	            System.out.println("Invalid Choice");
	            return selectAndGetGroceries( );
	          
	            	                       
	        }
	       
	    }
	

}
