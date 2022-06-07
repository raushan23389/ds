package com.learning.linkedlist;

import java.util.LinkedList;

import com.learning.arraylist.Employee;

public class JdkLinkedList {

	public static void main(String[] args) {
		
		Employee janeJones = new Employee("janes", "jones", 123);
		Employee johnDoe = new Employee("john", "Doe", 4567);
		Employee marrySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		
		LinkedList<Employee> list = new LinkedList<>();
		list.addFirst(janeJones);
		list.addFirst(johnDoe);
		list.addFirst(marrySmith);
		list.addFirst(mikeWilson);
		
		list.forEach(emp -> System.out.print(emp));
		
		Employee billEnd = new Employee("bill", "End", 78);
		
		list.add(billEnd);
		list.forEach(emp -> System.out.print(emp));
	}
}
