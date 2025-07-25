package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Employee e=new Hr();
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		Student s=(Student)ac.getBean("sbean");//rollno, name
		s.display();
	}

}
