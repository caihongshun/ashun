package com.ashun;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

/**
 * @className: WebApplication
 * @description: 引导类
 * @author: caihongshun
 * @create: 2019-02-05 10:27
 **/
@SpringBootApplication(scanBasePackages = {"com.ashun.controller","com.ashun.error"})//,exclude={DataSourceAutoConfiguration.class}
public class WebApplication  {//extends SpringBootServletInitializer
    /*@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(WebApplication.class);
    }*/
    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class,args);
    }
}
