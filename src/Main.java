public class Main {

    public static void main(String[] args) {
       EmailNotification emailNotification = new EmailNotification("notification", "this is a notification", "michael", "google");
       TextNotification textNotification = new TextNotification("text notification", "here is another notification", "michael", "verizon");
       emailNotification.transport();
       textNotification.transport();
    }
}
