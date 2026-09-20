package anonymousClass.Registration;

public class AnonymousClass {

	public static void main(String[] args) {
		
		 Registration registration = new Registration() {

	            String registeredName;
	            String registeredEmail;
	            String registeredPassword;

	            boolean registrationSuccessful = false;

	            @Override
	            public void registerUser(String name, String email, String password) {

	                registeredName = name;
	                registeredEmail = email;
	                registeredPassword = password;

	                System.out.println("Registration Details");
	                System.out.println("Name     : " + name);
	                System.out.println("Email    : " + email);

	                validateDetails(email, password);
	            }

	            @Override
	            public void validateDetails(String email, String password) {

	                if (email.contains("@") && password.length() >= 6) {

	                    registrationSuccessful = true;

	                    System.out.println("Email format is valid.");
	                    System.out.println("Password is valid.");

	                } else {

	                    registrationSuccessful = false;

	                    System.out.println("Invalid registration details.");
	                }
	            }

	            @Override
	            public void displayRegistrationStatus() {

	                if (registrationSuccessful) {

	                    System.out.println("Registration Successful!");
	                    System.out.println("Welcome, " + registeredName);

	                } else {

	                    System.out.println("Registration Failed.");
	                }
	            }
	        };

	        registration.registerUser(
	                "Arunendra Singh",
	                "arunendra@gmail.com",
	                "Arun@123"
	        );

	        System.out.println("============================");

	        registration.displayRegistrationStatus();

	}

}
