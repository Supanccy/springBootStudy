package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	/**
	 * 启动主程序，打开浏览器访问http://localhost:8080/hello，
	 * 就可以看到效果了，有木有很简单！
	 * 
	 * 使用spring boot可以非常方便、快速搭建项目，使我们不用关心框架之间的兼容性，适用版本等各种问题，
	 * 我们想使用任何东西，仅仅添加一个配置就可以，所以使用sping boot非常适合构建微服务。
	 */
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
