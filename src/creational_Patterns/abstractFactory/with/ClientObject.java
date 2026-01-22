package creational_Patterns.abstractFactory.with;

public class ClientObject {
    public static void main(String[] args) {
        Application application = new Application(new WindowsUIFactory());
        Application application1 = new Application(new MacUIFactory());
        application.render();
        application1.render();
    }
}
