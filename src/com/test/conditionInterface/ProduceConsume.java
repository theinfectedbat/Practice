package com.test.conditionInterface;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProduceConsume {
	public static void main(String[] args) {
		int capacity = 5;
		// shared object
		Buffer buffer = new Buffer(capacity);
		Thread t1 = new Thread(new Producer(buffer, capacity), "Producer");
		Thread t2 = new Thread(new Consumer(buffer, capacity), "Consumer");
		t1.start();
		t2.start();
	}

	// Producer class to add elements to buffer
	static class Producer implements Runnable {
		Buffer buffer;
		int capacity;

		Producer(Buffer buffer, int capacity) {
			this.buffer = buffer;
			this.capacity = capacity;
		}

		@Override
		public void run() {
			for (int i = 1; i <= capacity; i++) {
				try {
					buffer.put(i);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	// Consumer class to remove elements from buffer
	static class Consumer implements Runnable {
		Buffer buffer;
		int capacity;

		Consumer(Buffer buffer, int capacity) {
			this.buffer = buffer;
			this.capacity = capacity;
		}

		@Override
		public void run() {
			for (int i = 1; i <= capacity; i++) {
				try {
					System.out.println("Item removed- " + buffer.take());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	static class Buffer {
		private Object[] items;
		final Lock lock = new ReentrantLock();
		// Conditions
		final Condition Full = lock.newCondition();
		final Condition Empty = lock.newCondition();
		int putptr, takeptr, count;

		public Buffer(int capacity) {
			items = new Object[capacity];
		}

		public void put(Object x) throws InterruptedException {
			lock.lock();
			try {
				while (count == items.length) {
					Full.await();
				}
				items[putptr] = x;
				System.out.println("Putting- " + x);
				if (++putptr == items.length) {
					putptr = 0;
				}
				++count;
				Empty.signal();
			} finally {
				lock.unlock();
			}
		}

		public Object take() throws InterruptedException {
			lock.lock();
			try {
				while (count == 0) {
					Empty.await();
				}
				Object item = items[takeptr];
				if (++takeptr == items.length) {
					takeptr = 0;
				}
				--count;
				Full.signal();
				return item;
			} finally {
				lock.unlock();
			}
		}
	}

}
