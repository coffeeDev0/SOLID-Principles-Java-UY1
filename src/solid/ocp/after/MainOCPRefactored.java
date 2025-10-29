package solid.ocp.after;

public class MainOCPRefactored {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        Notification email = new EmailNotification();
        Notification sms = new SMSNotification();

        service.sendNotification(email, "Bonjour");
        service.sendNotification(sms, "Salut");
    }
}
