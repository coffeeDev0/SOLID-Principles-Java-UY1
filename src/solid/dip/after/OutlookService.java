package solid.dip.after;

public class OutlookService implements MailerService {
    public void send(String content) {
        System.out.println("Sending email via Outlook: " + content);
    }
}
