public class Main {

    public static void main(String[] args) {
       EmailNotification emailNotification = new EmailNotification("notification", "this is a notification", "michael", "google");
       TextNotification textNotification = new TextNotification("text notification", "here is another notification", "michael", "verizon");
       emailNotification.transport();
       textNotification.transport();
       emailNotification.showStatus();
       textNotification.showStatus();
       emailNotification.printText();
       EmailNotification emailNotificationClone = null;
        try {
            emailNotificationClone = emailNotification.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();

        }
        System.out.println(emailNotification.equals(emailNotificationClone));
        System.out.println(emailNotificationClone.getCreatedAt());
        System.out.println(emailNotification.getCreatedAt());
        System.out.println(emailNotificationClone.getSubject());
        System.out.println(emailNotification.getSubject());
    }
}
