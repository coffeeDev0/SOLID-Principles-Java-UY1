package solid.ocp.before;

public class MainOCP {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        service.sendNotification("Bonjour", "email");
        service.sendNotification("Salut", "sms");
    }
}
