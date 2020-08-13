package com.example.Playdate.Dao;

import com.example.Playdate.Model.User;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class UserDao {
    private static Map<Integer, User> users;
    static {
        users = new HashMap<Integer, User>() {
            {
                put(1, new User(1, "1@gmail.com", "1234567890"));
                put(2, new User(2, "2@gmail.com", "2234567890"));
                put(3, new User(3, "3@gmail.com", "3234567890"));
            }
        };
    }

    public Collection<User> getAllUsers() {
        return this.users.values();
    }
    public User getUserById(int id) {
        return this.users.get(id);
    }

    public void removeUserById(int id) {
        this.users.remove(id);
    }

    public void updateUser(User user) {
        User u = users.get(user.getUserId());
        u.setEmail(u.getEmail());
        u.setPhoneNumber(u.getPhoneNumber());
        users.put(u.getUserId(),user);
    }


    public void insertUser(User user) {
        this.users.put(user.getUserId(), user);
    }
}
