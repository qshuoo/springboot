package com.qshuoo.handle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class MyException {
	
	private static final Logger logger = LoggerFactory.getLogger(MyException.class);
	
	@ResponseBody
	@ExceptionHandler({RuntimeException.class})
	public String catchRuntimeException(RuntimeException exception) {
		logger.error("RuntimeException happend during running");
		return "exception : " + exception.getMessage();
	}

}
