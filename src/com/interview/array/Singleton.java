package com.interview.array;

public class Singleton {

	private static Singleton s = null;
	static int i;
	private Singleton() {
		
	}
	
	public static Singleton getSingletonObject() {
		if(s==null) {
			return new Singleton();
		}
		return s;
	}
	
	
	
	public static void main(String[] args) {
		Singleton s1 = Singleton.getSingletonObject();
		s.i =10;
		Singleton s2 = Singleton.getSingletonObject();
		
		System.out.println(s1==s2);
	}
}
