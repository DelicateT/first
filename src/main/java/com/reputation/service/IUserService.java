package com.reputation.service;

import com.reputation.pojo.User;

import java.util.List;

public interface IUserService {
    public List<User> findAll();

    public User findById(int id);

    public void update(User user);
}
