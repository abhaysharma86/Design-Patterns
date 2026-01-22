package creational_Patterns.abstractFactory.without;

public class ClientObject {
    public static void main(String[] args) {
        Application application = new Application("WINDOWS");
        application.render();
    }
}
