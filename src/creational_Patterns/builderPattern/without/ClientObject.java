package creational_Patterns.builderPattern.without;

public class ClientObject {
    public static void main(String[] args) {
        User user = new User("Code Maker", 28, "codemaker@gmail.com", "12345678", "India");
        System.out.println(user.name);
    }
}
/*
Problems
-----------
1. Hard to read
2. Parameter order issues
3. Optional fields confusion
4. Not maintainable

Example:
User user = new User("Abhay", 28, null, null, null);

What is null?
Which parameter is email?
Easy to make mistakes

*/

