package com.interview.array;

import java.util.Scanner;

public class SpanOfArray {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int[] intArray = new int[n];
	for(int i =0;i<intArray.length;i++) {
		intArray[i] = scan.nextInt();
		
	}
	System.out.println(spanOfArray(intArray));
	
	
}

public static int spanOfArray(int[] intArray) {
	int max =intArray[0];
	int min = intArray[0];
	for(int i =1;i<intArray.length;i++) {
		if(max < intArray[i]) {
			max = intArray[i];
		}
		if(min > intArray[i]) {
			min = intArray[i];
		}
	}
	int span = max - min;
	return span;
}
}
