package com.reputation.service.impl;

import com.reputation.dao.UserDao;
import com.reputation.pojo.User;
import com.reputation.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserDao ud;

    @Override
    public List<User> findAll() {
        List<User> userList = ud.findAll();

        return userList;
    }

    @Override
    public User findById(int id) {
        User user = ud.findOne(id);

        return user;
    }

    @Override
    public void update(User user) {

        User save = ud.save(user);
    }
}
