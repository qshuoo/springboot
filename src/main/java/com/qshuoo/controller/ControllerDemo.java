package com.qshuoo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
		logger.info("test freemarker");
		map.put("title", "index");
		map.put("contant", "Hello World");
		return "index";
	}
	
	@RequestMapping("/exception")
	public String testRunningException() {
		logger.info("test RunningException");
		throw new RuntimeException("Running Exception");
	}
	
	@RequestMapping("/exception02")
	public void testException() throws Exception {
		throw new Exception("Exception happend");
	}
	
	
	@ResponseBody
	@RequestMapping("/user")
	public User toJson() {
		User user = new User();
		user.setId(10086);
		user.setUsername("狗化名");
		return user;
	}
	
}
