package anonymousClass.NotificationSystem;

public class AnonymousClass {

	public static void main(String[] args) {
		
		NotificationSystem notification = new NotificationSystem() {

            @Override
            public void sendEmail(String message) {

                System.out.println("Email Notification");
                System.out.println("Message : " + message);
                System.out.println("Email sent successfully.");
            }

            @Override
            public void sendSMS(String message) {

                System.out.println("SMS Notification");
                System.out.println("Message : " + message);
                System.out.println("SMS sent successfully.");
            }

            @Override
            public void sendPushNotification(String message) {

                System.out.println("Push Notification");
                System.out.println("Message : " + message);
                System.out.println("Push notification sent successfully.");
            }
        };

        notification.sendEmail("Your order has been shipped.");

        System.out.println("-----------------------------");

        notification.sendSMS("Your OTP is 123456.");

        System.out.println("-----------------------------");

        notification.sendPushNotification("You have received a new message.");
    



	}

}
