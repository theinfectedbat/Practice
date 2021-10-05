package com.test.notify;

public class Notify3 extends Thread {
	Notify1 nf1;
	Notify3(Notify1 nf1){
		this.nf1= nf1;
		
	}
	public void run() {
		synchronized(this.nf1)
        {
            System.out.println
            (Thread.currentThread().getName() + "...starts");
            this.nf1.notifyAll();
            System.out.println
            (Thread.currentThread().getName() + "...notified");
        }
		
	}

}
