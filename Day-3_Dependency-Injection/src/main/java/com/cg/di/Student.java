package com.cg.di;

//1.Dependency in terms of literals
public class Student {
	
	//variable
	private String StudentName;
	private int rollno;
	
	//DI using Constructor
	//constructor-arg name is passed in beans.xml
	public Student(String StudentName, int rollno) 
	{
		super();
		StudentName = StudentName;
		this.rollno = rollno;
	}
	
	
	//DI using setters method

	/*
	 * public void setRollno(int rollno) { this.rollno = rollno; }
	 * 
	 * public void setStudentName(String studentName) { StudentName = studentName; }
	 */

	//user defined method
	public void display()
	{
		System.out.println("StudentName is :"+StudentName+" "+"and Roll No Is : "+rollno);
	}

}