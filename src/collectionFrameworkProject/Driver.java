package collectionFrameworkProject;

public class Driver {

	public static void main(String[] args) {
	
		Service service = new Service();
		
//		System.out.println("========== ALL SHIRTS ==========");
//		service.addShirt();
//		
//		System.out.println("========== ACCESSING ALL SHIRTS ==========");
//		service.accessAllShirt();
//		
//		System.out.println("========== SEARCH SHIRT BY BRAND ==========");
//		service.accessByBrand();
//		
//		System.out.println("========== SEARCH SHIRT BY BRAND AND SIZE ==========");
//		service.accessByBrandAndSize();
//		
//		System.out.println("========== SEARCH SHIRT IN PRICE RANGE ==========");
//		service.accessInPriceRange();
//		
//		System.out.println("========== SEARCH SHIRT BY SIZE AND PRICE RANGE ==========");
//		service.accessBySizeAndPriceRange();
//		
//		System.out.println("========== SORT SIZE LOW TO HIGH ==========");
//		SortService.sortOnSizeLowToHigh(service.getAllShirt());
//		
//		System.out.println("=========== SORT SIZE HIGH TO LOW ==========");
//		SortService.sortOnSizeHighToLow(service.getAllShirt());
//		
//		System.out.println("========== SORT PRICE LOW TO HIGH ==========");
//		SortService.sortOnPriceLowToHigh(service.getAllShirt());
//		
//		System.out.println("========== SORT PRICE HIGH TO LOW ==========");
//		SortService.sortOnPriceHighToLow(service.getAllShirt());
//		
//		System.out.println("========== SORT BRAND IN ASCENDING ORDER ==========");
//		SortService.sortOnBrandOnAscendingOrder(service.getAllShirt());
//		
//		System.out.println("========== SORT BRAND IN DESCENDING ORDER ==========");
//		SortService.sortOnBrandOnDescendingOrder(service.getAllShirt());
//		
//		System.out.println("========== SORT ON PRICE LOW TO HIGH AND SIZE LOW TO HIGH ==========");
//		SortService.sortOnPriceLowToHighThenSizeLowToHigh(service.getAllShirt());
//		
//		System.out.println("========== SORT ON PRICE LOW TO HIGH THEN BRAND IN ASCENDING ORDER ==========");
//		SortService.sortOnPriceLowToHighThenBrandAscending(service.getAllShirt());
//		
//		System.out.println("========== SORT ON BRAND IN ASCENDING ORDER THEN IN PRICE LOW TO HIGH ==========");
//		SortService.sortOnBrandAscendingThenPriceLowToHigh(service.getAllShirt());
//		
//		System.out.println("========== SORT ON BRAND IN DESCENDING ORDER THEN IN PRICE HIGH TO LOW ==========");
//		SortService.sortOnBrandDescendingThenPriceHighToLow(service.getAllShirt());
//		
//		System.out.println("========== LISTING ALL AVAILABLE BRANDS INCLUDING DUPILACTES ==========");
//		service.listAllBrand();
//		
//		System.out.println("========== LISTING ALL UNIQUE BRANDS ==========");
//		service.listAllUniqueBrand();
//		
//		System.out.println("========== LISTING ALL AVAILABLE COLORS INCLUDING DUPILACTES ==========");
//		service.listAllColor();
//		
//		System.out.println("========== LISTING ALL UNIQUE COLORS ==========");
//		service.listAllUniqueColor();
//		
//		System.out.println("========== LISTING ALL AVAILABLE SIZES INCLUDING DUPILACTES ==========");
//		service.listAllSize();
//		
//		System.out.println("========== LISTING ALL UNIQUE SIZES ==========");
//		service.listAllUniqueSize();
		
		System.out.println("========== COUNT ALL SHIRTS BY BRAND ==========");
		service.countShirtsByBrand();
		
		System.out.println("========== COUNT ALL SHIRTS BY COLOR ==========");
		service.countShirtByColor();
		
		System.out.println("========== COUNT ALL SHIRTS BY SIZE ==========");
		service.countShirtBySize();
		
	}

}
