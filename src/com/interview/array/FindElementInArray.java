package com.interview.array;

import java.util.Scanner;

public class FindElementInArray {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int[] a = new int[n];
	
	for(int i=0;i<a.length;i++) {
		a[i] = scan.nextInt();
	}
	int d = scan.nextInt();
	System.out.println(findElementInArray(a, d));
	
}

public static int findElementInArray(int[] a,int d) {
	int index = -1;
	
	for(int i=0;i<a.length;i++) {
		if(a[i]==d) {
			index =i;
			break;
		}
		
	}
	return index;
}
}
