package com.interview.MultiTrhreading;

public class OddPrint implements Runnable {
	int num;
	public OddPrint(int num) {
		this.num = num;
	}
	
	@Override
	public void run() {
		for(int i=1;i<50;i++) {
		if(num%2 != 0) {
			System.out.println("Odd Number" + num);
		}
		num++;
	}
		
	}
	
}
  

