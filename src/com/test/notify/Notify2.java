package com.test.notify;

public class Notify2 extends Thread {
	Notify1 nf1;
	Notify2(Notify1 nf1){
		this.nf1= nf1;
		
	}
	public void run() {
		synchronized(this.nf1)
        {
            System.out.println
            (Thread.currentThread().getName() + "...starts");
            try {
            	this.nf1.wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println
            (Thread.currentThread().getName() + "...notified");
        }
		
	}

}
