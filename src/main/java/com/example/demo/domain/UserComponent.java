package com.example.demo.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserComponent {
	
	@Value("${com.user.id}")
	private String id;
	
	@Value("${com.user.name}")
	private String name;
	
	@Value("${com.user.age}")
	private Integer age;
	
	@Value("${com.user.address}")
	private String address;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
