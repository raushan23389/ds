package com.interview.array;

import java.util.EmptyStackException;
import java.util.List;

import com.learning.arraylist.Employee;


public class StackUsingArray {

	private Employee[] stack;
	private int top;
	
	public StackUsingArray(int capacity) {
		stack = new Employee[capacity];
	}
	
	public void push(Employee employee) {
		if(top==stack.length) {
			Employee[] newArray = new Employee[2*stack.length];
			System.arraycopy(stack, 0, newArray, 0, stack.length);
			stack = newArray;
		}
		
		stack[top++] = employee;
	}
	
	public Employee pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		Employee employee = stack[--top];
		stack[top] = null;
		return employee;
	}
	
	public Employee peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return stack[top-1];
	}
	
	public void printStack() {
		for(int i =top-1;i>=0;i--) {
			System.out.println(stack[i]);
		}
	}

	private boolean isEmpty() {
		
		return top==0;
	}
	

	public static void main(String[] args) {
		StackUsingArray stack = new StackUsingArray(10);
		
		stack.push(new Employee("janes", "jones", 123));
		stack.push(new Employee("john", "Doe", 4567));
		stack.push(new Employee("Mary", "Smith", 22));
		stack.push(new Employee("Mike", "Wilson", 3245));
		
		stack.printStack();
		
		stack.pop();
//		stack.peek();
//		System.out.println(stack.size());
		stack.printStack();
		
	}
}
