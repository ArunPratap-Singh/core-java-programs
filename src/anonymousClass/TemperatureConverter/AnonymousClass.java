package anonymousClass.TemperatureConverter;

public class AnonymousClass {

	public static void main(String[] args) {
	
		TemperatureConverter temperature = new TemperatureConverter() {
			
			@Override
			public void fahrenheitToCelsius(double fahrenheit) {
				
				double celsius = (fahrenheit - 32)*5/9;
				
				System.out.println("Temperature in Fahrenheit is: " +fahrenheit);
				System.out.println("Temperature in celsius is: " +celsius);
				
				
			}
			
			@Override
			public void celsiusToFahrenheit(double celsius) {
				
				double fahrenheit = (celsius * 9/5) + 32;
				
				System.out.println("Temperature in Fahrenheit is: " +fahrenheit);
				System.out.println("Temperature in celsius is: " +celsius);
			}
		};
		
		temperature.celsiusToFahrenheit(32);
		System.out.println("===================");
		temperature.fahrenheitToCelsius(120);

	}

}
