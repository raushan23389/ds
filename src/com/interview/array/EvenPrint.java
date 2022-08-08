package com.interview.array;

public class EvenPrint implements Runnable {

	int num;
	public EvenPrint(int num) {
		this.num = num;
	}
	
	@Override
	public void run() {
		for(int i=1;i<50;i++) {
		if(num%2 == 0) {
			System.out.println("Even Number" + num);
			
		}
		num ++;
	}
	}
}
