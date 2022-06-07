package com.learning.linkedlist;

import com.learning.arraylist.Employee;

public class DoublyLinkedListImpl {
	public static void main(String[] args) {
		
		Employee janeJones = new Employee("janes", "jones", 123);
		Employee johnDoe = new Employee("john", "Doe", 4567);
		Employee marrySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		
		
		EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
		list.addToFront(janeJones);
		list.addToFront(johnDoe);
		list.addToFront(marrySmith);
		list.addToFront(mikeWilson);
		
		list.printList();
		
		Employee billEnd = new Employee("bill", "End", 78);
		list.addToEnd(billEnd);
		list.printList();
		System.out.println(list.getSize());
		
		list.removeFromFront();
		list.printList();
		
		list.removeFromEnd();
		list.printList();
	}


}
