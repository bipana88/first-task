package com.nonstatic;

public class Calculate {
	int a=100;
	int b=200;
	void add() {
		int add= a+b;
		System.out.println("Addition: " + add);
	}
	void sub() {
		int sub= b-a;
		System.out.println("Subtraction: " + sub);
	}
	void mult() {
		int mult= a*b;
		System.out.println("Multiplication: " + mult);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculate cal= new Calculate();
cal.add();
cal.sub();
cal.mult();
	}

}
