package com.example.Playdate.Service;

import com.example.Playdate.Dao.UserDao;
import com.example.Playdate.Model.User;

import java.util.Collection;

public class UserService {
    private UserDao userDao;
    public Collection<User> getAllUsers(){
        return userDao.getAllUsers();
    }
}
