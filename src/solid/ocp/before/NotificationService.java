package solid.ocp.before;

public class NotificationService {
    public void sendNotification(String message, String type) {
        if (type.equals("email")) {
            System.out.println("Sending email with message: " + message);
        } else if (type.equals("sms")) {
            System.out.println("Sending SMS with message: " + message);
        }
    }
}
