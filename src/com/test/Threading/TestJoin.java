package com.test.Threading;

public class TestJoin {
	String S;

	TestJoin(String S) {
		this.S = S;
	}

	public  void test() {
		System.out.println(S+"M1");
		System.out.println(S+"M2");
	}

	public static void main(String[] args) throws InterruptedException {
		TestJoin tj1 = new TestJoin("O1");
		TestJoin tj2 = new TestJoin("O2");

		Thread r1 = new Thread() {

			@Override
			public void run() {
				tj1.test();

			}
		};

		Thread r2 = new Thread() {

			@Override
			public void run() {
				tj2.test();

			}
		};
		r1.start();
		r2.start();
		

	}

}
