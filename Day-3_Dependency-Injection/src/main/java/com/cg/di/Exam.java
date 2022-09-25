package com.cg.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Student s=new Student(); s.setStudentName("Pankaj Manjare"); s.display();
		 */
		
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		Student s=c.getBean("s",Student.class);
		s.display();
		
		Student s1=c.getBean("s1",Student.class);
		s1.display();
	}

}
