package creational_Patterns.factoryMethodPattern.without;

public class SmsNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("SMS notification send successfully..");
    }
}
