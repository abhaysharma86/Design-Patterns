package creational_Patterns.prototype.without;

class UserProfile {

    private String name;
    private String role;

    UserProfile(String userId) {

        // Expensive operations
        loadFromDatabase(userId);
        callExternalService();
        loadPermissions();
    }

    private void loadFromDatabase(String userId) {
        System.out.println("Loading data from DB for " + userId);
    }

    private void callExternalService() {
        System.out.println("Calling external service");
    }

    private void loadPermissions() {
        System.out.println("Loading permissions");
    }
}
