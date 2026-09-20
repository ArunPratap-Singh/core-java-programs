package anonymousClass.ProductComparison;

public class AnonymousClass {

	public static void main(String[] args) {
		
		ProductComparison product = new ProductComparison() {

            @Override
            public void comparePrice(double price1, double price2) {

                System.out.println("Product 1 Price : Rs. " + price1);
                System.out.println("Product 2 Price : Rs. " + price2);

                if (price1 < price2) {

                    System.out.println("Product 1 is cheaper.");

                } else if (price2 < price1) {

                    System.out.println("Product 2 is cheaper.");

                } else {

                    System.out.println("Both products have the same price.");
                }
            }

            @Override
            public void compareRating(double rating1, double rating2) {

                System.out.println("Product 1 Rating : " + rating1);
                System.out.println("Product 2 Rating : " + rating2);

                if (rating1 > rating2) {

                    System.out.println("Product 1 has a higher rating.");

                } else if (rating2 > rating1) {

                    System.out.println("Product 2 has a higher rating.");

                } else {

                    System.out.println("Both products have the same rating.");
                }
            }

            @Override
            public void compareFeatures(int features1, int features2) {

                System.out.println("Product 1 Features : " + features1);
                System.out.println("Product 2 Features : " + features2);

                if (features1 > features2) {

                    System.out.println("Product 1 has more features.");

                } else if (features2 > features1) {

                    System.out.println("Product 2 has more features.");

                } else {

                    System.out.println("Both products have the same number of features.");
                }
            }
        };

        product.comparePrice(50000, 55000);

        System.out.println("=======================");

        product.compareRating(4.5, 4.2);

        System.out.println("=======================");

        product.compareFeatures(10, 8);

	}

}
