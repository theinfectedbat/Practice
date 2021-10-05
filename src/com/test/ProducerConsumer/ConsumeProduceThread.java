package com.test.ProducerConsumer;

public class ConsumeProduceThread {
	public static void main(String[] args) {
		Factory factory = new Factory();
		 new ConsumerThread(factory, 15).start();
		 new ProducerThread(factory, 10).start();
	}

}
