package builderPattern;

public class ProductDriver {
	
    public static void main(String[] args) {

        Product p1 = new Product.Builder().setProductName("Laptop").setBrand("Dell").setPrice(55000.00).setCategory("Electronics").setQuantity(10).setColor("Silver").build();

        Product p2 = new Product.Builder().setProductName("Mobile").setBrand("Samsung").setPrice(25000.00).setCategory("Electronics").setQuantity(20).setColor("Black").build();

        Product p3 = new Product.Builder().setProductName("Headphones").setBrand("Sony").setPrice(3500.00).setCategory("Accessories").setQuantity(15).setColor("White").build();

        Product p4 = new Product.Builder().setProductName("Smart Watch").setBrand("Apple").setPrice(25000.00).setCategory("Wearables").setQuantity(8).setColor("Blue").build();

        Product p5 = new Product.Builder().setProductName("Keyboard").setBrand("Logitech").setPrice(1800.00).setCategory("Accessories").setQuantity(25).setColor("Black").build();

        Product p6 = new Product.Builder().setProductName("Mouse").setBrand("HP").setPrice(900.00).setCategory("Accessories").setQuantity(30).setColor("Grey").build();

        Product p7 = new Product.Builder().setProductName("Television").setBrand("LG").setPrice(45000.00).setCategory("Electronics").setQuantity(5).setColor("Black").build();

        Product p8 = new Product.Builder().setProductName("Refrigerator").setBrand("Whirlpool").setPrice(32000.00).setCategory("Home Appliances").setQuantity(7).setColor("Silver").build();

        Product p9 = new Product.Builder().setProductName("Washing Machine").setBrand("IFB").setPrice(28000.00).setCategory("Home Appliances").setQuantity(6).setColor("White").build();

        Product p10 = new Product.Builder().setProductName("Air Conditioner").setBrand("Voltas").setPrice(42000.00).setCategory("Home Appliances").setQuantity(4).setColor("White").build();

        Product p11 = new Product.Builder().setProductName("Shoes").setBrand("Nike").setPrice(4500.00).setCategory("Footwear").setQuantity(18).setColor("Red").build();

        Product p12 = new Product.Builder().setProductName("T-Shirt").setBrand("Puma").setPrice(1200.00).setCategory("Clothing").setQuantity(40).setColor("Blue").build();

        Product p13 = new Product.Builder().setProductName("Jeans").setBrand("Levis").setPrice(2500.00).setCategory("Clothing").setQuantity(22).setColor("Dark Blue").build();

        Product p14 = new Product.Builder().setProductName("Backpack").setBrand("American Tourister").setPrice(1800.00).setCategory("Bags").setQuantity(12).setColor("Black").build();

        Product p15 = new Product.Builder().setProductName("Watch").setBrand("Titan").setPrice(5500.00).setCategory("Accessories").setQuantity(10).setColor("Brown").build();

        Product p16 = new Product.Builder().setProductName("Camera").setBrand("Canon").setPrice(65000.00).setCategory("Electronics").setQuantity(3).setColor("Black").build();

        Product p17 = new Product.Builder().setProductName("Printer").setBrand("Epson").setPrice(12000.00).setCategory("Office Equipment").setQuantity(9).setColor("White").build();

        Product p18 = new Product.Builder().setProductName("Table").setBrand("Godrej").setPrice(8500.00).setCategory("Furniture").setQuantity(5).setColor("Brown").build();

        Product p19 = new Product.Builder().setProductName("Chair").setBrand("Nilkamal").setPrice(2500.00).setCategory("Furniture").setQuantity(14).setColor("Black").build();

        Product p20 = new Product.Builder().setProductName("Water Bottle").setBrand("Milton").setPrice(650.00).setCategory("Kitchen").setQuantity(35).setColor("Green").build();

        System.out.println(p1);
        System.out.println("====================");

        System.out.println(p2);
        System.out.println("====================");

        System.out.println(p3);
        System.out.println("====================");

        System.out.println(p4);
        System.out.println("====================");

        System.out.println(p5);
        System.out.println("====================");

        System.out.println(p6);
        System.out.println("====================");

        System.out.println(p7);
        System.out.println("====================");

        System.out.println(p8);
        System.out.println("====================");

        System.out.println(p9);
        System.out.println("====================");

        System.out.println(p10);
        System.out.println("====================");

        System.out.println(p11);
        System.out.println("====================");

        System.out.println(p12);
        System.out.println("====================");

        System.out.println(p13);
        System.out.println("====================");

        System.out.println(p14);
        System.out.println("====================");

        System.out.println(p15);
        System.out.println("====================");

        System.out.println(p16);
        System.out.println("====================");

        System.out.println(p17);
        System.out.println("====================");

        System.out.println(p18);
        System.out.println("====================");

        System.out.println(p19);
        System.out.println("====================");

        System.out.println(p20);
        
    }
}



