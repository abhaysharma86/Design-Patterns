package creational_Patterns.factoryMethodPattern.without;

public class NotificationService {
    public Notification send(String type) {
        if (type.equals("EMAIL")) {
            return new EmailNotification();
        } else if (type.equals("SMS")) {
            return new SmsNotification();
        }
        return null;
    }
}

/*
Problems:
--------
Too many if-else
Violates OCP (Open/Close Principle)
Tight coupling
Hard to extend
*/
