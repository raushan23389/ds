package com.interview.MultiTrhreading;

public class PrintOddEvenUsingTwoThreads {
	
	int counter = 1;
	static int N;
	
	public void printOddNumber() {
		synchronized (this) {
			
			while(counter < N) {
				while(counter % 2 == 0) {
					try {
						wait();
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				System.out.println(counter + " ");
				counter++;
				notify();
			}
		}
	}
	
	public void printEvenNumber() {
		synchronized (this) {
			
			while(counter < N) {
				while(counter % 2 == 1) {
					try {
						wait();
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				System.out.println(counter + " ");
				counter++;
				notify();
			}
			
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		N=10;
		PrintOddEvenUsingTwoThreads main = new PrintOddEvenUsingTwoThreads();
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				main.printEvenNumber();
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				main.printOddNumber();
				
			}
		});
		
		t1.start();
		t2.start();
	}
}
