package creational_Patterns.factoryMethodPattern.without;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Email notification send successfully..");

    }
}
