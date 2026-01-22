package creational_Patterns.factoryMethodPattern.without;

public class ClientObject {
    public static void main(String[] args) {
        NotificationService obj = new NotificationService();
        Notification email = obj.send("EMAIL");

        NotificationService obj1 = new NotificationService();
        Notification sms = obj.send("SMS");

        email.notifyUser();
        sms.notifyUser();
    }
}
