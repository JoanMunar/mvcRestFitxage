package com.esliceu.dwes.boot.controller;

import com.esliceu.dwes.boot.dao.UserRepository;
import com.esliceu.dwes.boot.model.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    private BeanFactory beanFactory;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/users")
    public List<User> users(){
        return (List<User>) userRepository.findAll();
    }


}
