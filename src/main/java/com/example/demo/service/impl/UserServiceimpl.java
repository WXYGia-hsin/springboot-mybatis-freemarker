package com.example.demo.service.impl;

import com.example.demo.bean.User;
import com.example.demo.dao.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceimpl implements UserService{
    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserById(long id) {
        return userMapper.findUserById(id);
    }
}
