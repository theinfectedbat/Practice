package com.test.ProducerConsumer;

public class ProducerThread extends Thread {
	Factory f;
	int amt;
	public ProducerThread(Factory f, int amt) {
		this.f=f;
		this.amt=amt;
	}
	
	public void run() {
		f.produce(amt);
	}

}
