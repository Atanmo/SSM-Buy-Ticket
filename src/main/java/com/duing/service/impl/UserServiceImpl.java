package com.duing.service.impl;

import com.duing.dao.UserDao;
import com.duing.entity.User;
import com.duing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao dao;

    @Override
    public List<User> getAllUser() {
        return dao.getAllUser();
    }
}
