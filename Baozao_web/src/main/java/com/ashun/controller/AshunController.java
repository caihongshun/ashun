package com.ashun.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * @className: AshunController
 * @description: 测试
 * @author: caihongshun
 * @create: 2019-02-05 10:25
 **/
@Controller
@Slf4j
public class AshunController {
    /** Slf4j等同于*/
   /* Logger log= LoggerFactory.getLogger(AshunController.class);*/

    @Value("${ashun}")
    private  String ashun;

    @RequestMapping("/hello")
    public ModelAndView hello() {

        Map data = new HashMap<>();
        data.put("id", "123");
        data.put("name", "张三");
        log.info("haha"+data);
       /* User user = testService.queryUserById(2L);
        user.setName("阿");
        List<User> users = userService.queryUser(user);
        Country country=new Country();
        country.setCid(1);
        Country country2 = userService.queryCountry(country);
        User user1 = userService.queryUserById(2L);*/
        ModelAndView model=new ModelAndView();
        model.setViewName("test/test");
        model.addObject("name","张三");
        return model;
    }

    /**
     * 全局捕获异常
     * @return
     */
    @RequestMapping("/ashun1")
    @ResponseBody
    public Object ashun1(Integer i) {
        int j=1;
        int  e =i/j;
        return e;
    }

    /**
     * @Author: caihongshun
     * @Date: 16:23 2019/4/8
     * @Param:
     * @return:
     * @Description: 读取配置文件
     **/
    @RequestMapping("/ashun")
    @ResponseBody
    public Object ashun() {
       log.info("ashun"+ashun);
        return ashun;
    }
}
