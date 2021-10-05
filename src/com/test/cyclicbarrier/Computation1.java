package com.test.cyclicbarrier;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BrokenBarrierException;

public class Computation1 implements Runnable {
	
	static int mul=0;
	
	public void run () {

		
		mul=2*3;
		try {
			Tester.newBarrier.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
