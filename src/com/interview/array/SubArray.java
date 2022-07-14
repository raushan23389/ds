package com.interview.array;

import java.util.Scanner;

public class SubArray {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	
	int[] a = new int[n];
	
	for(int i=0;i<a.length;i++) {
		a[i] = scan.nextInt();
	}
	printSubArray(a);
}

public static void printSubArray(int[] a) {
	for(int i=0;i<a.length;i++) {
		for(int j=i;j<a.length;j++) {
			for(int k =i;k<=j;k++) {
				System.out.println(a[k] + "\n");
			}
			System.out.println();
		}
	}
}
}
