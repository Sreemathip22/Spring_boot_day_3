package com.example.day3.ex3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Repository {
	@Value("1")
	public int id;
	@Value("Sree")
	public String name;
	@Value("20")
	public int age;
	@Value("40000")
	public long salary;
	@RequestMapping("/day")
	public String day()
	{
		return id+"-"+name+"-"+age+"-"+salary;
	}
}
