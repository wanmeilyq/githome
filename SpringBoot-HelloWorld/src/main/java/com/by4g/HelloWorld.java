/**
 * @filename HelloWorld.java
 * @author lg
 * @date 2019-01-04
 * @version 1.0
 * Copyright (C) 2019 
 */

package com.by4g;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication 
//Spring Boot项目的核心注解，主要目的是开启自动配置
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
@RestController
public class HelloWorld {
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello World";
	}
	
	
	@RequestMapping("/hello123")
	public String hello123() {
		return "Hello World123";
	}
	public static void main(String[] args) {
		//启动应用程序
		SpringApplication.run(HelloWorld.class, args);
	}

}
