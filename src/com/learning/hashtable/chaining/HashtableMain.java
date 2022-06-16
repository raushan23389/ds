package com.learning.hashtable.chaining;

import com.learning.arraylist.Employee;

public class HashtableMain {

	public static void main(String[] args) {
		
		Employee janeJones = new Employee("janes", "jones", 123);
		Employee johnDoe = new Employee("john", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		
		
		
		ChainedHashtable hashtable = new ChainedHashtable();
		hashtable.put("jones", janeJones);
		hashtable.put("Doe", johnDoe);
		hashtable.put("Wilson", mikeWilson);
		hashtable.put("Smith", marySmith);
		
		//hashtable.printHashtable();
		
		hashtable.remove("jones");
//		hashtable.printHashtable();
		hashtable.printHashtable();
		//System.out.println(hashtable.get("Smith"));
		
	}
}
