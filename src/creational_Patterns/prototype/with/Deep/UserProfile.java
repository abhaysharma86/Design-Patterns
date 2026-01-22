package creational_Patterns.prototype.with.Deep;


public class UserProfile implements Prototype{


    private String name;
    private String role;

    private Address address;

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public Prototype clone() {
        UserProfile userProfile = new UserProfile(
                this.name, this.role);
        userProfile.address = new Address("India","Uttar Pradesh");
        return userProfile;
    }
}
