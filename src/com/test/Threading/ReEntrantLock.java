package com.test.Threading;

import java.util.concurrent.locks.Lock;

public class ReEntrantLock implements Runnable {
	
	Lock lock;
	
	ReEntrantLock (Lock lock){
		this.lock= lock;
	}
	
	public void run() {
		lock.lock();
		for (int i=0; i < 5;i++)
		System.out.println(i);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lock.unlock();
	}

}
