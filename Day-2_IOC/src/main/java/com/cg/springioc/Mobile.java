package com.cg.springioc;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stub
		 * 
		 * // Object creation for Airtel Sim s=new Airtel(); s.calling(); s.data();
		 * 
		 * 
		 * // Object creation for Jio Sim s1=new Jio(); s.calling(); s.data();
		 */
		
		ApplicationContext a=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config.......Loaded.....");
		Sim obj=a.getBean("sim",Sim.class);
		obj.calling();
		obj.data();
		
		
		  /*Jio obj1=(Jio)a.getBean("jio");
		  obj1.calling();
		  obj1.data();*/
		 
		
		 
	}

}
