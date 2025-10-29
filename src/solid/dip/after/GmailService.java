package solid.dip.after;

public class GmailService implements MailerService {
    public void send(String content) {
        System.out.println("Sending email via Gmail: " + content);
    }
}
