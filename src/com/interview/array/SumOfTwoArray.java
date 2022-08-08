package com.interview.array;

import java.util.Scanner;

public class SumOfTwoArray {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int[] arr1 = new int[n1];

		for(int i = 0;i < arr1.length;i++) {
			arr1[i] = scan.nextInt();
		}

		int n2 = scan.nextInt();
		int[] arr2 = new int[n2];

		for(int i =0;i<arr2.length;i++) {
			arr2[i] = scan.nextInt();
		}
		sumOfTwoarray(arr1, arr2, n1, n2);

	}
	public static void sumOfTwoarray(int[] arr1,int[] arr2,int n1,int n2) {
		int[] sum = new int[n1 > n2 ? n1 : n2];
		int carry = 0;
		int i = arr1.length -1;
		int j = arr2.length - 1;
		int k = sum.length - 1;
		
		while(k>=0) {
			int digit = carry;
			
			if(i>=0) {
				digit = digit + arr1[i];
			}
			
			if(j>=0) {
				digit = digit + arr2[j];
			}
			
			carry = digit/10;
			digit = digit%10;
			
			sum[k] = digit;
			i--;
			j--;
			k--;
		}
		
		if(carry!=0) {
			System.out.println(carry);
		}
		
		for(int value:sum) {
			System.out.println(value);
		}
		
	}

}
