package solid.dip.before;

public class MainDIP {
    public static void main(String[] args) {
        ReportMailer mailer = new ReportMailer();
        mailer.sendReport("Rapport annuel");
    }
}
