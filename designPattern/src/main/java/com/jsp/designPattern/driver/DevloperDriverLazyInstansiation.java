package com.jsp.designPattern.driver;

import com.jsp.designPattern.entity.Developer;

public class DevloperDriverLazyInstansiation {

	public static void main(String[] args) {
		
		Developer d1=Developer.getDevIsnt();
		Developer d2=Developer.getDevIsnt();
		Developer d3=Developer.getDevIsnt();
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
	}
}
