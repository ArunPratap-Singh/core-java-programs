package projects.FoodItem;

import java.util.Scanner;

public class User {
	
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        Zomato z = new Zomato();

	        boolean continueShopping = true;


	        while (continueShopping) {

	            FoodItems f = z.selectAndGetFood();


	            if (f != null) {

	                System.out.println("========================================");
	                System.out.println("          YOUR ORDER DETAILS");
	                System.out.println("========================================");

	                // PIZZA

	                if (f instanceof Pizza) {

	                    Pizza p = (Pizza) f;

	                    System.out.println("Food Name: " + p.name);
	                    System.out.println("Price: " + p.price);
	                    System.out.println("Restaurant: " + p.restaurantName);
	                    System.out.println("Size: " + p.size);
	                    System.out.println("Crust Type: " + p.crustType);
	                    System.out.println("Extra Cheese: " + p.extraCheese);
	                }

	                // BURGER

	                else if (f instanceof Burger) {

	                    Burger b = (Burger) f;

	                    System.out.println("Food Name: " + b.name);
	                    System.out.println("Price: " + b.price);
	                    System.out.println("Restaurant: " + b.restaurantName);
	                    System.out.println("Burger Type: " + b.burgerType);
	                    System.out.println("Patty Type: " + b.pattyType);
	                    System.out.println("Extra Cheese: " + b.extraCheese);
	                }

	                // SANDWICH

	                else if (f instanceof Sandwich) {

	                    Sandwich s = (Sandwich) f;

	                    System.out.println("Food Name: " + s.name);
	                    System.out.println("Price: " + s.price);
	                    System.out.println("Restaurant: " + s.restaurantName);
	                    System.out.println("Bread Type: " + s.breadType);
	                    System.out.println("Filling: " + s.filling);
	                    System.out.println("Grilled: " + s.grilled);
	                }

	                // PASTA

	                else if (f instanceof Pasta) {

	                    Pasta p = (Pasta) f;

	                    System.out.println("Food Name: " + p.name);
	                    System.out.println("Price: " + p.price);
	                    System.out.println("Restaurant: " + p.restaurantName);
	                    System.out.println("Pasta Type: " + p.pastaType);
	                    System.out.println("Sauce Type: " + p.sauceType);
	                    System.out.println("Spice Level: " + p.spiceLevel);
	                }

	                // BIRYANI

	                else if (f instanceof Biryani) {

	                    Biryani b = (Biryani) f;

	                    System.out.println("Food Name: " + b.name);
	                    System.out.println("Price: " + b.price);
	                    System.out.println("Restaurant: " + b.restaurantName);
	                    System.out.println("Biryani Type: " + b.biryaniType);
	                    System.out.println("Quantity: " + b.quantity);
	                    System.out.println("Raita Included: " + b.raitaIncluded);
	                }

	                // NOODLES

	                else if (f instanceof Noodles) {

	                    Noodles n = (Noodles) f;

	                    System.out.println("Food Name: " + n.name);
	                    System.out.println("Price: " + n.price);
	                    System.out.println("Restaurant: " + n.restaurantName);
	                    System.out.println("Noodle Type: " + n.noodleType);
	                    System.out.println("Sauce: " + n.sauce);
	                    System.out.println("Spice Level: " + n.spiceLevel);
	                }

	                // MOMOS

	                else if (f instanceof Momos) {

	                    Momos m = (Momos) f;

	                    System.out.println("Food Name: " + m.name);
	                    System.out.println("Price: " + m.price);
	                    System.out.println("Restaurant: " + m.restaurantName);
	                    System.out.println("Momo Type: " + m.momoType);
	                    System.out.println("Pieces: " + m.pieces);
	                    System.out.println("Fried: " + m.fried);
	                }

	                // DOSA

	                else if (f instanceof Dosa) {

	                    Dosa d = (Dosa) f;

	                    System.out.println("Food Name: " + d.name);
	                    System.out.println("Price: " + d.price);
	                    System.out.println("Restaurant: " + d.restaurantName);
	                    System.out.println("Dosa Type: " + d.dosaType);
	                    System.out.println("Filling: " + d.filling);
	                    System.out.println("Chutney Included: " + d.chutneyIncluded);
	                }

	                // IDLI

	                else if (f instanceof Idli) {

	                    Idli i = (Idli) f;

	                    System.out.println("Food Name: " + i.name);
	                    System.out.println("Price: " + i.price);
	                    System.out.println("Restaurant: " + i.restaurantName);
	                    System.out.println("Pieces: " + i.pieces);
	                    System.out.println("Chutney Type: " + i.chutneyType);
	                    System.out.println("Sambar Included: " + i.sambarIncluded);
	                }

	                // SAMOSA

	                else if (f instanceof Samosa) {

	                    Samosa s = (Samosa) f;

	                    System.out.println("Food Name: " + s.name);
	                    System.out.println("Price: " + s.price);
	                    System.out.println("Restaurant: " + s.restaurantName);
	                    System.out.println("Quantity: " + s.quantity);
	                    System.out.println("Filling: " + s.filling);
	                    System.out.println("Chutney Type: " + s.chutneyType);
	                }

	                // CHOLE BHATURE

	                else if (f instanceof CholeBhature) {

	                    CholeBhature c = (CholeBhature) f;

	                    System.out.println("Food Name: " + c.name);
	                    System.out.println("Price: " + c.price);
	                    System.out.println("Restaurant: " + c.restaurantName);
	                    System.out.println("Bhature Quantity: " + c.bhatureQuantity);
	                    System.out.println("Chole Type: " + c.choleType);
	                    System.out.println("Pickle Included: " + c.pickleIncluded);
	                }

	                // PANEER TIKKA

	                else if (f instanceof PaneerTikka) {

	                    PaneerTikka p = (PaneerTikka) f;

	                    System.out.println("Food Name: " + p.name);
	                    System.out.println("Price: " + p.price);
	                    System.out.println("Restaurant: " + p.restaurantName);
	                    System.out.println("Tikka Type: " + p.tikkaType);
	                    System.out.println("Pieces: " + p.pieces);
	                    System.out.println("Spice Level: " + p.spiceLevel);
	                }

	                // FRIED RICE

	                else if (f instanceof FriedRice) {

	                    FriedRice fr = (FriedRice) f;

	                    System.out.println("Food Name: " + fr.name);
	                    System.out.println("Price: " + fr.price);
	                    System.out.println("Restaurant: " + fr.restaurantName);
	                    System.out.println("Rice Type: " + fr.riceType);
	                    System.out.println("Vegetable Type: " + fr.vegetableType);
	                    System.out.println("Spice Level: " + fr.spiceLevel);
	                }

	                // CAKE

	                else if (f instanceof Cake) {

	                    Cake c = (Cake) f;

	                    System.out.println("Food Name: " + c.name);
	                    System.out.println("Price: " + c.price);
	                    System.out.println("Restaurant: " + c.restaurantName);
	                    System.out.println("Flavour: " + c.flavour);
	                    System.out.println("Weight: " + c.weight);
	                    System.out.println("Eggless: " + c.eggless);
	                }

	                // ICE CREAM

	                else if (f instanceof IceCream) {

	                    IceCream i = (IceCream) f;

	                    System.out.println("Food Name: " + i.name);
	                    System.out.println("Price: " + i.price);
	                    System.out.println("Restaurant: " + i.restaurantName);
	                    System.out.println("Flavour: " + i.flavour);
	                    System.out.println("Scoops: " + i.scoops);
	                    System.out.println("Cone Type: " + i.coneType);
	                }

	                // GULAB JAMUN

	                else if (f instanceof GulabJamun) {

	                    GulabJamun g = (GulabJamun) f;

	                    System.out.println("Food Name: " + g.name);
	                    System.out.println("Price: " + g.price);
	                    System.out.println("Restaurant: " + g.restaurantName);
	                    System.out.println("Pieces: " + g.pieces);
	                    System.out.println("Sweetness Level: " + g.sweetnessLevel);
	                    System.out.println("Served Hot: " + g.servedHot);
	                }

	                // DONUT

	                else if (f instanceof Donut) {

	                    Donut d = (Donut) f;

	                    System.out.println("Food Name: " + d.name);
	                    System.out.println("Price: " + d.price);
	                    System.out.println("Restaurant: " + d.restaurantName);
	                    System.out.println("Flavour: " + d.flavour);
	                    System.out.println("Topping: " + d.topping);
	                    System.out.println("Filled: " + d.filled);
	                }

	                // FRENCH FRIES

	                else if (f instanceof FrenchFries) {

	                    FrenchFries ff = (FrenchFries) f;

	                    System.out.println("Food Name: " + ff.name);
	                    System.out.println("Price: " + ff.price);
	                    System.out.println("Restaurant: " + ff.restaurantName);
	                    System.out.println("Size: " + ff.size);
	                    System.out.println("Seasoning: " + ff.seasoning);
	                    System.out.println("Cheese Dip: " + ff.cheeseDip);
	                }

	                // SHAWARMA

	                else if (f instanceof Shawarma) {

	                    Shawarma s = (Shawarma) f;

	                    System.out.println("Food Name: " + s.name);
	                    System.out.println("Price: " + s.price);
	                    System.out.println("Restaurant: " + s.restaurantName);
	                    System.out.println("Shawarma Type: " + s.shawarmaType);
	                    System.out.println("Filling: " + s.filling);
	                    System.out.println("Extra Sauce: " + s.extraSauce);
	                }

	                // ROLLS

	                else if (f instanceof Rolls) {

	                    Rolls r = (Rolls) f;

	                    System.out.println("Food Name: " + r.name);
	                    System.out.println("Price: " + r.price);
	                    System.out.println("Restaurant: " + r.restaurantName);
	                    System.out.println("Roll Type: " + r.rollType);
	                    System.out.println("Filling: " + r.filling);
	                    System.out.println("Sauce Type: " + r.sauceType);
	                }
	                
	             // BURGER PIZZA

	                else if (f instanceof BurgerPizza) {

	                    BurgerPizza bp = (BurgerPizza) f;
	                    System.out.println("Food Name: " + bp.name);
	                    System.out.println("Price: " + bp.price);
	                    System.out.println("Restaurant: " + bp.restaurantName);
	                    System.out.println("Size: " + bp.size);
	                    System.out.println("Topping: " + bp.topping);
	                    System.out.println("Extra Cheese: " + bp.extraCheese);
	                }


	                // GARLIC BREAD

	                else if (f instanceof GarlicBread) {

	                    GarlicBread gb = (GarlicBread) f;
	                    System.out.println("Food Name: " + gb.name);
	                    System.out.println("Price: " + gb.price);
	                    System.out.println("Restaurant: " + gb.restaurantName);
	                    System.out.println("Pieces: " + gb.pieces);
	                    System.out.println("Bread Type: " + gb.breadType);
	                    System.out.println("Cheese Added: " + gb.cheeseAdded);
	                }


	                // SPRING ROLL

	                else if (f instanceof SpringRoll) {

	                    SpringRoll sr = (SpringRoll) f;
	                    System.out.println("Food Name: " + sr.name);
	                    System.out.println("Price: " + sr.price);
	                    System.out.println("Restaurant: " + sr.restaurantName);
	                    System.out.println("Filling: " + sr.filling);
	                    System.out.println("Pieces: " + sr.pieces);
	                    System.out.println("Sauce Type: " + sr.sauceType);
	                }


	                // MANCHURIAN

	                else if (f instanceof Manchurian) {

	                    Manchurian m = (Manchurian) f;
	                    System.out.println("Food Name: " + m.name);
	                    System.out.println("Price: " + m.price);
	                    System.out.println("Restaurant: " + m.restaurantName);
	                    System.out.println("Manchurian Type: " + m.type);
	                    System.out.println("Sauce Type: " + m.sauceType);
	                    System.out.println("Spice Level: " + m.spiceLevel);
	                }


	                // PAV BHAJI

	                else if (f instanceof PavBhaji) {

	                    PavBhaji pb = (PavBhaji) f;
	                    System.out.println("Food Name: " + pb.name);
	                    System.out.println("Price: " + pb.price);
	                    System.out.println("Restaurant: " + pb.restaurantName);
	                    System.out.println("Pav Pieces: " + pb.pavPieces);
	                    System.out.println("Spice Level: " + pb.spiceLevel);
	                    System.out.println("Butter Added: " + pb.butterAdded);
	                }


	                // VADA PAV

	                else if (f instanceof VadaPav) {

	                    VadaPav vp = (VadaPav) f;
	                    System.out.println("Food Name: " + vp.name);
	                    System.out.println("Price: " + vp.price);
	                    System.out.println("Restaurant: " + vp.restaurantName);
	                    System.out.println("Pieces: " + vp.pieces);
	                    System.out.println("Chutney Type: " + vp.chutneyType);
	                    System.out.println("Fried Chilli: " + vp.friedChilli);
	                }


	                // RAJMA CHAWAL

	                else if (f instanceof RajmaChawal) {

	                    RajmaChawal rc = (RajmaChawal) f;
	                    System.out.println("Food Name: " + rc.name);
	                    System.out.println("Price: " + rc.price);
	                    System.out.println("Restaurant: " + rc.restaurantName);
	                    System.out.println("Rajma Type: " + rc.rajmaType);
	                    System.out.println("Rice Type: " + rc.riceType);
	                    System.out.println("Spice Level: " + rc.spiceLevel);
	                }


	                // DAL MAKHANI

	                else if (f instanceof DalMakhani) {

	                    DalMakhani dm = (DalMakhani) f;
	                    System.out.println("Food Name: " + dm.name);
	                    System.out.println("Price: " + dm.price);
	                    System.out.println("Restaurant: " + dm.restaurantName);
	                    System.out.println("Dal Type: " + dm.dalType);
	                    System.out.println("Spice Level: " + dm.spiceLevel);
	                    System.out.println("Cream Added: " + dm.creamAdded);
	                }


	                // PANEER BUTTER MASALA

	                else if (f instanceof PaneerButterMasala) {

	                    PaneerButterMasala pbm = (PaneerButterMasala) f;
	                    System.out.println("Food Name: " + pbm.name);
	                    System.out.println("Price: " + pbm.price);
	                    System.out.println("Restaurant: " + pbm.restaurantName);
	                    System.out.println("Gravy Type: " + pbm.gravyType);
	                    System.out.println("Spice Level: " + pbm.spiceLevel);
	                    System.out.println("Butter Added: " + pbm.butterAdded);
	                }


	                // BUTTER CHICKEN

	                else if (f instanceof ButterChicken) {

	                    ButterChicken bc = (ButterChicken) f;
	                    System.out.println("Food Name: " + bc.name);
	                    System.out.println("Price: " + bc.price);
	                    System.out.println("Restaurant: " + bc.restaurantName);
	                    System.out.println("Chicken Type: " + bc.chickenType);
	                    System.out.println("Spice Level: " + bc.spiceLevel);
	                    System.out.println("Butter Added: " + bc.butterAdded);
	                }


	                // TANDOORI CHICKEN

	                else if (f instanceof TandooriChicken) {

	                    TandooriChicken tc = (TandooriChicken) f;
	                    System.out.println("Food Name: " + tc.name);
	                    System.out.println("Price: " + tc.price);
	                    System.out.println("Restaurant: " + tc.restaurantName);
	                    System.out.println("Pieces: " + tc.pieces);
	                    System.out.println("Spice Level: " + tc.spiceLevel);
	                    System.out.println("Mint Chutney: " + tc.mintChutney);
	                }


	                // ALOO PARATHA

	                else if (f instanceof AlooParatha) {

	                    AlooParatha ap = (AlooParatha) f;
	                    System.out.println("Food Name: " + ap.name);
	                    System.out.println("Price: " + ap.price);
	                    System.out.println("Restaurant: " + ap.restaurantName);
	                    System.out.println("Pieces: " + ap.pieces);
	                    System.out.println("Butter Added: " + ap.butterAdded);
	                    System.out.println("Curd Included: " + ap.curdIncluded);
	                }


	                // PANEER PARATHA

	                else if (f instanceof PaneerParatha) {

	                    PaneerParatha pp = (PaneerParatha) f;
	                    System.out.println("Food Name: " + pp.name);
	                    System.out.println("Price: " + pp.price);
	                    System.out.println("Restaurant: " + pp.restaurantName);
	                    System.out.println("Pieces: " + pp.pieces);
	                    System.out.println("Spice Level: " + pp.spiceLevel);
	                    System.out.println("Butter Added: " + pp.butterAdded);
	                }


	                // KACHORI

	                else if (f instanceof Kachori) {

	                    Kachori k = (Kachori) f;
	                    System.out.println("Food Name: " + k.name);
	                    System.out.println("Price: " + k.price);
	                    System.out.println("Restaurant: " + k.restaurantName);
	                    System.out.println("Filling: " + k.filling);
	                    System.out.println("Pieces: " + k.pieces);
	                    System.out.println("Chutney Included: " + k.chutneyIncluded);
	                }


	                // BROWNIE

	                else if (f instanceof Brownie) {

	                    Brownie b = (Brownie) f;
	                    System.out.println("Food Name: " + b.name);
	                    System.out.println("Price: " + b.price);
	                    System.out.println("Restaurant: " + b.restaurantName);
	                    System.out.println("Flavour: " + b.flavour);
	                    System.out.println("Ice Cream Added: " + b.iceCreamAdded);
	                    System.out.println("Topping: " + b.topping);
	                }


	                // RASGULLA

	                else if (f instanceof Rasgulla) {

	                    Rasgulla r = (Rasgulla) f;
	                    System.out.println("Food Name: " + r.name);
	                    System.out.println("Price: " + r.price);
	                    System.out.println("Restaurant: " + r.restaurantName);
	                    System.out.println("Pieces: " + r.pieces);
	                    System.out.println("Syrup Type: " + r.syrupType);
	                    System.out.println("Chilled: " + r.chilled);
	                }


	                // COLD COFFEE

	                else if (f instanceof ColdCoffee) {

	                    ColdCoffee cc = (ColdCoffee) f;
	                    System.out.println("Food Name: " + cc.name);
	                    System.out.println("Price: " + cc.price);
	                    System.out.println("Restaurant: " + cc.restaurantName);
	                    System.out.println("Size: " + cc.size);
	                    System.out.println("Flavour: " + cc.flavour);
	                    System.out.println("Ice Cream Added: " + cc.iceCreamAdded);
	                }


	                // MANGO SHAKE

	                else if (f instanceof MangoShake) {

	                    MangoShake ms = (MangoShake) f;
	                    System.out.println("Food Name: " + ms.name);
	                    System.out.println("Price: " + ms.price);
	                    System.out.println("Restaurant: " + ms.restaurantName);
	                    System.out.println("Size: " + ms.size);
	                    System.out.println("Sugar Added: " + ms.sugarAdded);
	                    System.out.println("Ice Cream Added: " + ms.iceCreamAdded);
	                }


	                // MASALA TEA

	                else if (f instanceof MasalaTea) {

	                    MasalaTea mt = (MasalaTea) f;
	                    System.out.println("Food Name: " + mt.name);
	                    System.out.println("Price: " + mt.price);
	                    System.out.println("Restaurant: " + mt.restaurantName);
	                    System.out.println("Size: " + mt.size);
	                    System.out.println("Sugar Added: " + mt.sugarAdded);
	                    System.out.println("Ginger Added: " + mt.gingerAdded);
	                }


	                // COFFEE

	                else if (f instanceof Coffee) {

	                    Coffee c = (Coffee) f;
	                    System.out.println("Food Name: " + c.name);
	                    System.out.println("Price: " + c.price);
	                    System.out.println("Restaurant: " + c.restaurantName);
	                    System.out.println("Coffee Type: " + c.coffeeType);
	                    System.out.println("Size: " + c.size);
	                    System.out.println("Sugar Added: " + c.sugarAdded);
	                }
	            }


	            System.out.println("========================================");
	            System.out.println("Do You Want To Continue Shopping?");
	            System.out.println("Press 1 ===> Yes");
	            System.out.println("Press 2 ===> No");
	            System.out.println("========================================");
	            int option = Integer.parseInt(sc.nextLine());

	            // IF ELSE CONDITION FOR CONTINUING SHOPPING

	            if (option == 1) {

	                continueShopping = true;

	               System.out.println("Great! Continue Shopping...");
	            }

	            else if (option == 2) {

	                continueShopping = false;

	                System.out.println("========================================");
	                System.out.println(" THANKS FOR SHOPPING WITH ZOMATO");
	                System.out.println(" VISIT AGAIN");
	                System.out.println(" HAVE A GREAT DAY!");
	                System.out.println("========================================");
	            }

	            else {

	                continueShopping = false;

	                System.out.println("Invalid Option");

	                System.out.println("========================================");
	                System.out.println(" THANKS FOR SHOPPING WITH ZOMATO");
	                System.out.println(" VISIT AGAIN");
	                System.out.println("========================================");
	            }
	        }

	        sc.close();
	    }
	

}
