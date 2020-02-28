package gzc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import gzc.controller.UserController;

public class TestController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserController uc = (UserController) appCon.getBean("userController");
		uc.test();
	}

}
