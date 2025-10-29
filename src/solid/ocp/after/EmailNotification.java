package solid.ocp.after;

public class EmailNotification implements Notification {
    public void send(String message) {
        System.out.println("Sending email with message: " + message);
    }
}
