package com.interview.MultiTrhreading;

import java.util.concurrent.TimeUnit;

public class Task implements Runnable {

	private String name;
	
	public Task(String name) {
		this.name = name;
	}
	
	public String getName() {
        return name;
    }
	@Override
	public void run() {
		try {
			Long duration = (long)(Math.random() * 10);
			System.out.println("Exceuting  :" + name);
			TimeUnit.SECONDS.sleep(duration);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
