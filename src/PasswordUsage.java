import java.util.Objects;

public class PasswordUsage {
    private Password password;  // Changed to Password object
    private User user;
    private String usage;

    public PasswordUsage(Password password, User user, String usage) {
        this.password = password;  // Store Password object
        this.user = user;
        this.usage = usage;
    }

    public Password getPassword() {
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PasswordUsage that = (PasswordUsage) o;
        return Objects.equals(password, that.password) &&
                Objects.equals(user, that.user) &&
                Objects.equals(usage, that.usage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(password, user, usage);
    }

    @Override
    public String toString() {
        return "PasswordUsage{" +
                "password='" + password.getPassword() + '\'' +
                ", user='" + user.getUsername() + '\'' +
                ", usage='" + usage + '\'' +
                '}';
    }
}
