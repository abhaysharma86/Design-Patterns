package creational_Patterns.factoryMethodPattern.with;

class SmsNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending SMS Notification");
    }
}