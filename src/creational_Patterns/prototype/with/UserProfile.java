package creational_Patterns.prototype.with;

public class UserProfile implements Prototype{
    private String name;
    private String role;

    public UserProfile(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    @Override
    public Prototype clone() {
        return new UserProfile(this.name, this.role);
    }
}
