package by.tms.user;

import by.tms.home.user.User;

import java.util.HashSet;
import java.util.Iterator;
// import by.tms.user.Users;

public class Users {
    public static HashSet<User> users = new HashSet<>();

    public static User get (String UserLogin)  {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (user.UserLogin == UserLogin)
                return user;
        }
        return null;
    }
}
