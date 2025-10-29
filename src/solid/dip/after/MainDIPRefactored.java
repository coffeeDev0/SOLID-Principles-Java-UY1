package solid.dip.after;

public class MainDIPRefactored {
    public static void main(String[] args) {
        MailerService gmail = new GmailService();
        ReportMailer mailer1 = new ReportMailer(gmail);
        mailer1.sendReport("Rapport annuel");

        MailerService outlook = new OutlookService();
        ReportMailer mailer2 = new ReportMailer(outlook);
        mailer2.sendReport("Rapport trimestriel");
    }
}
