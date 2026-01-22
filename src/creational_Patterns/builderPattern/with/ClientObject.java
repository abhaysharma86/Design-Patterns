package creational_Patterns.builderPattern.with;

public class ClientObject {
    public static void main(String[] args) {
        User user = new User.Builder()
                .name("Code Maker")
                .age(28)
                .email("codemaker@gmail.com")
                .address("India")
                .phone("123456789").build();
        System.out.println(user.getName());
    }
}
