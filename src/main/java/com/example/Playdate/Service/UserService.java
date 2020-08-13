package com.example.Playdate.Service;

import com.example.Playdate.Dao.UserDao;
import com.example.Playdate.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public Collection<User> getAllUsers(){
        return userDao.getAllUsers();
    }

    public User getUserById(int id) {
        return this.userDao.getUserById(id);
    }

    public void removeUserById(int id) {
        this.userDao.removeUserById(id);
    }
    public void updateUser(User user){
        this.userDao.updateUser(user);
    }


    public void insertUser(User user) {
        userDao.insertUser(user);
    }
}
