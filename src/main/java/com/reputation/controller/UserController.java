package com.reputation.controller;


import com.reputation.pojo.User;
import com.reputation.service.IUserService;
import org.aspectj.weaver.ast.Var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "/user")
public class UserController {
    @Autowired
    IUserService us;

    @RequestMapping(path = "/findAll")
    public @ResponseBody List<User> findAll(){
        List<User> userList = us.findAll();

        return userList;
    }

    @RequestMapping(path = "/findById")
    public @ResponseBody User findById(Integer id){
        User user = us.findById(id);

        return user;
    }

    @RequestMapping(path = "/updateUser")
    public @ResponseBody void updateUser(@RequestBody User user){
        us.update(user);
    }
}
