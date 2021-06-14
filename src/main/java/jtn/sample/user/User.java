package jtn.sample.user;

public class User {
    String username;
    String password;
    boolean enabled;

    public User(
            String username,
            String password,
            boolean enabled
    ) {
        this.username = username;
        this.password = password;
        this.enabled = enabled;
    }
}
