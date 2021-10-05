package com.test.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadPoolDemo {

	public static void main(String args[]) {
		ExecutorService es = Executors.newSingleThreadExecutor();

		for (int i = 1; i <= 3; i++) {
			LoopTask loopTask = new LoopTask("LoopTask " + i);
			es.execute(loopTask);
		}
		es.shutdown();
	}

}
