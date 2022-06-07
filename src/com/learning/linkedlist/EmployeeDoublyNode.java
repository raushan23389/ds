package com.learning.linkedlist;

import com.learning.arraylist.Employee;

public class EmployeeDoublyNode {
	
	private Employee employee;
	private EmployeeDoublyNode next;
	private EmployeeDoublyNode previous;
	
	public EmployeeDoublyNode getPrevious() {
		return previous;
	}

	public void setPrevious(EmployeeDoublyNode previous) {
		this.previous = previous;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public EmployeeDoublyNode getNext() {
		return next;
	}

	public void setNext(EmployeeDoublyNode next) {
		this.next = next;
	}

	public EmployeeDoublyNode(Employee employee) {
		super();
		this.employee = employee;
	}
	
	public String toString() {
		
		return employee.toString();
	}

}
