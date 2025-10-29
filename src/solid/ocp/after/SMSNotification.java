package solid.ocp.after;

public class SMSNotification implements Notification {
    public void send(String message) {
        System.out.println("Sending SMS with message: " + message);
    }
}
