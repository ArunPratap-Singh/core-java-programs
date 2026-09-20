package anonymousClass.NotificationSystem;

public interface NotificationSystem {
	
	 void sendEmail(String message);

	 void sendSMS(String message);

	 void sendPushNotification(String message);

}
