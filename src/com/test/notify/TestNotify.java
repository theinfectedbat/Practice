package com.test.notify;

public class TestNotify {
	public static void main(String[] args) throws InterruptedException {
		Notify1 nf1 = new Notify1();
		Notify2 nf2 = new Notify2(nf1);
		Notify3 nf3 = new Notify3(nf1);

		Thread t1 = new Thread(nf1, "Thread-1");
		Thread t2 = new Thread(nf2, "Thread-2");
		Thread t3 = new Thread(nf3, "Thread-3");

		t1.start();
		t2.start();
		Thread.sleep(1000);
		t3.start();
	}

}
