import java.time.LocalDateTime;

public class Notification {
    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status = "visible";

    public Notification(String subject, String body) {
        this.subject = subject;
        this.body = body;
        this.createdAt = LocalDateTime.now();
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public void transport(){
        throw new NoTransportException();
    }

    public void showStatus(){
        System.out.println(this.status);
    }

    protected void printText(){
        System.out.println("Here is some text from this protected method");
    }

}
