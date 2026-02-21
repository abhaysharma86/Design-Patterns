package creational_Patterns.factoryMethodPattern.with;

public class ClientObject {
    public static void main(String[] args) {
        Notification sms = FactoryMethod.createNotification("SMS");
        sms.notifyUser();
        Notification email = FactoryMethod.createNotification("EMAIL");
        email.notifyUser();
    }
}
