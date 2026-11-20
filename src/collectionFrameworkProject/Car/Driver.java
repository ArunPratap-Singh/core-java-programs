package collectionFrameworkProject.Car;

public class Driver {
	
	public static void main(String[] args) {
		
		CarService service = new CarService();
		
		System.out.println("========== ACCESS ALL CARS ==========");
		service.accessCar();
		
		System.out.println("========== ACCESS ALL CAR BY BRAND ==========");
		service.accessByBrand();
		
		System.out.println("========== ACESS ALL CAR BY BRAND AND PRICE ==========");
		service.accessByBrandAndPrice();
		
		System.out.println("========== SORT ALL CAR BY PRICE ==========");
		SortService.sortOnPriceLowToHigh(service.getAllCar());
		
		System.out.println("========== SORT ALL CAR BY PRICE LOW TO HIGH ==========");
		SortService.sortOnPriceLowToHigh(service.getAllCar());
		
		System.out.println("========== SORT ALL CAR BY PRICE HIGH TO LOW ==========");
		SortService.sortOnPriceLowToHigh(service.getAllCar());
		
		System.out.println("========== SORT ALL CAR BY MANUFACTURING YEAR OLD TO HIGH ==========");
		SortService.sortOnYearOldToNew(service.getAllCar());
		
		System.out.println("========== SORT ALL CAR BY MANUFACTURING YEAR HIGH TO LOW ==========");
		SortService.sortOnYearNewToOld(service.getAllCar());
		
		System.out.println("========== ACCESS ALL CAR BY BRAND ==========");
		service.accessByBrand();
		
		System.out.println("========== ACCESS ALL CAR BY BRAND UNIQULY ==========");
		service.accessAllBrandCarUniquly();
		
		System.out.println("========== COUNT CAR AVAILABLE FOR PARTICULAR BRAND ==========");
		service.countCarsByBrand();
	}

}
