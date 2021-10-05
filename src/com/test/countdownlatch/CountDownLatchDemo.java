package com.test.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
	public static void main(String[] args) throws InterruptedException {
		
	
	CountDownLatch latch = new CountDownLatch(4);
	WorkerThread wt1= new WorkerThread(latch);
	WorkerThread wt2= new WorkerThread(latch);
	WorkerThread wt3= new WorkerThread(latch);
	WorkerThread wt4= new WorkerThread(latch);
	
	Thread t1= new Thread( wt1,"Thread1");
	Thread t2= new Thread( wt2,"Thread2");
	Thread t3= new Thread( wt3,"Thread3");
	Thread t4= new Thread( wt4,"Thread4");
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	
	latch.await();
	System.out.println("hello");
	}

}
