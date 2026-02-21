package creational_Patterns.builderPattern.with;

public class ClientObject {
    public static void main(String[] args) {
        User user = new User.Builder()
                .name("Code Maker")
                .build();
        System.out.println(user.getName());
    }
}
