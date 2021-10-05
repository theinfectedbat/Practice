package com.test.Threading;

public class DeadLock {
	public static Object o1 = new Object();
	public static Object o2 = new Object();

	public static void main(String[] args) {
		new DeadLock1().start();
		new DeadLock2().start();

	}

	static class DeadLock1 extends Thread {

		public void run() {
			synchronized (o1) {
				System.out.println("Locking Object 01");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (o2) {
					System.out.println("Locking object o2");

				}
			}

		}
	}

	static class DeadLock2 extends Thread {

		public void run() {
			synchronized (o2) {
				System.out.println("Locking Object 02");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				synchronized (o1) {
					System.out.println("Locking object o1");

				}
			}

		}
	}

}
