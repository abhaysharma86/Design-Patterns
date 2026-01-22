package creational_Patterns.prototype.with.Deep;

public class ClientObject {
    public static void main(String[] args) {
        UserProfile userProfile = new UserProfile("Code Maker", "Admin");
        System.out.println(userProfile.getName() + " : " + userProfile.getAddress());

        UserProfile clone = (UserProfile) userProfile.clone();
        System.out.println(clone.getName() + " : " + clone.getAddress().getCountry());
    }
}
