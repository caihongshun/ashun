package com.ashun.controller;

import com.ashun.pojo.User;
import com.ashun.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @className: ashunController
 * @description:
 * @author: caihongshun
 * @create: 2019-04-26 14:25
 **/
@RestController
public class ashunController {

    @Autowired
    private TestService testService;
    @RequestMapping("/ashun")
    public Object test() throws Exception{
        System.out.println(111);
/*
        User user = testService.queryUserById(2L);*/
        String string = "2019-03-14 21:59:06";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println();
        User user=new User();
        user.setBirthday(sdf.parse(string));
        List<User> users = testService.queryUserList(user);


        /*User user=new User();
        user.setName("22222");
        user.setBirthday(new Date());
        Integer insert = testService.insert(user);*/
        return users;
    }
}
