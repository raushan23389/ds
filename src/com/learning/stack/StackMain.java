package com.learning.stack;

import com.learning.arraylist.Employee;

public class StackMain {

	public static void main(String[] args) {
		
		ArrayStack stack = new ArrayStack(10);
		
		stack.push(new Employee("janes", "jones", 123));
		stack.push(new Employee("john", "Doe", 4567));
		stack.push(new Employee("Mary", "Smith", 22));
		stack.push(new Employee("Mike", "Wilson", 3245));
		
		//stack.printStack();
		
		stack.pop();
		stack.peek();
		System.out.println(stack.size());
		stack.printStack();
		
		
	}
}
