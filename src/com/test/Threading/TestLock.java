package com.test.Threading;

import java.util.concurrent.locks.ReentrantLock;

public class TestLock {
	public static void main(String[] args) {
		ReentrantLock lock = new ReentrantLock();
		ReentrantLock lock1 = new ReentrantLock();
		ReEntrantLock ren = new ReEntrantLock(lock);
		ReEntrantLock ren1 = new ReEntrantLock(lock1);
		new Thread(ren, "Thread1").start();
		new Thread(ren1, "Thread2").start();

	}
}
