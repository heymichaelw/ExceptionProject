
public class EmailNotification extends Notification {

    private String recipient;
    private String smtpProvider;

    public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;
        this.status = "invisible";
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

    @Override
    public void printText() {
        super.printText();
        System.out.println("This text is from the overridden method");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected EmailNotification clone() throws CloneNotSupportedException {
        return new EmailNotification(this.getSubject(), this.getBody(), this.getRecipient(), this.getSmtpProvider());
    }
}
