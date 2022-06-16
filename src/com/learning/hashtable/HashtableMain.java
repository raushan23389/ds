package com.learning.hashtable;

import com.learning.arraylist.Employee;

public class HashtableMain {

	public static void main(String[] args) {
		
		Employee janeJones = new Employee("janes", "jones", 123);
		Employee johnDoe = new Employee("john", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee billEnd = new Employee("Bill", "End", 78);
		
		
		SimpleHashtable hashtable = new SimpleHashtable();
		hashtable.put("jones", janeJones);
		hashtable.put("Doe", johnDoe);
		hashtable.put("Wilson", mikeWilson);
		hashtable.put("Smith", marySmith);
		
		
		
		hashtable.remove("jones");
		hashtable.printHashtable();
		System.out.println(hashtable.get("Smith"));
		
	}
}
