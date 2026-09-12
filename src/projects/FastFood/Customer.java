package projects.FastFood;

public class Customer {
	
	public static void main(String[] args) {
		
		Dominoz d = new Dominoz();
		
		// Upcasting

        FastFood f = d.selectAndGetFastFood();


        // Downcasting


        if (f instanceof Pizza) {

            Pizza p = (Pizza) f;

            System.out.println("========== PIZZA DETAILS ==========");

            System.out.println("Name is: " + p.name);
            System.out.println("Price is: " + p.price);
            System.out.println("Quantity is: " + p.quantity);
            System.out.println("Brand Name is: " + p.brandname);
            System.out.println("Size is: " + p.size);
            System.out.println("Topping is: " + p.topping);
        }


        else if (f instanceof Burger) {

            Burger b = (Burger) f;

            System.out.println("========== BURGER DETAILS ==========");

            System.out.println("Name is: " + b.name);
            System.out.println("Price is: " + b.price);
            System.out.println("Quantity is: " + b.quantity);
            System.out.println("Brand Name is: " + b.brandname);
            System.out.println("Burger Type is: " + b.burgerType);
            System.out.println("Is Veg: " + b.isVeg);
        }


        else if (f instanceof Sandwich) {

            Sandwich s = (Sandwich) f;

            System.out.println("========== SANDWICH DETAILS ==========");

            System.out.println("Name is: " + s.name);
            System.out.println("Price is: " + s.price);
            System.out.println("Quantity is: " + s.quantity);
            System.out.println("Bread Type is: " + s.breadType);
            System.out.println("Filling is: " + s.filling);
            System.out.println("Is Grilled: " + s.isGrilled);
        }


        else if (f instanceof Pasta) {

            Pasta p = (Pasta) f;

            System.out.println("========== PASTA DETAILS ==========");

            System.out.println("Name is: " + p.name);
            System.out.println("Price is: " + p.price);
            System.out.println("Quantity is: " + p.quantity);
            System.out.println("Pasta Type is: " + p.pastaType);
            System.out.println("Sauce Type is: " + p.sauceType);
            System.out.println("Cheese Type is: " + p.cheeseType);
        }


        else if (f instanceof GarlicBread) {

            GarlicBread g = (GarlicBread) f;

            System.out.println("========== GARLIC BREAD DETAILS ==========");

            System.out.println("Name is: " + g.name);
            System.out.println("Price is: " + g.price);
            System.out.println("Quantity is: " + g.quantity);
            System.out.println("Bread Type is: " + g.breadType);
            System.out.println("Cheese Type is: " + g.cheeseType);
            System.out.println("Pieces is: " + g.pieces);
        }


        else if (f instanceof FrenchFries) {

            FrenchFries ff = (FrenchFries) f;

            System.out.println("========== FRENCH FRIES DETAILS ==========");

            System.out.println("Name is: " + ff.name);
            System.out.println("Price is: " + ff.price);
            System.out.println("Quantity is: " + ff.quantity);
            System.out.println("Size is: " + ff.size);
            System.out.println("Seasoning is: " + ff.seasoning);
            System.out.println("Is Cheesy: " + ff.isCheesy);
        }


        else if (f instanceof Noodles) {

            Noodles n = (Noodles) f;

            System.out.println("========== NOODLES DETAILS ==========");

            System.out.println("Name is: " + n.name);
            System.out.println("Price is: " + n.price);
            System.out.println("Quantity is: " + n.quantity);
            System.out.println("Noodle Type is: " + n.noodleType);
            System.out.println("Spice Level is: " + n.spiceLevel);
            System.out.println("Is Veg: " + n.isVeg);
        }


        else if (f instanceof Taco) {

            Taco t = (Taco) f;

            System.out.println("========== TACO DETAILS ==========");

            System.out.println("Name is: " + t.name);
            System.out.println("Price is: " + t.price);
            System.out.println("Quantity is: " + t.quantity);
            System.out.println("Shell Type is: " + t.shellType);
            System.out.println("Filling is: " + t.filling);
            System.out.println("Is Spicy: " + t.isSpicy);
        }


        else if (f instanceof Wrap) {

            Wrap w = (Wrap) f;

            System.out.println("========== WRAP DETAILS ==========");

            System.out.println("Name is: " + w.name);
            System.out.println("Price is: " + w.price);
            System.out.println("Quantity is: " + w.quantity);
            System.out.println("Wrap Type is: " + w.wrapType);
            System.out.println("Filling is: " + w.filling);
            System.out.println("Sauce is: " + w.sauce);
        }


        else if (f instanceof HotDog) {

            HotDog h = (HotDog) f;

            System.out.println("========== HOT DOG DETAILS ==========");

            System.out.println("Name is: " + h.name);
            System.out.println("Price is: " + h.price);
            System.out.println("Quantity is: " + h.quantity);
            System.out.println("Bread Type is: " + h.breadType);
            System.out.println("Sausage Type is: " + h.sausageType);
            System.out.println("Is Cheesy: " + h.isCheesy);
        }


        else {

            System.out.println("No FastFood Item Selected");
        }
	}	

}
