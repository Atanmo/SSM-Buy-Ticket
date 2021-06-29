package com.duing.controller;

import com.duing.entity.User;
import com.duing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping("/allUser")
    @ResponseBody
    public List<User> allUser(){
        //调用service查询全部的用户信息返回
        return service.getAllUser();
    }

}
