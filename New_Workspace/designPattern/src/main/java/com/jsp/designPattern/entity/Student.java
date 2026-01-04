package com.jsp.designPattern.entity;

public class Student {

	private static Student stu=new Student();
	
	private Student() {
		System.out.println("Object of studnt from Early istansiation");
	}
	
	public static Student getObj(){
		return stu;
	}
	
}
