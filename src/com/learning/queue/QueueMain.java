package com.learning.queue;

import com.learning.arraylist.Employee;

public class QueueMain {

	public static void main(String[] args) {
		
		CircularQueue queue = new CircularQueue(5);
		
		Employee janeJones = new Employee("janes", "jones", 123);
		Employee johnDoe = new Employee("john", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee billEnd = new Employee("Bill", "End", 78);
		
		
		//circular queue
		queue.enqueue(janeJones);
		queue.enqueue(johnDoe);
		queue.dequeue();
		queue.enqueue(marySmith);
		queue.dequeue();
		queue.enqueue(mikeWilson);
		queue.dequeue();
		queue.enqueue(billEnd);
		queue.dequeue();
		queue.enqueue(janeJones);
		
		queue.printQueue();
		
		
		//normal queue
//		queue.enqueue(janeJones);
//		queue.enqueue(johnDoe);
//		queue.enqueue(marySmith);
//		queue.enqueue(mikeWilson);
//		queue.enqueue(billEnd);
////		queue.printQueue();
//		
//		
//		queue.dequeue();
//		queue.dequeue();
//		//queue.printQueue();
//		
//		
//		//System.out.println(queue.peek());
//		
//		queue.dequeue();
//		queue.dequeue();
//		queue.dequeue();
//		//queue.dequeue();
//		
//		queue.enqueue(mikeWilson);
//		
//		queue.printQueue();
		
		
	}
}
