package projects.Footwear;

import java.util.Scanner;

public class FootwearStore {
	
	    public Footwear selectAndGetFootwear() {

	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("====================================");
	        System.out.println("      WELCOME TO FOOTWEAR STORE");
	        System.out.println("====================================");
	        
	        System.out.println("=====================================================================");
	        System.out.println("    Buy Branded Footwear At Exciting Offers For Varoius Purposes      ");
	        System.out.println("=====================================================================");

	        System.out.println("Press 1  ===> To Choose Shoes");
	        System.out.println("Press 2  ===> To Choose Sneakers");
	        System.out.println("Press 3  ===> To Choose Boots");
	        System.out.println("Press 4  ===> To Choose Sandals");
	        System.out.println("Press 5  ===> To Choose Slippers");
	        System.out.println("Press 6  ===> To Choose Loafers");
	        System.out.println("Press 7  ===> To Choose Heels");
	        System.out.println("Press 8  ===> To Choose Sports Shoes");
	        System.out.println("Press 9  ===> To Choose Formal Shoes");
	        System.out.println("Press 10 ===> To Choose Flip Flops");

	        System.out.println("Enter Your Choice:");
	        int choice = Integer.parseInt(sc.nextLine());


	        // =============== SHOES ===============

	        if (choice == 1) {

	            System.out.println("You Have Chosen Shoes");

	            System.out.println("Enter Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Size:");
	            int size = Integer.parseInt(sc.nextLine());

	            System.out.println("Enter Brand Name:");
	            String brandname = sc.nextLine();

	            System.out.println("Enter Color:");
	            String color = sc.nextLine();

	            System.out.println("Enter Material:");
	            String material = sc.nextLine();

	            return new Shoes(name, price, size, brandname, color, material);
	        }


	        // =============== SNEAKERS ===============

	        else if (choice == 2) {

	            System.out.println("You Have Chosen Sneakers");

	            System.out.println("Enter Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Size:");
	            int size = Integer.parseInt(sc.nextLine());

	            System.out.println("Enter Brand Name:");
	            String brandname = sc.nextLine();

	            System.out.println("Enter Color:");
	            String color = sc.nextLine();

	            System.out.println("Has Lace (true/false):");
	            boolean isLace = Boolean.parseBoolean(sc.nextLine());

	            return new Sneakers(name, price, size, brandname, color, isLace);
	        }


	        // =============== BOOTS ===============

	        else if (choice == 3) {

	            System.out.println("You Have Chosen Boots");

	            System.out.println("Enter Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Size:");
	            int size = Integer.parseInt(sc.nextLine());

	            System.out.println("Enter Brand Name:");
	            String brandname = sc.nextLine();

	            System.out.println("Enter Boot Type:");
	            String bootType = sc.nextLine();

	            System.out.println("Is Waterproof (true/false):");
	            boolean isWaterproof = Boolean.parseBoolean(sc.nextLine());

	            return new Boot(name, price, size, brandname, bootType, isWaterproof);
	        }


	        // =============== SANDALS ===============

	        else if (choice == 4) {

	            System.out.println("You Have Chosen Sandals");

	            System.out.println("Enter Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Size:");
	            int size = Integer.parseInt(sc.nextLine());

	            System.out.println("Enter Brand Name:");
	            String brandname = sc.nextLine();

	            System.out.println("Enter Material:");
	            String material = sc.nextLine();

	            System.out.println("Enter Color:");
	            String color = sc.nextLine();

	            return new Sandal(name, price, size, brandname, material, color);
	        }


	        // =============== SLIPPERS ===============

	        else if (choice == 5) {

	            System.out.println("You Have Chosen Slippers");

	            System.out.println("Enter Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Size:");
	            int size = Integer.parseInt(sc.nextLine());

	            System.out.println("Enter Brand Name:");
	            String brandname = sc.nextLine();

	            System.out.println("Enter Material:");
	            String material = sc.nextLine();

	            System.out.println("Is Soft (true/false):");
	            boolean isSoft = Boolean.parseBoolean(sc.nextLine());

	            return new Slippers(name, price, size, brandname, material, isSoft);
	        }


	        // =============== LOAFERS ===============

	        else if (choice == 6) {

	            System.out.println("You Have Chosen Loafers");

	            System.out.println("Enter Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Size:");
	            int size = Integer.parseInt(sc.nextLine());

	            System.out.println("Enter Brand Name:");
	            String brandname = sc.nextLine();

	            System.out.println("Enter Color:");
	            String color = sc.nextLine();

	            System.out.println("Enter Leather Type:");
	            String leatherType = sc.nextLine();

	            return new Loafers(name, price, size, brandname, color, leatherType);
	        }


	        // =============== HEELS ===============

	        else if (choice == 7) {

	            System.out.println("You Have Chosen Heels");

	            System.out.println("Enter Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Size:");
	            int size = Integer.parseInt(sc.nextLine());

	            System.out.println("Enter Brand Name:");
	            String brandname = sc.nextLine();

	            System.out.println("Enter Heel Height:");
	            double heelHeight = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Color:");
	            String color = sc.nextLine();

	            return new Heels(name, price, size, brandname, heelHeight, color);
	        }


	        // =============== SPORTS SHOES ===============

	        else if (choice == 8) {

	            System.out.println("You Have Chosen Sports Shoes");

	            System.out.println("Enter Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Size:");
	            int size = Integer.parseInt(sc.nextLine());

	            System.out.println("Enter Brand Name:");
	            String brandname = sc.nextLine();

	            System.out.println("Enter Sport Type:");
	            String sportType = sc.nextLine();

	            System.out.println("Is Lightweight (true/false):");
	            boolean isLightWeight = Boolean.parseBoolean(sc.nextLine());

	            return new SportsShoes(name, price, size, brandname, sportType, isLightWeight);
	        }


	        // =============== FORMAL SHOES ===============

	        else if (choice == 9) {

	            System.out.println("You Have Chosen Formal Shoes");

	            System.out.println("Enter Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Size:");
	            int size = Integer.parseInt(sc.nextLine());

	            System.out.println("Enter Brand Name:");
	            String brandname = sc.nextLine();

	            System.out.println("Enter Color:");
	            String color = sc.nextLine();

	            System.out.println("Enter Material:");
	            String material = sc.nextLine();

	            return new FormalShoes(name, price, size, brandname, color, material);
	        } 


	        // =============== FLIP FLOPS ===============

	        else if (choice == 10) {

	            System.out.println("You Have Chosen Flip Flops");

	            System.out.println("Enter Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Size:");
	            int size = Integer.parseInt(sc.nextLine());

	            System.out.println("Enter Brand Name:");
	            String brandname = sc.nextLine();

	            System.out.println("Enter Color:");
	            String color = sc.nextLine();

	            System.out.println("Enter Material:");
	            String material = sc.nextLine();

	            return new FlipFlops(name, price, size, brandname, color, material);
	        }


	        else {

	            System.out.println("Invalid Choice");
	            return selectAndGetFootwear();
	        }
	    }
	

}
