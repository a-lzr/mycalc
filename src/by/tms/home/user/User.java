package by.tms.home.user;

import java.util.Objects;

public class User {
    public String UserLogin;
    public String UserPswd;

    public User(String UserLogin, String UserPswd) {
        this.UserLogin = UserLogin;
        this.UserPswd = UserPswd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(UserLogin, user.UserLogin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(UserLogin);
    }
}
