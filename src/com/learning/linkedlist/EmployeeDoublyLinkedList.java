package com.learning.linkedlist;

import com.learning.arraylist.Employee;

public class EmployeeDoublyLinkedList {
	
	private EmployeeDoublyNode head;
	private int size;
	private EmployeeDoublyNode tail;
	
	public void addToFront(Employee employee) {
		EmployeeDoublyNode node = new EmployeeDoublyNode(employee);
		node.setNext(head);
		
		if(head == null) {
			tail = node;
		}
		else {
			head.setPrevious(node);
		}
		head = node;
		size++;
	}
	
	public void addToEnd(Employee employee) {
		EmployeeDoublyNode node = new EmployeeDoublyNode(employee);
		if(tail == null) {
			head = node;
		}
		else {
			tail.setNext(node);
			node.setPrevious(tail);
		}
		tail = node;
		size++;
	}
	
	public EmployeeDoublyNode removeFromFront() {
		if(isEmpty()) {
			return null;
		}
		
		EmployeeDoublyNode removedNode = head;
		
		if(head.getNext() == null) {
			tail = null;
		}
		else {
			head.getNext().setPrevious(null);
		}
		head = head.getNext();
		size--;
		removedNode.setNext(null);
		return removedNode;
	}
	
	public EmployeeDoublyNode removeFromEnd() {
		if(isEmpty()) {
			return null;
		}
		
		EmployeeDoublyNode remoDoublyNode = tail;
		
		if(tail.getPrevious() == null) {
			head = null;
		}
		else {
			tail.getPrevious().setNext(null);
		}
		tail = tail.getPrevious();
		size--;
		remoDoublyNode.setPrevious(null);
		return remoDoublyNode;
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return head == null && tail == null;
	}

	public void printList() {
		EmployeeDoublyNode current = head;
		System.out.print("HEAD <-> ");
		while(current!=null) {
			System.out.print(current);
			System.out.print(" <-> ");
			current = current.getNext();
		}
		System.out.println("null");
	}
}
