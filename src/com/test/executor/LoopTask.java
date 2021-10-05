package com.test.executor;

public class LoopTask implements Runnable {

	private String loopTaskName;

	public LoopTask(String loopTaskName) {
		super();
		this.loopTaskName = loopTaskName;
	}

	@Override
	public void run() {
		System.out.println("Starting " + loopTaskName);
		for (int i = 1; i <= 10; i++) {
			System.out.println("Executing " + loopTaskName + " with " + Thread.currentThread().getName() + "====" + i);
		}
		System.out.println("Ending " + loopTaskName);
	}
}
