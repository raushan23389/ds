package com.learning.recursion;

final public class Immutable {
	
	private int i;
	
	public Immutable(int i) {
		this.i =i;
	}
	
	public Immutable Modify(int i) {
		
		if(this.i==i) {
			return this;
		}
		else {
			return new Immutable(i);
		}
	}
	
	public static void main(String[] args) {
		Immutable obj = new Immutable(10);
		Immutable obj2 = new Immutable(20);
		Immutable obj3 = obj.Modify(10);
		System.out.println(obj==obj2);
		System.out.println(obj==obj3);
	}
}
