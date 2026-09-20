package anonymousClass.Array;

public class AnonymousClass {

	public static void main(String[] args) {
	
		 int[] numbers = {10, 25, 5, 40, 15, 30};

	        ArrayOperation operation = new ArrayOperation() {

	            @Override
	            public void findMaximum(int[] arr) {

	                int max = arr[0];

	                for (int i = 1; i < arr.length; i++) {

	                    if (arr[i] > max) {
	                        max = arr[i];
	                    }
	                }

	                System.out.println("Maximum = " + max);
	            }

	            @Override
	            public void findMinimum(int[] arr) {

	                int min = arr[0];

	                for (int i = 1; i < arr.length; i++) {

	                    if (arr[i] < min) {
	                        min = arr[i];
	                    }
	                }

	                System.out.println("Minimum = " + min);
	            }

	            @Override
	            public void findSum(int[] arr) {

	                int sum = 0;

	                for (int i = 0; i < arr.length; i++) {
	                    sum = sum + arr[i];
	                }

	                System.out.println("Sum = " + sum);
	            }

	            @Override
	            public void findAverage(int[] arr) {

	                int sum = 0;

	                for (int i = 0; i < arr.length; i++) {
	                    sum = sum + arr[i];
	                }

	                double average = (double) sum / arr.length;

	                System.out.println("Average = " + average);
	            }
	        };

	        System.out.println("Array Operations");
	        System.out.println("========================");

	        operation.findMaximum(numbers);
	        System.out.println("========");
	        operation.findMinimum(numbers);
	        System.out.println("=========");
	        operation.findSum(numbers);
	        System.out.println("=========");
	        operation.findAverage(numbers);
	    
	

	}

}
