package com.learning.linkedlist;

import com.learning.arraylist.Employee;

public class EmployeeNode {
	
	private Employee employee;
	private EmployeeNode next;
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public EmployeeNode getNext() {
		return next;
	}

	public void setNext(EmployeeNode next) {
		this.next = next;
	}

	public EmployeeNode(Employee employee) {
		super();
		this.employee = employee;
	}
	
	public String toString() {
		
		return employee.toString();
	}

}
