package creational_Patterns.prototype.without;

public class Application {

    public static void main(String[] args) {

        // Every time → heavy object creation
        UserProfile user1 = new UserProfile("U1");
        UserProfile user2 = new UserProfile("U1");
        UserProfile user3 = new UserProfile("U1");
    }
}
