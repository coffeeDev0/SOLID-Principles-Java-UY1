package solid.dip.before;

public class ReportMailer {
    public void sendReport(String report) {
        // Dépend directement de l'implementation Gmail
        GmailService gmail = new GmailService();
        gmail.sendEmail(report);
    }
}
