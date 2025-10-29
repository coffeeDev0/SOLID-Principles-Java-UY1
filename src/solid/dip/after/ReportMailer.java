package solid.dip.after;

public class ReportMailer {
    private MailerService mailerService;

    public ReportMailer(MailerService mailerService) {
        this.mailerService = mailerService;
    }

    public void sendReport(String report) {
        mailerService.send(report);
    }
}
