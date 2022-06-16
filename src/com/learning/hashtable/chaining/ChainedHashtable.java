package com.learning.hashtable.chaining;

import java.util.LinkedList;
import java.util.ListIterator;

import com.learning.arraylist.Employee;

public class ChainedHashtable {
	
	private LinkedList<StoredEmployee>[] hashtable;
	
	public ChainedHashtable() {
		hashtable = new LinkedList[10];
		for(int i = 0; i < hashtable.length; i++) {
			hashtable[i] = new LinkedList<StoredEmployee>();
		}
	}
	
	private int hashKey(String key) {
		//return key.length() % hashtable.length;
		return Math.abs(key.hashCode()) % hashtable.length;
	}
	
	public void put(String key, Employee employee) {
		int hashedKey = hashKey(key);
		hashtable[hashedKey].add(new StoredEmployee(key, employee));
	}
	
	public Employee get(String key) {
		int hashedKey = hashKey(key);
		ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
		StoredEmployee employee = null;
		while(iterator.hasNext()) {
			employee = iterator.next();
			if(employee.key.equals(key)) {
				return employee.employee;
			}
		}
		return null;
	}
	
	public Employee remove(String key) {
		int hashedKey = hashKey(key);
		ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
		StoredEmployee employee = null;
		int index = -1;
		while(iterator.hasNext()) {
			employee = iterator.next();
			index++;
			if(employee.key.equals(key)) {
				break;
			}
		}
		
		if(employee == null) {
			return null;
		}
		else {
			hashtable[hashedKey].remove(index);
		}
		return null;
		
	}
	
	public void printHashtable() {
		for(int i= 0; i<hashtable.length;i++) {
			if(hashtable[i].isEmpty()) {
				System.out.println("position" + i + ": empty");
			}
			
			else {
				System.out.println("position" + i + ": ");
				ListIterator<StoredEmployee> iterator = hashtable[i].listIterator();
				while(iterator.hasNext()) {
					System.out.println(iterator.next().employee);
					System.out.println("->");
				}
				System.out.println("null");
			}
		}
	}
	

}
