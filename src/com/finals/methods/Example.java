package com.finals.methods;

public class Example {

	final void getExample() {
		System.out.println("This is final method");
	}
	
	public static void main(String[] args) {
		
		Example example=new Example();
		example.getExample(); //method calling
	}

}
