package com.ashun;

import com.ashun.config.DBConfig1;
import com.ashun.config.DBConfig2;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = {DBConfig1.class, DBConfig2.class})
@MapperScan(value = {"com.ashun.test01.mapper","com.ashun.test02.mapper"})
public class MybatisApp_jta_atomikos {

	// 1.实现注解版本 数据源

	public static void main(String[] args) {
		SpringApplication.run(MybatisApp_jta_atomikos.class, args);
	}

}
