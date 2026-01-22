package creational_Patterns.prototype.with;

public class ClientObject {
    public static void main(String[] args) {
        UserProfile userProfile = new UserProfile("Code Maker", "Admin");
        UserProfile clone = (UserProfile) userProfile.clone();

        System.out.println(userProfile.getName());
        System.out.println(clone.getName());
    }
}
