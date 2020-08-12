package com.example.Playdate.Dao;

import com.example.Playdate.Model.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UserDao {
    private static Map<Integer, User> users;
    static {
        users = new HashMap<Integer, User>() {
            {
                put(1, new User(1, "butt@gmail.com", "1234567890"));
                put(2, new User(2, "butt@gmail.com", "1234567890"));
                put(3, new User(3, "butt@gmail.com", "1234567890"));

            }
        };
    }

    public Collection<User> getAllUsers() {
        return this.users.values();

    }

}
