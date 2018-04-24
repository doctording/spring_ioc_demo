package com.mogong.service;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mogong.service.Director;

//Dependency Injection
//Inverse of Control
public class DirectorServiceTest {

	@Test 
	public void testXX() throws Exception {
		ClassPathXmlApplicationContext ctx = 
			new ClassPathXmlApplicationContext("beans.xml");
		
		Director director = (Director)ctx.getBean("director");
	
		director.direct();
		
		ctx.destroy();
	}

}
