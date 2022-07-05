package todo.app.model;

import java.util.Objects;
import java.util.Random;

public class AppUser {
    private String username;
    private String password;
    AppRole role;
    public static int intSequencer = 0;

    public AppUser(String username, String password) {
        intSequencer++;
        this.setUsername(username);
        this.setPassword(password);
    }

    public static int getIntSequencer() {
        return intSequencer;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (isNullOrEmpty(username)) {
            this.username = ("user_" + intSequencer);
        }
        else {
            this.username = username;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (isNullOrEmpty(password)) {
            this.password = ("user_" + intSequencer + new Random().nextInt(1000));
        }
        else {
            this.password = password;
        }
    }

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        this.role = role;
    }

    public boolean isNullOrEmpty(String str) {
        if(str == null) { return true; }

        return str.trim().length() == 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return username.equals(appUser.username) && role == appUser.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, role);
    }

    @Override
    public String toString() {
        return  "username: " + username + '\n' +
                "password: " + password + '\n' +
                "role: " + role ;
    }
}
