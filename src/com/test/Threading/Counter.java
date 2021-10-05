package com.test.Threading;
import java.util.concurrent.atomic.AtomicInteger;

public class Counter extends Thread {
	//int count = 0;
	 AtomicInteger count;
	
	 Counter()
	    {
	        count = new AtomicInteger();
	    }
	 
    // method which would be called upon
    // the start of execution of a thread
    public  void run()
    {
 
        int max = 1_000_00_000;
 
        // incrementing counter total of max times
        for (int i = 0; i < max; i++) {
            //count++;
        	 count.addAndGet(1);
        }
    }

}
