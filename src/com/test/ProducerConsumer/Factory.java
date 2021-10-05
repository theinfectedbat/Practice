package com.test.ProducerConsumer;

public class Factory {

	private int totalamt;

	public  synchronized void  consume(int amt) throws InterruptedException {
		while (amt < totalamt) {
			wait();
		}
		totalamt-=amt;
		
	}

	public synchronized void produce(int amt) {
		totalamt += amt;
		notify();

	}
}
