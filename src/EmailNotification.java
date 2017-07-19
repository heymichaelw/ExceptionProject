
public class EmailNotification extends Notification {

    private String recipient;
    private String smtpProvider;

    public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }

    @Override
    public void transport() {
        System.out.println("Recipient: " + this.recipient);
        System.out.println("SMTP Provider: " + this.smtpProvider);
        System.out.println("Created: " + this.getCreatedAt());
        System.out.println("Subject: " + this.getSubject());
        System.out.println("Body: " + this.getBody());
    }
}
