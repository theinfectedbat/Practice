package com.test.ProducerConsumer;

public class ConsumerThread extends Thread{
	Factory f;
	int amt;
	public ConsumerThread(Factory f, int amt) {
		this.f=f;
		this.amt=amt;
	}
	
	public void run() {
		try {
			f.consume(amt);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
