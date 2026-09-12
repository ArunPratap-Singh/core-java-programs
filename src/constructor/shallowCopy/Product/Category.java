package constructor.shallowCopy.Product;

public class Category {
	
		int categoryId;
		String categoryName;
		String department;
		int numberOfProducts;
		String categoryType;
		String description;

		Category() {

		}

		Category(int categoryId, String categoryName, String department, int numberOfProducts, String categoryType, String description) {

			this.categoryId = categoryId;
			this.categoryName = categoryName;
			this.department = department;
			this.numberOfProducts = numberOfProducts;
			this.categoryType = categoryType;
			this.description = description;

		}

		public String toString() {

			return "CategoryId is: " + categoryId + "\nCategoryName is: " + categoryName + "\nDepartment is: " + department + "\nNumberOfProducts is: " + numberOfProducts + "\nCategoryType is: " + categoryType + "\nDescription is: " + description;

		}

	

}
