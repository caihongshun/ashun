package com.ashun.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
public class AshunController {


    @RequestMapping("/hello")
    @ResponseBody
    public Object hello() {
        Map data = new HashMap<>();
        data.put("id", "123");
        data.put("name", "张三");
        return data;
    }
}
