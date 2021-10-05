package com.test.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class WorkerThread extends Thread {
	CountDownLatch latch;

	WorkerThread(CountDownLatch latch) {
		this.latch = latch;

	}

	public void run() {
		System.out.println("Work Completed " + Thread.currentThread());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		latch.countDown();
	}

}
