package creational_Patterns.builderPattern.with;

class User {

    private String name;
    private int age;
    private String email;
    private String phone;
    private String address;

    private User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    static class Builder {
        private String name;
        private int age;
        private String email;
        private String phone;
        private String address;

        Builder name(String name) {
            this.name = name;
            return this;
        }

        Builder age(int age) {
            this.age = age;
            return this;
        }

        Builder email(String email) {
            this.email = email;
            return this;
        }

        Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        Builder address(String address) {
            this.address = address;
            return this;
        }

        User build() {
            return new User(this);
        }
    }
}
