package creational_Patterns.factoryMethodPattern.with;

public class FactoryMethod {

    public static Notification createNotification(String type) {

        if (type.equals("EMAIL")) {
            return new EmailNotification();
        }

        if (type.equals("SMS")) {
            return new SmsNotification();
        }
        throw new IllegalArgumentException("Invalid type");
    }

}
