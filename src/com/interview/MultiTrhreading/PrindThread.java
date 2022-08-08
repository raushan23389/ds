package com.interview.MultiTrhreading;

public class PrindThread {
	
	public void printThread1() {
		int counter = 1;
		while(counter <=5) {
			System.out.println("thread1");
			counter++;
			
		}
	}
	public void printThread2() {
		int counter = 1;
		while(counter <=5) {
			System.out.println("thread2");
			counter++;
			
		}
	}
	public void printThread3() {
		int counter = 1;
		while(counter <=5) {
			System.out.println("thread3");
			counter++;
		}
	}
	public static void main(String[] args) throws InterruptedException {
		PrindThread main = new PrindThread();
		Thread t1 = new Thread(new  Runnable() {
			public void run() {
				main.printThread1();
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				main.printThread2();
			}
		});
		
		Thread t3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				main.printThread3();
				
			}
		});
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
	}
}
