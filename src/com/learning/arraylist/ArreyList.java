package com.learning.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArreyList {

	public static void main(String[] args) {
		
		List<Employee> listOfEmployees = new ArrayList<>();
		
		listOfEmployees.add(new Employee("janes", "jones", 123));
		listOfEmployees.add(new Employee("john", "Doe", 456));
		listOfEmployees.add(new Employee("Mary", "Smith", 789));
		listOfEmployees.add(new Employee("Mike", "Wilson", 234));
		
		
//		
//		System.out.println(listOfEmployees.get(1));
//		
//		System.out.println(listOfEmployees.isEmpty());
		
		listOfEmployees.set(1, new Employee("john", "Adams", 339));
	
		
		System.out.println(listOfEmployees.size());
		
		listOfEmployees.add(3,new Employee("john", "Doe", 878));
		listOfEmployees.forEach(employee -> System.out.println(employee));
		
		Employee[] employeeArray = listOfEmployees.toArray(new Employee[listOfEmployees.size()]);
		for (Object employee : employeeArray) {
			System.out.println(employee);
		}
		
		System.out.println(listOfEmployees.contains(new Employee("Mary", "Smith", 789)));
		System.out.println(listOfEmployees.indexOf(new Employee("john", "Doe", 456)));
		
		listOfEmployees.remove(2);
		listOfEmployees.forEach(employee -> System.out.println(employee));
		
	}
}
