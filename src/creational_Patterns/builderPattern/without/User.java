package creational_Patterns.builderPattern.without;

class User {
    String name;
    int age;
    String email;
    String phone;
    String address;

    User(String name, int age, String email, String phone, String address) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }
}
