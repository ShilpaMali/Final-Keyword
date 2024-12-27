package com.finals.variable;

public class Test {

	final int c = 25;
	//final int d;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int a; // a is final variable
		// declaration of final variable
		final int b = 10; // 10 value which is stored into b variable
		// initialization of final variable
		System.out.println("final variable value>>" + b); // print or call or access final variable
		// System.out.println(a);
		Test test = new Test();
		System.out.println("value of c is>>" + test.c);
		//b++; we cant change the value of final variable
	}



}
