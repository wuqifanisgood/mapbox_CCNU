package com.ccnu.mapboxdemo2019.controller;

import com.ccnu.mapboxdemo2019.domain.User;
import com.ccnu.mapboxdemo2019.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {
    //从IOC容器中获取
    @Autowired
    private UserServiceImpl userServiceImpl;


    @RequestMapping("/")
    public String index(){
        return ("/index");
    }

    @RequestMapping("/submit")
    public String submit(User user){
        //在控制台打印经纬度，地类
        System.out.println(user.getLat() +"-"+user.getLng() + "-" +user.getLandClass());
        userServiceImpl.save(user);     //调用JPA方法保存
        return ("success");
    }

    @RequestMapping("/show")
    public String show(HttpSession session){
        List<User> userList = userServiceImpl.findAll();
        session.setAttribute("userList",userList);
        return ("showAllRecords");
    }
}