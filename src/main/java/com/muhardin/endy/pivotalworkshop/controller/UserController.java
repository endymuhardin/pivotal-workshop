package com.muhardin.endy.pivotalworkshop.controller;

import com.muhardin.endy.pivotalworkshop.dao.UserDao;
import com.muhardin.endy.pivotalworkshop.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired private UserDao userDao;
    
    @RequestMapping("/")
    public Page<User> allUser(Pageable page){
        return userDao.findAll(page);
    } 
}
