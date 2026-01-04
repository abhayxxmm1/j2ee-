package com.jsp.designPattern.entity;

public class Developer {
	
	private static Developer dev;
	
	/// ifsa
	private Developer() {
		System.out.println("developer from lazy istansiation");
	}
	
	public static Developer getDevIsnt() {
		if (dev==null)
			 dev=new Developer();
		
		return dev;
	}
	
}
