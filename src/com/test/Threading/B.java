package com.test.Threading;

class A{
	A(){
		System.out.println("A");
	}
}

public class B extends A {
public static void main(String[] args) {
	B b= new B();
}
}
