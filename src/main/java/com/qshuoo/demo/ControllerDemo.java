package com.qshuoo.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qshuoo.pojo.User;


@Controller
@EnableAutoConfiguration
public class ControllerDemo {
	
	private static final Logger logger = LoggerFactory.getLogger(ControllerDemo.class); 
	
	@RequestMapping("/")
	public String index(ModelMap map) {
		logger.info("this is logger");
		map.put("title", "index");
		map.put("contant", "Hello,This is FreeMarker");
		return "index";
	}
	
	@ResponseBody
	@RequestMapping("/user")
	public User toJson() {
		User user = new User();
		user.setId(10086);
		user.setName("狗化名");
		return user;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ControllerDemo.class, args);
	}
}
