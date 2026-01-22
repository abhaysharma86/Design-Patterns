package creational_Patterns.factoryMethodPattern.with;

public class ClientObject {
    public static void main(String[] args) {
        Notification obj1 = new EmailNotification();
        Notification obj2 = new SmsNotification();

        obj1.notifyUser();
        obj2.notifyUser();
    }
}
