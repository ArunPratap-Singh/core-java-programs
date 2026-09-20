package anonymousClass.Registration;

public interface Registration {
	
	void registerUser(String name, String email, String password);

    void validateDetails(String email, String password);

    void displayRegistrationStatus();


}
