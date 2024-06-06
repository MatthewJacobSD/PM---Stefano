import java.util.*;

public class User {
    private final String username;
    private final String email;
    private final String passwordHash;
    private final List<Password> passwords;  // List of Password objects

    public User(String username, String email, String passwordHash) {
        this.username = username;
        this.email = email;
        this.passwordHash = passwordHash;
        this.passwords = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void addPassword(String serviceName, String usernameForService, String password, String purpose) {
        Password newPassword = new Password(serviceName, usernameForService, password, purpose);
        passwords.add(newPassword);
    }

    public void editPassword(String serviceName, String newUsernameForService, String newPassword, String newPurpose) {
        for (Password password : passwords) {
            if (password.getServiceName().equals(serviceName)) {
                password.setUsername(newUsernameForService);
                password.setPassword(newPassword);
                password.setPurpose(newPurpose);
                return;
            }
        }
    }

    public void deletePassword(String serviceName) {
        passwords.removeIf(password -> password.getServiceName().equals(serviceName));
    }

    public List<Password> getPasswords() {
        return new ArrayList<>(passwords);
    }
}
