package projects.Footwear;

public class User {
	
	public static void main(String[] args) {
		
	        FootwearStore fs = new FootwearStore();

	        // Upcasting

	        Footwear f = fs.selectAndGetFootwear();

	        // Downcasting

	        if (f instanceof Shoes) {

	            Shoes s = (Shoes) f;
	            System.out.println("========== SHOES DETAILS ==========");
	            System.out.println("Name is: " + s.name);
	            System.out.println("Price is: " + s.price);
	            System.out.println("Size is: " + s.size);
	            System.out.println("Brand Name is: " + s.brandname);
	            System.out.println("Color is: " + s.color);
	            System.out.println("Material is: " + s.material);
	        }

	        else if (f instanceof Sneakers) {

	            Sneakers s = (Sneakers) f;
	            System.out.println("========== SNEAKERS DETAILS ==========");
	            System.out.println("Name is: " + s.name);
	            System.out.println("Price is: " + s.price);
	            System.out.println("Size is: " + s.size);
	            System.out.println("Brand Name is: " + s.brandname);
	            System.out.println("Color is: " + s.color);
	            System.out.println("Has Lace: " + s.isLace);
	        }

	        else if (f instanceof Boot) {

	            Boot b = (Boot) f;
	            System.out.println("========== BOOTS DETAILS ==========");
	            System.out.println("Name is: " + b.name);
	            System.out.println("Price is: " + b.price);
	            System.out.println("Size is: " + b.size);
	            System.out.println("Brand Name is: " + b.brandname);
	            System.out.println("Boot Type is: " + b.bootType);
	            System.out.println("Is Waterproof: " + b.isWaterproof);
	        }

	        else if (f instanceof Sandal) {

	            Sandal s = (Sandal) f;
	            System.out.println("========== SANDALS DETAILS ==========");
	            System.out.println("Name is: " + s.name);
	            System.out.println("Price is: " + s.price);
	            System.out.println("Size is: " + s.size);
	            System.out.println("Brand Name is: " + s.brandname);
	            System.out.println("Material is: " + s.material);
	            System.out.println("Color is: " + s.color);
	        }

	        else if (f instanceof Slippers) {

	            Slippers s = (Slippers) f;
	            System.out.println("========== SLIPPERS DETAILS ==========");
	            System.out.println("Name is: " + s.name);
	            System.out.println("Price is: " + s.price);
	            System.out.println("Size is: " + s.size);
	            System.out.println("Brand Name is: " + s.brandname);
	            System.out.println("Material is: " + s.material);
	            System.out.println("Is Soft: " + s.isSoft);
	        }

	        else if (f instanceof Loafers) {

	            Loafers l = (Loafers) f;
	            System.out.println("========== LOAFERS DETAILS ==========");
	            System.out.println("Name is: " + l.name);
	            System.out.println("Price is: " + l.price);
	            System.out.println("Size is: " + l.size);
	            System.out.println("Brand Name is: " + l.brandname);
	            System.out.println("Color is: " + l.color);
	            System.out.println("Leather Type is: " + l.leatherType);
	        }

	        else if (f instanceof Heels) {

	            Heels h = (Heels) f;
	            System.out.println("========== HEELS DETAILS ==========");
	            System.out.println("Name is: " + h.name);
	            System.out.println("Price is: " + h.price);
	            System.out.println("Size is: " + h.size);
	            System.out.println("Brand Name is: " + h.brandname);
	            System.out.println("Heel Height is: " + h.heelHeight);
	            System.out.println("Color is: " + h.color);
	        }

	        else if (f instanceof SportsShoes) {

	            SportsShoes ss = (SportsShoes) f;
	            System.out.println("========== SPORTS SHOES DETAILS ==========");
	            System.out.println("Name is: " + ss.name);
	            System.out.println("Price is: " + ss.price);
	            System.out.println("Size is: " + ss.size);
	            System.out.println("Brand Name is: " + ss.brandname);
	            System.out.println("Sport Type is: " + ss.sportType);
	            System.out.println("Is Lightweight: " + ss.isLightWeight);
	        }

	        else if (f instanceof FormalShoes) {

	            FormalShoes fs1 = (FormalShoes) f;
	            System.out.println("========== FORMAL SHOES DETAILS ==========");
	            System.out.println("Name is: " + fs1.name);
	            System.out.println("Price is: " + fs1.price);
	            System.out.println("Size is: " + fs1.size);
	            System.out.println("Brand Name is: " + fs1.brandname);
	            System.out.println("Color is: " + fs1.color);
	            System.out.println("Material is: " + fs1.material);
	        }

	        else if (f instanceof FlipFlops) {

	            FlipFlops ff = (FlipFlops) f;
	            System.out.println("========== FLIP FLOPS DETAILS ==========");
	            System.out.println("Name is: " + ff.name);
	            System.out.println("Price is: " + ff.price);
	            System.out.println("Size is: " + ff.size);
	            System.out.println("Brand Name is: " + ff.brandname);
	            System.out.println("Color is: " + ff.color);
	            System.out.println("Material is: " + ff.material);
	        }

	        else {

	            System.out.println("No Footwear Item Selected");
		        
		    }
		
	}

}
