package com.test.Threading;

public class OddEvenThread {

	Boolean isOddThread = false;
	int count = 0;

	synchronized void oddThread() throws InterruptedException {
		while (count < 6) {
			while (!isOddThread) {
				wait();
			}
			System.out.println("Odd Thead" + count);
			count++;
			isOddThread=false;
			notify();
		}
		

	}

	synchronized void evenThread() throws InterruptedException {
		while (count < 6) {
			while (isOddThread) {
				wait();
			}
			System.out.println("even Thead" + count);
			count++;
			isOddThread=true;
			notify();
			
		}
		

	}

	public static void main(String[] args) {
		OddEvenThread oet= new  OddEvenThread();
		Runnable r1=()->{
			try {
				oet.oddThread();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		};
		
		Runnable r2=()->{
			try {
				oet.evenThread();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		};
		new Thread (r1,"Thread 1").start();
		new Thread (r2,"Thread 2").start();
		
	}

}
