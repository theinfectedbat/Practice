package com.test.notify;

public class Notify1 extends Thread {
	public void run () {
		
		synchronized(this)
        {
            System.out.println
            (Thread.currentThread().getName() + "...starts");
            try {
                this.wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println
            (Thread.currentThread().getName() + "...notified");
        }
	}

}
