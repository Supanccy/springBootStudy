package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.User;


/**
 * @RestController的意思就是controller里面的方法都以json格式输出，
 * 不用再写什么jackjson配置的了！
 * 在以前的spring 开发的时候需要我们提供json接口的时候需要做那些配置呢
 * 添加 jackjson 等相关jar包
 * 配置spring controller扫描
 * 对接的方法添加@ResponseBody
 * 就这样我们会经常由于配置错误，导致406错误等等，spring boot如何做呢，只需要类添加  @RestController  即可，默认类中的方法都会以json的格式返回
 * @author chenchaoyang
 */
@RestController
public class HelloWorldController {
	
	@Value("${com.user.id}")
	private String id;
	
	@Value("${com.user.name}")
	private String name;
	
	@Value("${com.user.age}")
	private Integer age;
	
	@Value("${com.user.address}")
	private String address;
	
    @RequestMapping("/hello")
    public String index() {
        return "Hello World11122";
    }
    
    @RequestMapping("/getUser")
    public User getUser(){
    	User user = new User();
    	user.setId("1");
    	user.setName("陈超阳");
    	user.setAge(29);
    	user.setAddress("中国广东深圳");
    	return user;
    }
    
    /**
     * 获取配置文件中的数值，赋值给用户
     * @return
     */
    @RequestMapping("/getUserComponent")
    public User getUserComponent(){
    	User usercom = new User();
    	usercom.setId(id);
    	usercom.setName(name);
    	usercom.setAge(age);
    	usercom.setAddress(address);
    	return usercom;
    }

}
