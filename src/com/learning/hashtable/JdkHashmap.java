package com.learning.hashtable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.learning.arraylist.Employee;

public class JdkHashmap {
	
	public static void main(String[] args) {
	
	Employee janeJones = new Employee("janes", "jones", 123);
	Employee johnDoe = new Employee("john", "Doe", 4567);
	Employee marySmith = new Employee("Mary", "Smith", 22);
	Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
	
	Map<String, Employee> hashmap = new HashMap<>();
	
	hashmap.put("jones", janeJones);
	hashmap.put("Doe", johnDoe);
	hashmap.put("Smith", marySmith);
	hashmap.put("Wilson", mikeWilson);
//	
//	Iterator<Employee> itr = hashmap.values().iterator();
//	
//	while (itr.hasNext()) {
//		System.out.println(itr.next());
//		
//	}
	

	
	hashmap.putIfAbsent("jones", mikeWilson);
	hashmap.forEach((k,v)-> System.out.println(k  +v));
	System.out.println(hashmap.containsKey("Smith"));
}
	
}
