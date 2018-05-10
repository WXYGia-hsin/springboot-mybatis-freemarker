package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TestCotroller {
    @Autowired
    UserService userService;
    @RequestMapping("/test")
    public ModelAndView test(@RequestParam(defaultValue = "0")long id)
    {
        ModelAndView modelAndView = new ModelAndView();
        User user = userService.getUserById(id);
        modelAndView.addObject("user",user);
        modelAndView.setViewName("test");
        System.out.println("111");
        return modelAndView;
    }
}
