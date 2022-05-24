package com.learning.linkedlist;

import com.learning.arraylist.Employee;

public class Main {

	public static void main(String[] args) {
		
		Employee janeJones = new Employee("janes", "jones", 123);
		Employee johnDoe = new Employee("john", "Doe", 4567);
		Employee marrySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		
		EmployeeLinkedList list = new EmployeeLinkedList();
		list.addToFront(janeJones);
		list.addToFront(johnDoe);
		list.addToFront(marrySmith);
		list.addToFront(mikeWilson);
		
		list.printList();
		System.out.println(list.getSize());
		System.out.println(list.isEmpty());
		
		list.removeFromFront();
		System.out.println(list.getSize());
		list.printList();
	}
}
