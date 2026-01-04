package com.jsp.designPattern.entity;

public class SubClass implements Parent,Inter{

	@Override
	public void nonStatic() {
		System.out.println("betta kar diya ovveride dekh bkl");
		int a2 = Parent.a ;
		System.out.println(a2);
	}
	
	
	
	
	public SubClass() {
		
		super(); /// super-Call-Stmt points towards the object class
	}



	public void fuck() {
			System.out.print("do u want to crack a exam ");
			
			System.err.print("?");
	}
	
	
	public static void main(String[] args) {
		System.out.println();
		
		System.out.println(Parent.a);
		
		SubClass s1 = new SubClass();
		s1.nonStatic();
		
		
		s1.fuck();
		
		
		
	}

}
