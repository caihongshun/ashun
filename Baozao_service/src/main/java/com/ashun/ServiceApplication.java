package com.ashun;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

/**
 * @className: ServiceApplication
 * @description: 引导类
 * @author: caihongshun
 * @create: 2019-02-05 10:27
 **/
@SpringBootApplication(scanBasePackages = {"com.ashun.service","com.ashun.controller"})
@MapperScan("com.ashun.mapper")
public class ServiceApplication{


    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }

}
