package com.interview.array;

import java.util.Scanner;

public class DifferenceOfTwoArray {
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
		differenceOfArray(arr1, arr2, n1, n2);
	}

	private static void differenceOfArray(int[] arr1, int[] arr2, int n1, int n2) {
		int diff[]= new int[n2];
		int carry = 0;
		
		int i = arr1.length-1;
		int j = arr2.length-1;
		int k = diff.length-1;
		
		while(k>=0) {
			int digit = 0;
			int arr1Value = i>=0 ? arr1[i]:0;
			
			if(arr2[j]+carry>=arr1Value) {
				digit = arr2[j]+carry - arr1Value;
				carry = 0;
			}
			else {
				digit = arr2[j] + carry + 10 - arr1Value;
				carry = -1;
			}
			
			diff[k] = digit;
			i--;
			j--;
			k--;
		}
		
		int index = 0;
		while(index < diff.length) {
			if(diff[index]==0) {
				index++;
			}
			else {
				break;
			}
		}
		
		while(index<diff.length) {
			System.out.println(diff[index]);
			index++;
		}
	}
}
