package projects.projectGroceries;

public class Customer {

	public static void main(String[] args) {
		
	        Shopping s = new Shopping();

	        // Upcasting
	        
	        Grocery g = s.selectAndGetGroceries();

	        // Downcasting

	        if (g instanceof Rice) {

	            Rice r = (Rice) g;

	            System.out.println("\n========== RICE DETAILS ==========");

	            System.out.println("Name is: " + r.name);
	            System.out.println("Price is: " + r.price);
	            System.out.println("Quantity is: " + r.quantity);
	            System.out.println("Brand Name is: " + r.brandname);
	            System.out.println("Type is: " + r.type);
	            System.out.println("Weight is: " + r.weight);
	            
	        }else if (g instanceof Wheat) {

	            Wheat w = (Wheat) g;

	            System.out.println("\n========== WHEAT DETAILS ==========");

	            System.out.println("Name is: " + w.name);
	            System.out.println("Price is: " + w.price);
	            System.out.println("Quantity is: " + w.quantity);
	            System.out.println("Brand Name is: " + w.brandname);
	            System.out.println("Quality is: " + w.quality);
	            System.out.println("Weight is: " + w.weight);
	            
	        }else if (g instanceof Sugar) {

	            Sugar su = (Sugar) g;

	            System.out.println("\n========== SUGAR DETAILS ==========");

	            System.out.println("Name is: " + su.name);
	            System.out.println("Price is: " + su.price);
	            System.out.println("Quantity is: " + su.quantity);
	            System.out.println("Brand Name is: " + su.brandname);
	            System.out.println("Type is: " + su.type);
	            System.out.println("Is Refined: " + su.isRefined);
	            
	        }else if (g instanceof Salt) {

	            Salt sa = (Salt) g;

	            System.out.println("\n========== SALT DETAILS ==========");

	            System.out.println("Name is: " + sa.name);
	            System.out.println("Price is: " + sa.price);
	            System.out.println("Quantity is: " + sa.quantity);
	            System.out.println("Brand Name is: " + sa.brandname);
	            System.out.println("Type is: " + sa.type);
	            System.out.println("Is Iodized: " + sa.isIodized);
	            
	        }else if (g instanceof Oil) {

	            Oil o = (Oil) g;

	            System.out.println("========== OIL DETAILS ==========");

	            System.out.println("Name is: " + o.name);
	            System.out.println("Price is: " + o.price);
	            System.out.println("Quantity is: " + o.quantity);
	            System.out.println("Brand Name is: " + o.brandname);
	            System.out.println("Oil Type is: " + o.oiltype);
	            System.out.println("Liters is: " + o.liters);
	            
	        }else if (g instanceof Milk) {

	            Milk m = (Milk) g;

	            System.out.println("========== MILK DETAILS ==========");

	            System.out.println("Name is: " + m.name);
	            System.out.println("Price is: " + m.price);
	            System.out.println("Quantity is: " + m.quantity);
	            System.out.println("Brand Name is: " + m.brandname);
	            System.out.println("Milk Type is: " + m.milktype);
	            System.out.println("Liters is: " + m.liters);
	            
	        }else if (g instanceof Bread) {

	            Bread b = (Bread) g;

	            System.out.println("========== BREAD DETAILS ==========");

	            System.out.println("Name is: " + b.name);
	            System.out.println("Price is: " + b.price);
	            System.out.println("Quantity is: " + b.quantity);
	            System.out.println("Brand Name is: " + b.brandname);
	            System.out.println("Bread Type is: " + b.breadtype);
	            System.out.println("Slices is: " + b.slices);
	            
	        }else if (g instanceof Eggs) {

	            Eggs e = (Eggs) g;

	            System.out.println("========== EGGS DETAILS ==========");

	            System.out.println("Name is: " + e.name);
	            System.out.println("Price is: " + e.price);
	            System.out.println("Quantity is: " + e.quantity);
	            System.out.println("Brand Name is: " + e.brandname);
	            System.out.println("Egg Type is: " + e.eggtype);
	            System.out.println("Total Eggs is: " + e.totalEggs);
	            
	        }else if (g instanceof Apple) {

	            Apple a = (Apple) g;

	            System.out.println("========== APPLE DETAILS ==========");

	            System.out.println("Name is: " + a.name);
	            System.out.println("Price is: " + a.price);
	            System.out.println("Quantity is: " + a.quantity);
	            System.out.println("Variety is: " + a.variety);
	            System.out.println("Color is: " + a.color);
	            System.out.println("Origin is: " + a.origin);
	        }


	        else if (g instanceof Potato) {

	            Potato p = (Potato) g;

	            System.out.println("========== POTATO DETAILS ==========");

	            System.out.println("Name is: " + p.name);
	            System.out.println("Price is: " + p.price);
	            System.out.println("Quantity is: " + p.quantity);
	            System.out.println("Variety is: " + p.variety);
	            System.out.println("Quality is: " + p.quality);
	            System.out.println("Is Fresh: " + p.isFresh);
	        }


	        else {

	            System.out.println("No Grocery Selected");
	            
		       
		    }
		

	}

}
